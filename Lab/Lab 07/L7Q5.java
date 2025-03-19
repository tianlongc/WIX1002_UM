/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author tianlongc
 */
import java.io.*;

public class L7Q5 {
    public static void main(String[] args) {
        
        try{
            ObjectInputStream inputStream = new ObjectInputStream (new FileInputStream("person.dat"));
            
            // Obtain the size of the array
            final int TotalNumberofRecord = inputStream.readInt();
            
            String Name[] = new String[TotalNumberofRecord];
            int Age[] = new int[TotalNumberofRecord];
            char Gender[] = new char[TotalNumberofRecord];
            int index[] = new int[TotalNumberofRecord];
            
            for (int i = 0; i < TotalNumberofRecord; i++) {
                index[i] = i;
                Name[i] = inputStream.readUTF();
                Age[i] = inputStream.readInt();
                Gender[i] = inputStream.readChar();
            }
            
            // Table header (Output Formatting very important in exams)
            System.out.printf(" %-14s %-5s %-7s \n", "Name", "Age", "Gender");
            
            for (int i = 0; i < index.length; i++) {
                System.out.printf(" %-15s %-4d ", Name[i], Age[i]);
                if (Gender[i] == 'M') {
                    System.out.printf("%-6s \n", "Male");
                } else{
                    System.out.printf("%-6s \n", "Female");
                }
            }
            
            // Call Sort Name Alphabetically Method
            sortIndexByName(index, Name);
            
            System.out.println("");
            // Table header
            System.out.printf(" %-14s %-5s %-7s \n", "Name", "Age", "Gender");
            
            // Use the sorted index to order the age and gender in correct position
            for (int i : index) {
                System.out.printf(" %-15s %-4d ", Name[i], Age[i]);
                if (Gender[i] == 'M') {
                    System.out.printf("%-6s \n", "Male");
                } else{
                    System.out.printf("%-6s \n", "Female");
                }
            }
            
            inputStream.close();
        } catch (FileNotFoundException e){
            System.out.println("File was not found");
        } catch (IOException e){
            System.out.println("Problem with file input");
        }  
    }
    
    public static void sortIndexByName(int[] index, String[] Name){
        // Implements bubble sort in comparing elements
        for (int i = 0; i < index.length; i++) {
            for (int j = 0; j < index.length - i - 1; j++) {
                int before = index[j];
                int after = index[j+1];
                // compareTo is used to compare Strings value
                if (Name[before].compareTo(Name[after]) > 0){
                    index[j] = after;
                    index[j+1] = before;
                }
            }
            
        }
    }
}
