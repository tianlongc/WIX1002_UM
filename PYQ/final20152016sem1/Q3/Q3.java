/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
import java.util.Random;

// KEY FOCUS: NOT TO MUTATE THE ARRAY BY STORING THEM --> USE FOREACH LOOP
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        // Prompt message
        System.out.print("Enter the number of random integer: ");
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        
        // Generate n random integers and store in array
        for (int i = 0; i < n; i++) {
            numbers[i] = rd.nextInt(1000);
        }
        
        // Validate output
//        int[] numbers = {594, 353, 875, 250, 95, 511};
        
        displayArray(numbers);
        displayMax(numbers);
        displayTenth(numbers);
        displayReverse(numbers);
    }
    
    // Display each of the integer in the array
    public static void displayArray(int[] numbers){
        System.out.print("The random integer : ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.printf("%d%s", numbers[i], (i != numbers.length-1)? " ": "\n");
//        }
        for (int number: numbers) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
    
    // Display the maximum number
    public static void displayMax(int[] numbers){
        int max = -1; // Assume -1 as the lowest number
//        int max = Integer.MIN_VALUE; // works as well
        for(int number: numbers){
            max = Math.max(max, number);
        }
        System.out.println("Maximum Number : " + max);
    }
    
    // Round each of the integer to the nearest tenth and display
    public static void displayTenth(int[] numbers){
        System.out.print("The approximation of the integer to the nearest tenth : ");
        for(int number: numbers){
            number = (int) Math.round(number / 10.0) * 10;
            System.out.print(number + " ");
        }
        System.out.println("");
    }
    
    // Display each of the integer in reverse in the array
    public static void displayReverse(int[] numbers){
        System.out.print("The random integer in reverse order: ");
        for (int number: numbers) {
            int reverse = 0; // reset upon each loop
            while (number > 0) {
                reverse = (reverse * 10) + (number % 10);
                number /= 10;
            }
            System.out.print(reverse + " ");
        }
        System.out.println("");
    }
}
