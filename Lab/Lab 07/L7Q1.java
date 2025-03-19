/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7;

/**
 *
 * @author tianlongc
 */
import java.io.*;
import java.util.Scanner;

public class L7Q1 {
    public static void main(String[] args) {
        
        // Create a scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        String[] course_code = {"WXES1116","WXES1115","WXES1110","WXES1112"};
        String[] course_name = {"Programming I", "Data Structure", "Operating System", "Computing Mathematics I"};
        
        // insert data into file
        try{
            ObjectOutputStream outputStream = new ObjectOutputStream (new FileOutputStream("coursename.dat"));
            
            for (int i = 0; i < course_code.length; i++) {
                outputStream.writeUTF(course_code[i]);
                outputStream.writeUTF(course_name[i]);
            }
            
            outputStream.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
       
        System.out.print("Enter the course code: ");
        String code = sc.next();
        
        // read data from file
        try{
            ObjectInputStream inputStream = new ObjectInputStream (new FileInputStream("coursename.dat"));
            
            try{
                while (true) {
                    // Read course code and compare
                    String course = inputStream.readUTF();
                    if (course.equalsIgnoreCase(code)) {
                        // inputStream.readUTF for Course Name
                        System.out.println("Course Name: " + inputStream.readUTF());
                        break; // terminates once found the course
                    }
                }
                
            }catch (EOFException e){
                System.out.println("Course was not found");
            }
            
            inputStream.close();
        } catch (FileNotFoundException e){
            System.out.println("File was not found");
        } catch (IOException e){
            System.out.println("Problem with file input");
        }
    }
    
}
