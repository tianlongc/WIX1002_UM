/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class L2Q4 {
    public static void main(String[] args) {
        
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter the number of seconds: ");
        int total_seconds = sc.nextInt();
        
        int hours = total_seconds / 3600;
        int minutes = (total_seconds % 3600) / 60;
        int seconds = total_seconds % 60;
        
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds\n", total_seconds, hours, minutes, seconds);
        
        sc.close();
    }
    
}
