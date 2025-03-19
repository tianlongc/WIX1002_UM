/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author tianlongc
 */
import java.util.Random;
public class L2Q3 {
    public static void main(String[] args) {
        
        // Create an instance of Random class
        Random rd = new Random();
        
        // ranges from 10 to 50 which means (10-10, 50-10) (0, 40) in random class + 10 to get (10, 50)
        // +1 since the upper boundary is exclusive
        int number1 = rd.nextInt(41)+10;
        System.out.println("The random number is: "+ number1);

        int number2 = rd.nextInt(41)+10;
        System.out.println("The random number is: "+ number2);
        
        int number3 = rd.nextInt(41)+10;
        System.out.println("The random number is: "+ number3);
        
        int sum = number1+ number2 + number3;
        System.out.println("The sum of three numbers is: "+ sum);
        
        // Ensures the variable sum is calculated through floating point division
        // Method 1: Type casting (double) Method 2: sum/3.0
        double average = (double)sum/3;
        
        System.out.printf("The average of three numbers is: %.2f\n", average);
        
    }
    
}
