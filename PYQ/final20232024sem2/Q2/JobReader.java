/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author tianlongc
 */
import java.io.*;

public class JobReader{
    
    public static void main(String[] args) {
        Job[] jobs = readJobsFromDirectory("job");
        // Change "directory_path" to your directory path
        
        listAllJobs(jobs);
        generateStatistics(jobs);
    }
    
    public static Job[] readJobsFromDirectory(String directory_path){
        // Create a File object for the directory
        File folder = new File(directory_path);
        
        // List all files in the directory
        File[] listOfFiles = folder.listFiles();
        
        // Use listOfFiles.length to obtain the length of array
        Job[] jobs = new Job[listOfFiles.length];
        
        // Check if the directory is not empty and is indeed a directory
        if (listOfFiles != null) {
            int index = 0;
            
            for (File file : listOfFiles) {
                if (file.isFile()) {
                    try{
                        BufferedReader inputStream = new BufferedReader(new FileReader(file));
                        
                        String line = "";
                        while ((line = inputStream.readLine()) != null) {
                            String[] input = line.split(" ");
                            String name = input[1];
                            
                            input = inputStream.readLine().split(" ");
                            String partition = input[1];
                            
                            input = inputStream.readLine().split(" ");
                            String memory = input[1];
                            
                            input = inputStream.readLine().split(" ");
                            String qos = input[1];
                            
                            jobs[index] = new Job(name, partition, memory, qos);
                            index++;
                        }
                        
                        inputStream.close();
                    }catch(FileNotFoundException e){
                        System.out.println("File not found: " + e.getMessage());
                    }catch(IOException e){
                        System.out.println("Error reading file: " + e.getMessage());
                    }
                }
            }
        }else{
            System.out.println("The directory is empty or not a directory");
        }
        return jobs;
    }
    
    public static void listAllJobs(Job[] jobs){
        System.out.println("List of all jobs:");
        for (Job job: jobs) {
            // Both are acceptable since toString() method is properly overridden in the object's class
//            System.out.println(job.toString());
            System.out.println(job);
        }
    }
    
    public static void generateStatistics(Job[] jobs){
        System.out.println("\nPartition Statistics:");
        
        String[] partitions = new String[jobs.length];
        int[] countPartitions = new int[jobs.length];
        int count = 0;
        
        for (int i = 0; i < jobs.length; i++) {
            boolean found = false;
            for (int j = 0; j < count; j++) {
                if (partitions[j].equals(jobs[i].getPartition())) {
                    countPartitions[j]++;
                    found = true;
                    break;
                }
            }
            if (!found){
                // Add the partitions in array
                partitions[count] = jobs[i].getPartition();
                countPartitions[count] = 1;
                count++;
            }
        }
        
        // Order by jobs ASC (for output)
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count-i-1; j++) {
                if (countPartitions[j] > countPartitions[j+1]) {
                    // Swap partition names
                    String tempPartitions = partitions[j];
                    partitions[j] = partitions[j+1];
                    partitions[j+1] = tempPartitions;
                    
                    // Swap corresponding job counts
                    int tempCount = countPartitions[j];
                    countPartitions[j] = countPartitions[j+1];
                    countPartitions[j+1] = tempCount;
                }
            }
        }
        
        for (int i = 0; i < count; i++) {
            System.out.printf("%s: %d jobs\n",partitions[i], countPartitions[i]);
        }
        
        System.out.println("\nQoS Statistics:");
        
        String[] qos = new String[jobs.length];
        int[] countQoS= new int[jobs.length];
        int cnt = 0;
        
        for (int i = 0; i < jobs.length; i++) {
            boolean found = false;
            for (int j = 0; j < cnt; j++) {
                if (qos[j].equals(jobs[i].getQoS())) {
                    countQoS[j]++;
                    found = true;
                    break;
                }
            }
            if (!found){
                // Add the qos in array
                qos[cnt] = jobs[i].getQoS();
                countQoS[cnt] = 1;
                cnt++;
            }
        }
        // If you dont want to follow the output then use this:
//        for (int i = 0; i < cnt; i++) {
//            System.out.printf("%s: %d jobs\n",qos[i], countQoS[i]);
//        }
        
        for (int i = cnt-1; i >= 0; i--) {
            System.out.printf("%s: %d jobs\n",qos[i], countQoS[i]);
        }
    }
}
