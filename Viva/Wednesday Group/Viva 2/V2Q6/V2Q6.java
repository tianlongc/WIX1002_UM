/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V2Q6;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class V2Q6 {
    public static void main(String[] args) {
        int[][] matrix = parseMatrix();
        
        System.out.println("\nThe original matrix:");
        displayMatrix(matrix);
        
        System.out.println("\nThe matrix after rotating:");
        rotateMatrix(matrix);
        displayMatrix(matrix);
    }
    
    public static int[][] parseMatrix(){
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter the dimension of the square matrix: ");
        int n = sc.nextInt();
        
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("Enter row number %d: ", (i+1));
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        sc.close();
        
        return matrix;
    }
    
    public static void displayMatrix(int[][] matrix){
        boolean format = false;
        // Check matrix formatting
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 9) {
                    format = true;
                    break;
                }
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%" + (format ? 2:1) + "d ", matrix[i][j]);
            }
            System.out.println("");
        }
    }
    
    // Array is mutable so use void method
    public static void rotateMatrix(int[][] matrix){
        int n = matrix.length;
        // n/2 for effiency if n = 5 (odd), there are 2 layers (the middle element doesn’t need to be rotated).
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                // Perform a 4-way swap to rotate elements 90 degrees clockwise
                int temp = matrix[i][j]; // Save top-left element
                matrix[i][j] = matrix[n - j - 1][i]; // Move bottom-left to top-left
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1]; // Move bottom-right to bottom-left
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1]; // Move top-right to bottom-right
                matrix[j][n - i - 1] = temp; // Move saved top-left to top-right
            }
        }
    }
}
