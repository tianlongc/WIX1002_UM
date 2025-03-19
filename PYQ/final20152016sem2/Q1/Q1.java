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

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter a number in pounds: ");
        double pounds = sc.nextDouble();
        
        // 1 pound = 0.454 kg
        double kilogram = pounds * 0.454;
        
        System.out.printf("%.1f pounds is %.3f kilograms\n", pounds, kilogram);
        
        sc.close();
    }
}
