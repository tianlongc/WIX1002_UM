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
public class L4Q2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        
        int sum = 0;
        
        for (int i = 0; i <= n; i++) { // outer loop sum up 1 + (1+2) + (1+2+3)...
            for (int j = 0; j <= i; j++) { // inner loop do 1, (1+2), (1+2+3)... separately
                sum += j;
            }
        }
        System.out.println("The sum of the series is: " + sum);
        
        sc.close();

    }
}
