/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author tianlongc
 */
// refer https://theasciicode.com.ar/ for ASCII table
import java.io.*;
public class Q4 {
    public static void main(String[] args) {
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader("myAmbition.txt"));
            
            // let A=0 and Z=25 so there is 26
            // Stores the frequency of each letter (A-Z) using array
            int[] countChar = new int[26];
            int num_sentence = 0, num_word = 0;
            
            System.out.println("The essay is :");
            
            String line = "";
            while ((line = inputStream.readLine()) != null) {
                System.out.println(line);
                
                String[] words = line.split("\\s+");
                num_word += words.length;
                
                for (int i = 0; i < line.length(); i++) {
                    int ASCII = (int)line.charAt(i);
                    int letterCount = 65; // Start checking from ASCII value 65 ('A')
                    int n = 0; // Index for the countChar array (0 to 25 for A-Z)
                    
                    // Check if the character is a full stop (.)
                    if (ASCII == 46) {
                        num_sentence++;
                    }else{
                        // Loop to check if the character is a letter (A-Z or a-z)
                        /*
                        The uppercase letter (e.g., 'A' with ASCII value 65)
                        The lowercase letter (e.g., 'a' with ASCII value 97, which is 65 + 32)
                        The +32 is used because lowercase letters are 32 positions ahead of their uppercase counterparts in the ASCII table.
                        */
                        while (letterCount <= 90 && n <= 26) {
                            if(ASCII == letterCount || ASCII == letterCount+32){
                                countChar[n]++;
                                break; // Exit the loop once the letter is found
                            }
                            /*
                            If the character doesn’t match the current letter, the program moves to the next letter by:
                            Incrementing letterCount (e.g., from 65 to 66, which is 'B').
                            Incrementing n (e.g., from 0 to 1, which corresponds to 'B' in the countChar array).
                            */
                            letterCount++; // Move to the next ASCII value (next letter) 
                            n++; // Move to the next index in the countChar array
                        }
                    }
                }
            }
            
            System.out.println("\nNumber of sentences : " + num_sentence);
            System.out.println("Number of words : " +num_word);
            
            for(int k = 65, c = 0; k <= 90 && c < 26; k++, c++){
                System.out.printf("%c : %d %s",(char)k , countChar[c], (k % 8 == 0)? "\n":" ");
            }
            System.out.println("");
            
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
