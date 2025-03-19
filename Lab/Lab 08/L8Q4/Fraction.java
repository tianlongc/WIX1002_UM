/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L8Q4;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numerator in integer: ");
        this.numerator = sc.nextInt();
        System.out.print("Enter the denominator in integer: ");
        this.denominator = sc.nextInt();
        sc.close();
    }
    
    // Mutator
    public void setNumerator(int n){
        numerator = n;
    }
    
    public void setDenominator(int d){
        denominator = d;
    }
    
    // Accessor
    public int getNumerator(){
        return numerator;
    }
    
    public int getDenominator(){
        return denominator;
    }
    
    // Calculate GCD using Euclidean algorithm
    public int getGCD(int A, int B){
        while (B != 0){
            // Ensures A is always the higher number than B
            int temp = B;
            B = Math.max(A, B) % Math.min(A, B);
            A = temp;
        }
        return A;
    }
    
    public void displayFraction(){
        System.out.printf("The original fraction is %d/%d\n", getNumerator(), getDenominator());
        
        int n = getNumerator();
        int d = getDenominator();
        int GCD = getGCD(n, d);
        System.out.printf("The fraction that reduced to lowest terms is %d/%d\n", (n/GCD), (d/GCD));
    }
}
