/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class L4Q7 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        double totalInterest = 0;
        // Prompt messages
        System.out.print("Enter principal amount: ");
        double P = sc.nextDouble();
        
        System.out.print("Enter interest in %: ");
        double i = sc.nextDouble();
        
        System.out.print("Enter total number of month(s): ");
        int N = sc.nextInt();
        
        System.out.printf("Month%23s%17s%16s%22s%20s\n", "Monthly Payment", "Principal", "Interest", "Unpaid Balance", "Total Interest");
        
        for (int n = 1; n <= N; n++) {
            
            double M = (P * (i / (12 * 100))) / (1 - Math.pow((1 + (i / (12 * 100))), -N));
            double C = M * Math.pow(1 + (i / (12 * 100)), -(1+N-n));
            double L = M - C;
            double R = (L / (i / (12 * 100))) - C;
            totalInterest += L;
            
            System.out.printf("%-2d   %23.2f%17.2f%16.2f%22.2f%20.2f\n",n ,M, C, L, R, totalInterest);
        }
        
        sc.close();
    }
}
