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

public class L7Q4 {
    public static void main(String[] args) {
        
        // read sentence from text.txt file and input into reverse.txt
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader("text.txt"));
            PrintWriter outputStream = new PrintWriter (new FileOutputStream("reverse.txt"));
            
            String input = "";
            while ((input = inputStream.readLine()) != null) {
                String line = ""; // reset for each line
                for (int i = input.length() - 1; i >= 0; i--) {
                    line += (input.charAt(i));
                }
                outputStream.println(line);
            }
            
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e){
            System.out.println("File was not found");
        } catch (IOException e){
            System.out.println("Problem with file input");
        }
    }
}
