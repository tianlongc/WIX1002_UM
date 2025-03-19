/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class L2Q6 {
    public static void main(String[] args) {
        
        // Create a scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter the amount of water in gram: ");
        double M = sc.nextDouble();
        M /= 1000; // in kg
        
        // Prompt message
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double TiFah = sc.nextDouble();
        double Ti = (TiFah - 32) / 1.8; // in Celsius

        
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double TfFah = sc.nextDouble();
        double Tf = (TfFah - 32) / 1.8; // in Celsius
        
        double Q = M * (Tf - Ti) * 4184;
        
        System.out.printf("The energy needed is %e\n",Q);
        
        sc.close();
    }
}
