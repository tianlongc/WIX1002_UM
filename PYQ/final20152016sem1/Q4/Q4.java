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
            BufferedReader file = new BufferedReader(new FileReader("Q4.txt"));
            
            String password = "";
            while ((password=file.readLine()) != null) {
                // Condition check and should reset upon each loop
                boolean length = password.length() >= 8; // At least 8 characters
                boolean uppercase = false;
                boolean lowercase = false;
                boolean digit = false;
                boolean nonAlphanumeric = false;
                
                // At least 8 characters
                if (!length) {
                    System.out.println("Not a strong password.");
                    continue; // Skip to the next password if the first condition is not fulfilled
                }
               
                for (int i = 0; i < password.length(); i++) {
                    // Read the character at the current index and resets upon each loop
                    char currentChar = password.charAt(i);
                    
                    // Condition checking starts here
                    // At least 1 uppercase character
                    if (Character.isUpperCase(currentChar)){
                        uppercase = true;
                    }
                    // At least 1 lowercase character
                    else if (Character.isLowerCase(currentChar)){
                        lowercase = true;
                    }
                    // At least 1 digit (0-9)
                    else if (Character.isDigit(currentChar)) {
                        digit = true;
                    }
                    // At least 1 non-alphanumeric characters (space character is not counted)
                    else if ((!Character.isDigit(currentChar) && (!Character.isLetter(currentChar) && (currentChar != ' ')))) {
                        nonAlphanumeric = true;
                    }
                    
                    // Early exit if all conditions are met
                    if (uppercase && lowercase && digit && nonAlphanumeric) {
                        break;
                    }
                }
                
                if (length && uppercase && lowercase && digit && nonAlphanumeric) {
                    System.out.println("Strong password.");
                }else{
                    System.out.println("Not a strong password.");
                } 
            }
            
            file.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
