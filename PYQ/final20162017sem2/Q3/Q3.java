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

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.print("Enter the number of random integer: ");
        int n = sc.nextInt();
        
        int[] numbers = new int[n];
        
        // Generate n random integers and store in array
        for (int i = 0; i < n; i++) {
            numbers[i] = rd.nextInt(10000);
        }

        // Validate output
//        int[] numbers = {5133, 668, 27, 9652, 1083};
        
        displayArray(numbers);
        displayMin(numbers);
        displayHundred(numbers);
        displayReverse(numbers);
    }
    
    // Display the set of integers in the array
    public static void displayArray(int[] numbers){
        System.out.print("The random integer : ");
        for(int number: numbers){
            System.out.print(number + " ");
        }
        System.out.println("");
    }
    
    // Display the minimum number
    public static void displayMin(int[] numbers){
        int min = 10000; // Assume 10000 as the maximum value
//        int min = Integer.MAX_VALUE;
        for(int number: numbers){
            min = Math.min(min, number);
        }
        System.out.println("Minimum Number : " + min);
    }
    
    // Display the approximation of each integer value to the nearest hundred
    public static void displayHundred(int[] numbers){
        System.out.print("The approximation of the integer to the nearest hundred : ");
        for(int number: numbers){
            number = (int) Math.round(number / 100.0) * 100;
            System.out.print(number + " ");
        }
        System.out.println("");
    }
    
    // Display each integer in the array in a reverse order
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
