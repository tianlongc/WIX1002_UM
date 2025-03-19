/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
import java.util.Random;

public class L5Q1 {

    public static void main(String[] args) {
        
        double sum = 0;
        // Assume min = 101 and max = -1
        int min = 101, max = -1;
        
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.print("Enter the number of students, N: ");
        int N = sc.nextInt();
        
        int[] scores = new int[N];
        
        System.out.print("List of score: ");
        for (int i = 0; i < scores.length; i++) {
            
            scores[i] = rd.nextInt(101);
            sum += scores[i];
            
            // Output formatting
            System.out.printf("%d%s", scores[i], (i != scores.length - 1) ? ", " : "\n");
            
            // Use Math.min and Math.max to compare values
            min = Math.min(scores[i], min);
            max = Math.max(scores[i], max);
        }
        
            double average = sum / N;
        
            System.out.println("The highest score is: " + max);
            System.out.println("The lowest score is: " + min);
            System.out.println("The average score is: " + average);
            
        sc.close();
    }
}
