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
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        // 6 letters
//        char[] letters={'S','s','J','e','F','u'};
        char[] letters = new char[6]; // character array
        
        try{
            // Store in data.txt file
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("data.txt"));
            
            Random rd = new Random();
            
            // Random number generator
            for (int i = 0; i < letters.length; i++) {
                int randomNumber;
                do {
                    // ranges from 65 to 122 (0, 57]+65 (0, 58)+65
                    randomNumber = rd.nextInt(58)+65;
                    // exclude the values 91 to 96 are non-alphabetic characters (like [, \, ], ^, _, and `)
                } while (randomNumber >= 91 && randomNumber <= 96);
                    letters[i] = (char)randomNumber;
            }

            System.out.print("The string generated is: ");
            for (int i = 0; i < letters.length; i++) {
                outputStream.print(letters[i]);
                System.out.printf("%c%s", letters[i], ((i != letters.length -1) ? "": "\n"));
            }
            
            // Array is mutable so handle with care!
            System.out.println("String sorted in ascending order: " + sort(letters, '>'));
            System.out.println("String sorted in descending order: " + sort(letters, '<'));
            
            outputStream.close();
            // Read the generated string
            BufferedReader inputStream = new BufferedReader(new FileReader("data.txt"));
            
            String line = "";
            while ((line = inputStream.readLine()) != null) {
                System.out.println("Original string from file: " + line);
            }
            
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error reading or output file: " + e.getMessage());
        }
    }
    
    // sort method
    public static String sort(char[] letters, char symbol){
        String result="";
        // ascending
        if (symbol == '>') {
            for (int i = 0; i < letters.length; i++) { // Bubble sort mechanism
                for (int j = 0; j < letters.length - i - 1; j++) {
                    if (letters[j] > letters[j+1]) {
                        char temp = letters[j];
                        letters[j] = letters[j+1];
                        letters[j+1] = temp;
                    }
                }
            }
        // descending
        }else if(symbol == '<'){
            for (int i = 0; i < letters.length; i++) {
                for (int j = 0; j < letters.length - i - 1; j++) {
                    if (letters[j] < letters[j+1]) {
                        char temp = letters[j];
                        letters[j] = letters[j+1];
                        letters[j+1] = temp;
                    }
                }
            }
        }
        
        for (int i = 0; i < letters.length; i++) {
            result += letters[i];
        }
        
        return result;
    }
}
