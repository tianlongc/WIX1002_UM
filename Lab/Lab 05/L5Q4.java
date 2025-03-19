/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class L5Q4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[][] matrix = new int[3][3];
        
        System.out.println("3 by 3 Matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("After rotates 90 degrees clockwise");
        // rows become columns and column order is reversed
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                // For each reversed column, print the elements from top to bottom
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println("");
        }
        
        sc.close();
    }
}
