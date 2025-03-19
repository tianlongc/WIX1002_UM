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
public class L2Q2 {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("The price of the car: RM");
        double P = sc.nextDouble();
        
        // Prompt message
        System.out.print("Enter down payment: RM");
        double D = sc.nextDouble();
        
        // Prompt message
        System.out.print("Enter the interest rate in %: ");
        double R = sc.nextDouble();
        
        // Prompt message
        System.out.print("Enter the loan duration in year: ");
        int Y = sc.nextInt();
        
        // Calculation using formula given
        double M = (P - D) * (1 + R*Y/100) / (Y * 12);
        
        System.out.printf("The monthly payment is: RM%.2f\n", M);
        
        sc.close();
    }
    
}
