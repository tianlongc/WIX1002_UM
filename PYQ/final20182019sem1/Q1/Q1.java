/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author tianlongc
 */
import java.util.Random;
// Filename: Q1.java
public class Q1 {
    public static void main(String[] args) {
        System.out.println("This program shows the number of odd and even number from 10 random numbers. The random numbers must be from 0 - 100");
        int num, odd = 0, even = 0;
        // Error 1: Create an instance of Random class Not Scanner
        Random r = new Random();
        
        // Error 2: condition should be 10 numbers
        // Error 3: increment instead of decrement
        for (int i = 1; i <=10; i++) {
            // Error 3: setting up boundaries
            num = r.nextInt(101);
            System.out.print(num + " ");
            // Error 4: Swap odd and even
            if (isEven(num)) {
                ++even;
            }
            else{
                ++odd;
            }
        }
        System.out.println("\nNumber of odd number: " + odd);
        System.out.println("Number of even number: " + even);
    }
    
    // Error 5: use static method
    // Error 6: incorrect parameter data type
    public static boolean isEven(int a){
        // incorrect condition
        if (a%2==0) {
            return true;
        }else{
            return false;
        }
    }
}
