/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class Q1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 5 course scores
        double[] scores = new double[5];
        double sum = 0;
        
        // Prompt message
        System.out.println("Enter the scores for 5 courses (each between 0 and 100):");
        
        for (int i = 0; i < scores.length; i++) {
            while (true) {
                // Prompt message
                System.out.printf("Course %d score: ",i+1);
                scores[i] = sc.nextDouble();
                if (scores[i] >= 0 && scores[i] <= 100) {
                    sum += scores[i];
                    break; // exit loop once the range is correct
                }else{
                    System.out.println("Invalid score. Please enter a score between 0 and 100.");
                }
            }
        }
        
        double average = sum / scores.length;
        char grade;
        
        // converts the average score to an integer representing the 
        // grade range (e.g., 9 and 10 for 90-100, 8 for 80-89, etc
        int gradeRange = (int)(average / 10);
        switch (gradeRange) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
        
        System.out.println("Average score: " + average);
        System.out.println("Grade: " + grade);
        
        sc.close();
    }
}
