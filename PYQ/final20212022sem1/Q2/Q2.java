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

public class Q2 {
    public static void main(String[] args) {
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader("diving.txt"));
            
            //(You must determine the number of records in the text file using your program)
            // Get the array length
            int record = 0;
            String line = "";
            // In this case, where 5 row = 1 record, Scanner is easier to use btw
            // read record header which is name
            while ((line = inputStream.readLine()) != null) {
                // read record details which is country + 3 scores row
                for (int i = 0; i < 4; i++) {
                    inputStream.readLine();
                }
                record++;
            }
            
            Diving[] participants = new Diving[record];
            
            // re-read the file
            inputStream = new BufferedReader(new FileReader("diving.txt"));
            
            int index = 0;
            while ((line = inputStream.readLine()) != null) {
                String name = line;
                String country = inputStream.readLine();
                double[][] scores = new double[3][7];
                double[] difficulty = new double[3];
                
                for (int i = 0; i < scores.length; i++) {
                    String[] parts = inputStream.readLine().split(" ");
                    for (int j = 0; j < scores[i].length; j++) {
                        scores[i][j] = Double.parseDouble(parts[j]);
                    }
                    // the last value for each attempt is the difficulty rating
                    difficulty[i] = Double.parseDouble(parts[parts.length-1]);
                }
                
                participants[index] = new Diving(name, country, scores, difficulty);
                index++;
            }
            
            for (int i = 0; i < participants.length; i++) {
                System.out.println(participants[i].toString());
            }
            
            displayWinner(participants);
            
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    public static void displayWinner(Diving[] participants){
        // Sort them according to final score in descending format
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < participants.length-i-1; j++) {
                if (participants[j].getFinalScore() < participants[j+1].getFinalScore()) {
                    Diving temp = participants[j];
                    participants[j] = participants[j+1];
                    participants[j+1] = temp;
                }
            }
        }
        
        System.out.printf("Gold : %s (%s)\n", participants[0].getName(), participants[0].getCountry());
        System.out.printf("Silver : %s (%s)\n", participants[1].getName(), participants[1].getCountry());
        System.out.printf("Bronze : %s (%s)\n", participants[2].getName(), participants[2].getCountry());
    }
}
