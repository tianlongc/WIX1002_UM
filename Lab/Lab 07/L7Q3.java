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

public class L7Q3 {
    public static void main(String[] args) {
        
        // read line from text.txt file 
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader("text.txt"));
            
            int num_char = 0, num_word = 0, num_line = 0;
            String line = "";
            while ((line = inputStream.readLine()) != null) {
               num_line++;
               /*
               Why dont use split(" ")?
               As the example shown, it only handles single whitespace
               Consequence: If there are multiple spaces between words (e.g., "hello   world"), 
               empty strings will be included in the resulting array.
               [hello, , , world]
               */
               // split text into words cleanly without worrying about extra spaces
               String words[] = line.split("\\s+");
               num_word += words.length;
               
                for (String word : words) {
                    num_char += word.length();
                }
            }
            
            System.out.printf("There are %d lines, %d words and %d characters in this file.\n", num_line, num_word, num_char);
            
            inputStream.close();
        } catch (FileNotFoundException e){
            System.out.println("File was not found");
        } catch (IOException e){
            System.out.println("Problem with file input");
        }
    }
}
