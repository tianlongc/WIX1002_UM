/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author tianlongc
 */
import java.util.Random;
public class L4Q8 {
    public static void main(String[] args) {
        // Create an instance of Random class
        Random rd = new Random();
       
        int n = rd.nextInt(101);
        int counter = 0;
        int number = 2; // the lowest prime number
        
        System.out.println("First " + n + " prime numbers: ");
        
        while (counter < n) {
            boolean isPrime = true;
            
            // Math.sqrt shorten the range of potential factors
            for (int i = 2; i <= Math.sqrt(number); i++) { 
                if(number % i == 0){
                    isPrime = false;
                    break; // No need to check for another divisor
                }
            }
            
            if (isPrime){
                System.out.printf("%4d", number);
                counter++;
                
                // Break lines after every 10 prime numbers
                if (counter % 10 == 0){
                    System.out.println("");
                }
            }
            number++;
        }
        System.out.println("");
    }
}
