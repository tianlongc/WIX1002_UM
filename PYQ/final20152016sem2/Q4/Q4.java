/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter the value of n for a regular polygon, n:");
        int n = sc.nextInt();
        
        System.out.print("Enter the length of a particular side of the regular polygon (in meter), s:");
        double s = sc.nextDouble();
        
        System.out.printf("The area is: %.2f squared meters.\n", area(n, s));
        
        sc.close();
    }
    
    public static double area(int n, double s){
        // Math.tan in rad so need to do the conversion
        // 180 degree = Math.PI rad
        return ((n * (s * s)) / (4 * (Math.tan(Math.toRadians(180/n)))));
    }
}
