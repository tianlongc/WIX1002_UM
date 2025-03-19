/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author tianlongc
 */
import java.util.Random;
public class L5Q2 {
    public static void main(String[] args) {
        // Create an instance of Random class
        Random rd = new Random();
        
        int number, counter = 0;
        boolean isDuplicate = false;
        int[] numbers = new int[10];
        
        while(counter < 10){
            number = rd.nextInt(21);
            
            // Linear search to check if the number already exists in the array
            for (int i = 0; i < 10; i++) {
                isDuplicate = false; // resets to false after each loop
                
                if (numbers[i] == number){
                    isDuplicate = true;
                    break; // break once you found the same number
                }
            }
            if(!isDuplicate){
                numbers[counter] = number; // add number to the array
                counter++;
            }
        }
        
        System.out.println("10 non-duplicate random integers within the range from 0 to 20:");
        for (int j = 0; j < numbers.length; j++) {
//            if (j != numbers.length - 1){
//                System.out.print(numbers[j] + ", ");
//            }else{
//                System.out.print(numbers[j] + "\n");
//            }
            System.out.printf("%d%s", numbers[j], (j != numbers.length - 1) ? ", ": "\n");
        }
   
    }
}
