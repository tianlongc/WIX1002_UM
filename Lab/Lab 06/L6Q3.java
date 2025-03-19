/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class L6Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[10];
        
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        
        reverse_number(numbers);
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d%s", numbers[i], ((i != numbers.length - 1) ? " ": "\n"));
        }
    }
    // why use void? Because Array is mutable
    public static void reverse_number(int[] numbers){
        
        for (int i = 0; i < numbers.length; i++) {
            boolean isNegative = numbers[i] < 0;
            int number = Math.abs(numbers[i]); // Use positive numbers to reverse
            
            // resets upon each array elements
            numbers[i] = 0;
                
            while (number > 0) {
                numbers[i] = (numbers[i] * 10) + (number % 10);
                number /= 10;
            }
            
            if (isNegative) {
                numbers[i] *= -1;
            }
        }
    }
}
