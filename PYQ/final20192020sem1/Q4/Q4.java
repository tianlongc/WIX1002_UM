/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author tianlongc
 */
import java.io.*;

public class Q4 {
    public static void main(String[] args) {
        // a)
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader("sampleLog.txt"));
            
            String line = "";
            int numLine = 0;
            // Obtain the length of the array
            while ((line = inputStream.readLine()) != null) {
                numLine++;
            }
            
            // re-read the file
            inputStream = new BufferedReader(new FileReader("sampleLog.txt"));
            String[][] records = new String[numLine][22]; // 22 attributes
            
            System.out.println("Reading from log file...");
            System.out.println("****************************************");
            System.out.println("Records read from log file");
            
            int index = 0;
            while ((line = inputStream.readLine()) != null) {
                // Extract data
                records[index] = line.split("\\s+");
                index++;
            }
            
            for (int i = 0; i < records.length; i++) {
                System.out.printf("\nRecord %d:\n", (i+1));
                // second dimension of array size
                for (int j = 0; j < records[i].length; j++) {
                    System.out.printf("    %s\n", records[i][j]);
                }
            }
            
            System.out.println("\ntotal records read: " + numLine);
            System.out.println("\n****************************************");
            
            // b)
            System.out.println("Print user submission stat\n");
            System.out.printf("%-20s%s\n", "User", "Jobs Submitted");
            System.out.printf("%-20s%s\n", "----", "--------------");
            
            String[] users = new String[numLine];
            int[] usersJobSubmitted = new int[numLine];
            int count = 0; // to find out how many users
            // Read only type S record (15 attributes) --> Find ;S;
            // Read the last element of second attribute --> Extract user
            for (int i = 0; i < records.length; i++) {
                // Read only type S record (15 attributes) --> Find S
                // Example: 00:45:00;S;14126.ce2.dicc.um.edu.my;user=weng 
                // S is placed at the index of 9 which starts from 0 
                if (records[i][1].charAt(9) == 'S') {
                    String[] attributes = records[i][1].split("[;=]+");
                    // Debugging purpose to find out which index is user
//                    System.out.println(temp[4]); 
                    boolean found = false; // To track repeated submission by user
                    for (int j = 0; j < count; j++) {
                        if (users[j].equalsIgnoreCase(attributes[4])) {
                            usersJobSubmitted[j]++;
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        // Add the user to the array
                        users[count] = attributes[4];
                        usersJobSubmitted[count] = 1;
                        count++;
                    }
                }
            }
            
            for (int i = 0; i < count; i++) {
                System.out.printf("%-20s%s\n", users[i], usersJobSubmitted[i]);
            }
            
            System.out.println("\n****************************************");
            
            // c) As the question mentioned about S type and E type record
            // I dont know it is valid for us to use Q type record to extract data
            System.out.println("Print jobs status");
            // Table header (Output formatting)
            System.out.printf("\n%-11s%-23s%-23s%-23s\n", "Job ID", "Submitted (queue)", "Started (start time)", "Exited (end time/error)");
            System.out.printf("%-11s%-23s%-23s%-23s\n", "------", "-----------------", "--------------------", "-----------------------");
            
            for (int i = 0; i < records.length; i++) {
                if (records[i][1].charAt(9) == 'S') {
                    String[] attributes = records[i][1].split("[;=]+");
                    // Can actually use replaceAll and trim
                    String[] temp = attributes[2].split("\\.ce2\\.dicc\\.um\\.edu\\.my");
                    String jobID = temp[0];
                    String queue = records[i][4].replace("queue=", "");
                    String startTime = records[i][8].replace("start=", "");
                    String end = "null";
                    
                    for (int j = 0; j < records.length; j++) {
                        String[] elements = records[j][1].split("[;=]+");
                        String[] tempEJobID = elements[2].split("\\.ce2\\.dicc\\.um\\.edu\\.my");
                        if (records[j][1].charAt(9) == 'E' && jobID.equalsIgnoreCase(tempEJobID[0])) {
                            int exit_status = Integer.parseInt(records[j][17].replace("Exit_status=", ""));
                            if (exit_status == 1) {
                                end = records[j][16].replace("end=", "");
                            }else{
                                end = "Error: Exit Status " + exit_status;
                            }
                            break; // Exit the loop once the matching end record is found
                        }
                    }
                    System.out.printf("%-11s%-23s%-23s%-23s\n", jobID, "Y (" + queue + ")", "Y (" + startTime + ")", end);
                }
            }
            
            System.out.println("\n****************************************");
            
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
