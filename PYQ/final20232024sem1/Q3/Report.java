/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author tianlongc
 */
import java.io.*;

public class Report {
    public static void main(String[] args) {
        String inputFile = "oaiset.csv";
        OAIRecord[] data = new OAIRecord[50];
        System.out.println("Loading Dataset...");
        loadRecord(inputFile, data);
        System.out.println("The curated record is as follow.");
        printRecord(cleanRecord(data));
        System.out.println("\nThe summary report is as follow:");
        reportData(cleanRecord(data));
    }
    // file handling
    public static void loadRecord(String inputFile, OAIRecord[] data){
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader(inputFile));
            
            String line = "";
            int index = 0;
            inputStream.readLine(); // skip table header
            
            // Maximum number of records is 50 so index != 50 is necessary if the csv datas more than 50 records
            while ((line = inputStream.readLine()) != null && index != 50) {
                String[] attributes = line.split(",");
                OAIRecord record = new OAIRecord(attributes);
                data[index] = record;
                index++;
            }
            
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    public static OAIRecord[] cleanRecord(OAIRecord[] data){
        // Obtain the size of the clean record array
        int count = 0;
        // I use for enhanced loop for this question since too much data
        // rambang mata sampai tak boleh code sorry
        for (OAIRecord record : data) {
            if (record != null && !record.getStatus().equalsIgnoreCase("deleted")) {
                count++;
            }
        }
        
        OAIRecord[] cleanData = new OAIRecord[count];
        int index = 0;
        for (OAIRecord record : data) {
            if (record != null && !record.getStatus().equalsIgnoreCase("deleted")) {
                cleanData[index] = record;
                index++;
            }
        }

        return cleanData;
    }
    
    public static void printRecord(OAIRecord[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.printf("Record %-3d %s\n",i+1, data[i]);
        }
    }
    
    public static void reportData(OAIRecord[] data){
        /*
            Question: Why don't just use a size of 8 array to capture 8 unique authors?
            The answer is quite funny because when you observed from the expected output
            The unique authors are all collected from each data and print in ascending order
            If we just collect 8 unique authors:
            Our expected output will end up finding
            Abdullah Noorhidawati: 1
            Mohd Zambri Mohamed Makhbul: 3
            Pillai Stefanie Shamila: 5
            Siti Farhana Mohd Ali: 2
            Siti Safuraa Zahirah Shahidan: 2
            Wan Nurazreena Wan Hassan: 7
            Yanti Idaya Aspura Mohd Khalid: 2
            Zamros Yuzadi Mohd Yusof: 2
            which we don't want this output!
        */
        
        // Assume there are 50 unique authors
        String[] uniqueAuthors = new String[50];
        int[] counts = new int[50];
        int uniqueCount = 0; // track the number of unique authors (acts as index)
        
        for (OAIRecord record : data) {
            if (record != null) {
                String[] authors = record.getAuthors();
                for (String author : authors) {
                    if (author != null && !author.isEmpty()) {
                        // Check if the author is already in the array
                        boolean found = false;
                        for (int i = 0; i < uniqueCount; i++) {
                            if (uniqueAuthors[i].equalsIgnoreCase(author)) {
                                counts[i]++;
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            // Add the new author to the array
                            uniqueAuthors[uniqueCount] = author;
                            counts[uniqueCount] = 1;
                            uniqueCount++;
                        }
                    }
                }
            }
        }
        
        // Bubble sort to sort alphabetically
        for (int i = 0; i < uniqueAuthors.length; i++) {
            for (int j = 0; j < uniqueAuthors.length - i - 1; j++) {
                if (uniqueAuthors[j] != null && uniqueAuthors[j+1] != null) {
                    if (uniqueAuthors[j].compareTo(uniqueAuthors[j+1]) > 0){
                        // Swap author names
                        String tempAuthor = uniqueAuthors[j];
                        uniqueAuthors[j] = uniqueAuthors[j+1];
                        uniqueAuthors[j+1] = tempAuthor;

                        // Swap publication counts
                        int tempCount = counts[j];
                        counts[j] = counts[j+1];
                        counts[j+1] = tempCount;
                    }
                }
            }
        }
        
        // Maximum number of authors is 8
        for (int i = 0; i < 8; i++) {
            System.out.printf("%s: %d\n", uniqueAuthors[i], counts[i]);
        }
        
        // List all authors and its count
//        for (int i = 0; i < uniqueAuthors.length; i++) {
//            if (uniqueAuthors[i] != null) {
//                System.out.printf("%s: %d\n", uniqueAuthors[i], counts[i]);
//            }
//        }
    }
}
