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
        
        System.out.print("Enter number of teams: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear input buffer
        
        String[] name = new String[n];
        int[] score = new int[n];
        int[] index = new int[n];
        
        for (int i = 0; i < n; i++) {
            index[i] = i;
            System.out.printf("Enter team %d name: ", i+1);
            name[i] = sc.nextLine();
            System.out.printf("Enter team %d score: ", i+1);
            score[i] = sc.nextInt();
            sc.nextLine(); // clear input buffer
        }
        
        // Sort Index by score DESC
        for (int i = 0; i < index.length; i++) {
            for (int j = 0; j < index.length - i - 1; j++) {
                int before = index[j];
                int after = index[j+1];
                
                if (score[before] < score[after]) {
                    index[j] = after;
                    index[j+1] = before;
                }
            }
        }
        
        System.out.println("List of team with the highest team score first");
        for (int i: index) {
            System.out.printf("%s (%d) | ", name[i], score[i]);
        }
        System.out.println("");
        
        sc.close();
    }
}
