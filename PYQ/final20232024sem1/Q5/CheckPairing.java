/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
import java.io.*;

public class CheckPairing {
    public static void main(String[] args) {
        String[][] participants = new String[4][4]; 
        char[] seating = new char[4];
        
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader("participants.txt"));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("grouping.txt"));
//            participants[i] = line.split(","): Stores the split data (an array of strings) in the i-th row of the participants array.
//            i++: Moves to the next row in the participants array.
            String line = "";
            int index = 0;
            while ((line = inputStream.readLine()) != null) {
                participants[index] = line.split(",");
                index++;
            }
            
            // Output formatting I die i guess
            for (int i = 0; i < participants.length; i++) {
                System.out.printf("%-12s%-4s%-4s%-33s\n",participants[i][0], participants[i][1], participants[i][2], participants[i][3]);
            }
            
            // b) Standardize the input refer LeeKahSing
            // index 3 represents address so clean the address (STANDARDIZE)
            for (int i = 0; i < participants.length; i++) {
                // concat all parts into a word 
                participants[i][3] = participants[i][3].toLowerCase().replaceAll(" ", "").trim();
            }
            
            // Verify grouping
            if (participants[0][3].equals(participants[1][3]) && participants[2][3].equals(participants[3][3])){
                System.out.println("Participants are in pairs");
                // Facing each other
                seating[0] = 'A';
                seating[1] = 'C';
                seating[2] = 'B';
                seating[3] = 'D';
                
                outputStream.printf("Seat %c : %s, %s years old\n", seating[0], participants[0][0], participants[0][2]);
                outputStream.printf("Seat %c : %s, %s years old\n", seating[2], participants[2][0], participants[2][2]);
                outputStream.printf("Seat %c : %s, %s years old\n", seating[1], participants[1][0], participants[1][2]);
                outputStream.printf("Seat %c : %s, %s years old\n", seating[3], participants[3][0], participants[3][2]);
            }
            
            outputStream.close();
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found" + e.getMessage());
        }catch(IOException e){
            System.out.println("Error input and output file: " + e.getMessage());
        }
    }
}
