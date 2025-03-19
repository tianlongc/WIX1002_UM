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
public class L5Q6 {
    public static void main(String[] args) {
        // Create a sc object to read input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int number = sc.nextInt();
        
        System.out.println("The Pascal Triangle with "+ number + " row(s)");
        
                                //rows columns
        int[][] matrix = new int[number][number];
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i){
                    matrix[i][j] = 1;
                }else{
                    // same row calculation
                    matrix[i][j] = matrix[i-1][j-1] + matrix[i - 1][j]; 
                }
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
        
        sc.close();
    }
}
