/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class Q2Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter the number of bags sold : ");
        int numberOfBags = sc.nextInt();
        
        System.out.print("Enter the weight per bag(kilogram) : ");
        double unitWeight = sc.nextDouble();
        
        double totalPrice = unitWeight * numberOfBags * 5.99;
        double totalPriceWithTax = totalPrice + totalPrice * 0.0725;
        
        System.out.println("");
        System.out.printf(" Price per kilogram:\t$%.2f\n", 5.99);
        // Escape by using %% and it is interpreted as a single % character in the output
        System.out.printf(" Sales tax:\t\t %.2f%% \n", 7.25);
        System.out.printf(" Total price: \t\t $ %.2f\n", totalPriceWithTax);
        
        sc.close();
    }
}
