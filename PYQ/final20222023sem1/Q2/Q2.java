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

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numStudents = getValidInput(sc, "Enter the number of students: ", 0, 10);
        
        // Use multidimensional array (jagged) to store student marks
        int[][] studentMarks = new int[numStudents][];
        int[] average = new int[numStudents];
        
        for (int i = 0; i < numStudents; i++) {
            String promptSubject = String.format("Enter the number of subjects for student %d:",i+1);
            int numSubjects = getValidInput(sc, promptSubject, 0, 10);
            studentMarks[i] = new int[numSubjects];
            
            for (int j = 0; j < numSubjects; j++) {
                String promptMark = String.format("Student (%d) Enter mark for Subject %d:", i+1, j+1);
                studentMarks[i][j] = getValidInput(sc, promptMark, 0, 100);
            }
            
            int sum = 0;
            for(int mark: studentMarks[i]){
                sum += mark;
            }
            average[i] = sum / numSubjects;
        }
        
        System.out.printf("List of Students (%d students)\n", numStudents);
        for (int i = 0; i < numStudents; i++) {
            System.out.printf("Student %d\n", i+1);
            for (int j = 0; j < studentMarks[i].length; j++) {
                System.out.printf(" Subject %d:%d\n", j+1, studentMarks[i][j]);
            }
            System.out.println("Average Marks: " + average[i]);
        }
        
        // Find and display the student with the highest average
        int highestIndex = 0;
        // starts with i=1 since i=0 is taken
        for (int i = 1; i < numStudents; i++) {
            if (average[i] > average[highestIndex]) {
                highestIndex = i;
            }
        }
        
        System.out.printf("Student %d has the highest average, with %d marks\n", highestIndex+1, average[highestIndex]);
        
        sc.close();
    }
    
    public static int getValidInput(Scanner sc, String prompt, int min, int max){
        // input validation without try catch
        int input;
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
               input = sc.nextInt();
                
               if (input >= min && input <= max) {
                    return input;
               }else{
                    System.out.print("Error !!! ");
               }
            }else{
                System.out.println("Invalid input!");
                sc.nextLine(); // clear input buffer
            }
        }
    }
}

