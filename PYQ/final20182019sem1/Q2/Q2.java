/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter N : ");
        int N = sc.nextInt();
        // NxN matrix
        int[][] matrixA = new int[N][N];
        int[][] matrixB = new int[N][N];
        
        // Sample output 1
//        int[][] matrixA = {{9,0},{2,8}};
//        int[][] matrixB = {{3,4},{9,9}};

        // Sample ouput 2
//        int[][] matrixA = {{9,6,4},{9,4,5},{1,7,1}};
//        int[][] matrixB = {{5,5,6},{1,9,2},{4,6,6}};
       
        generateMatrix(matrixA);
        generateMatrix(matrixB);
        
        System.out.println("Matrix A");
        displayMatrix(matrixA);
        System.out.println("Matrix B");
        displayMatrix(matrixB);
        
        System.out.println("Matrix A + B");
        displayMatrix(addMatrix(matrixA, matrixB, N));
        
        System.out.println("Matrix A X B");
        displayMatrix(multiplyMatrix(matrixA, matrixB, N));
        
        sc.close();
    }
    
    // Generate any random number from 0 to 9 (mutable array)
    public static void generateMatrix(int[][] matrix){
        Random rd = new Random();
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rd.nextInt(10);
            }
        }
    }
    
    public static void displayMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static int[][] addMatrix(int[][] matrixA, int[][] matrixB, int N){
        int[][] matrix = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        
        return matrix;
    }
    
    public static int[][] multiplyMatrix(int[][] matrixA, int[][] matrixB, int N){
        int[][] matrix = new int[N][N];
       
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    matrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        return matrix;
    }
}
