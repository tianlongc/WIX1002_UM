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
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader("Q4_input.txt"));
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("output.txt"));
            
            String line = "", input = "";
            while ((line = inputStream.readLine()) != null) {
                input += line + "\n";
            }
                        
            String[] texts = input.split("\n");
            TextManipulator t = new TextManipulator(texts);
            
            System.out.println("Original text:");
            t.display();
            
            System.out.println("\nCleaned text:");
            t.cleanText();
            t.display();
            
            System.out.println("\nReversed text:");
            t.reverseText();
            t.display();
            
            System.out.println("\nArranged text:");
            t.arrangeText();
            t.display();
            
            // Obtain the processed text from TextManipulator class
            String[] text = t.getTexts();
            for (int i = 0; i < text.length; i++) {
                outputStream.println(text[i]);
            }
            
            outputStream.close();
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error reading or outputing file: " + e.getMessage());
        }
    }
}
