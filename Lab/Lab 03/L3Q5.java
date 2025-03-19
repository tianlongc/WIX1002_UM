/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author tianlongc
 */

import java.util.Scanner;
public class L3Q5 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter a, b, e for the equation ax + by = e: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double e = sc.nextDouble();
        
        System.out.print("Please enter c, d, f for the equation cx + dy = f: ");
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double f = sc.nextDouble();
        
        if (((a * d) - (b * c)) == 0) {
            System.out.println("The equation has no solution");
        }else{
            double x = ((e * d) - (b * f))/((a * d) - (b * c));
            double y = ((a * f) - (e * c))/((a * d) - (b * c));
            System.out.println("The value of x is: " + x);
            System.out.println("The value of y is: " + y);
        }
        
        sc.close();
    }
}
