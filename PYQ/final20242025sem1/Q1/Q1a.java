/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class Q1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt message
        System.out.print("Enter a decimal number: ");
        int number = sc.nextInt();
        
        String binary = "";
        
        // Method 1: Integer.toBinaryString function (but API is not allowed)
//        System.out.println(Integer.toBinaryString(number));
        
        // Method 2: Looping method
        while (number > 0) {
            binary = (number % 2) + binary;
            number /= 2;
        }
        
        System.out.println(binary);
        
        sc.close();
    }
}
