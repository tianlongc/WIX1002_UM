/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class L2Q1 {
    public static void main(String[] args) {
        
        // Create a Sc object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt Message
        System.out.print("Enter temperature in degree Fahrenheit: ");
        double Fahrenheit = sc.nextDouble();
        
        double Celsius = (Fahrenheit - 32) / 1.8;
        
        System.out.printf("The temperature in degree Celsius is: %.2f\n" ,Celsius);
        
        sc.close(); // save resource
    }
}
    

