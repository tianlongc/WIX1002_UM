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

public class Q3Main {
    public static void main(String[] args) {
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader("student.txt"));
            
            String[] names = new String[10];
            double[] marks = new double[10];
            
            String line = "";
            int index = 0;
            while ((line = inputStream.readLine()) != null) {
                String[] input = line.split(",");
                names[index] = input[0];
                marks[index] = Double.parseDouble(input[1]);
                index++; // pass to next index
            }
            
            // Search highest and lowest mark by taking the index
            // Why do so? Because each data like names and marks is represented by each same index
            // Absent = -1
            int highestIndex = 0;
            int lowestIndex = 0;
            int absent = 0;
            for (int i = 0; i < marks.length; i++) {
                if (marks[highestIndex] < marks[i]) {
                    highestIndex = i;
                }
                if (marks[lowestIndex] > marks[i] && marks[i] != -1) {
                    lowestIndex = i;
                }
                if (marks[i] == -1) {
                    absent++;
                }
            }
            
            System.out.printf("The student with the highest mark : %s %.0f\n", names[highestIndex], marks[highestIndex]);
            System.out.printf("The student with the lowest mark : %s %.0f\n", names[lowestIndex], marks[lowestIndex]);
            System.out.println("The number of students who were absent from the exam : " + absent);
            
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
