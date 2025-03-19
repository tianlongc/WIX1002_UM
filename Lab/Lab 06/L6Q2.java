/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class L6Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n and c: ");
        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        multiPrint(n, c);
        
        sc.close();
    }
    
    public static void multiPrint(int n, char c){
        // Assume n as row
        
        // Triangle
        // outer loop = number of rows
        for (int i = 0; i < n; i++) {
            // inner loop = number of columns
            for (int j = 0; j <= i; j++) {
                System.out.print(c);
            }
                System.out.println("");
            }
        System.out.println("");
        
        // Diamond
        // Calculate the middle row index
        int mid = (n + 1) / 2; 

        for (int i = 1; i <= n; i++) {
            // Determine the row number for symmetry
            int row = (i <= mid) ? i : n - i + 1;
            
            for (int j = 1; j <= mid - row; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= (2 * row) - 1; j++) {
                System.out.print(c);
            }
        System.out.println();
    }
    
    }
}
