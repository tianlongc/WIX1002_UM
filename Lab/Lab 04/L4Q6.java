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
public class L4Q6 {
    public static void main(String[] args) {
        // Create an instance of Random class
        Random rd = new Random();
        // Ignore negative numbers by using Math.abs
        int number = Math.abs(rd.nextInt());
        
        // Method 1: use formula
        System.out.println("The number of digits in " + number + " is " + ((int)Math.log10(number) + 1));

        // Method 2: use while loop
//        int n = 0;
//        int recursion = number;
//        while (recursion > 0) {
//            n++;
//            recursion /= 10;
//        }
//        
//        System.out.println("The number of digits in " + number + " is " + n);
    }
}
