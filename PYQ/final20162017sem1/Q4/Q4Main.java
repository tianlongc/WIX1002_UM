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

public class Q4Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("First complex number. Enter a number for the real part: ");
        double real1 = sc.nextDouble();
        System.out.print("First complex number. Enter a number for the imaginary part: ");
        double imaginary1 = sc.nextDouble();
        Complex c1 = new Complex(real1, imaginary1);
        
        System.out.print("Second complex number. Enter a number for the real part: ");
        double real2 = sc.nextDouble();
        System.out.print("Second complex number. Enter a number for the imaginary part: ");
        double imaginary2 = sc.nextDouble();
        Complex c2 = new Complex(real2, imaginary2);
        
        System.out.println("\nFirst complex number: " + c1.toString());
        System.out.println("Second complex number: " + c2.toString());
        System.out.println("Addition of the two complex numbers: " + c1.addComplexNum(c2));
        System.out.println("Subtraction of the two complex numbers: " + c1.subtractComplexNum(c2));
        
        sc.close();
    }
}
