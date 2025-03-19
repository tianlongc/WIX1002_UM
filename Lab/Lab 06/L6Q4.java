/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author tianlongc
 */
public class L6Q4 {
    public static void main(String[] args) {
        
        System.out.println("GCD for (24, 8): " + GCD(24, 8));
        System.out.println("GCD for (200, 625): "+ GCD(200, 625));
        
    }
    
    public static int GCD(int A, int B){
        // Euclidean Algorithm
        // Ensures A is always the higher number than B
        if (B > A) {
            int temp = B;
            B = A;
            A = temp;
        }
        
        while (B != 0){
            int R = A % B; // let R = remainder and Quotient is not required
            A = B;
            B = R;
        }
        
        return A;
    }
}
