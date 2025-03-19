/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class L4Q1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        int factor = 1;
        
        // Prompt message
        System.out.print("Enter an Integer: ");
        int number = sc.nextInt();
        
        System.out.print("The factors are: ");
        
        while (factor <= number) {
            if (number % factor == 0) {
                System.out.printf("%d%s", factor, ((factor != number) ? ", ": "\n"));
            }
            factor++;
        }        
        sc.close();
    }
    
}
