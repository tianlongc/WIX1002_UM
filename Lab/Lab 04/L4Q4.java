/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class L4Q4 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        
        System.out.print("Enter the day of the year (0 for Sunday, 1 for Monday, ... , 6 for Saturday): ");
        int day = sc.nextInt();
        
        int daystoMay = 0;
        // Check leap year
        if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            // Jan + Feb + Mar + Apr
            daystoMay = 31 + 29 + 31 + 30;
        }else{
            daystoMay = 31 + 28 + 31 + 30;
        }
        
        // daystoMay + May + June + July 
        int daystoAugust = daystoMay + 31 + 30 + 31;
        
        int d1May = (day + daystoMay) % 7;
        int d1August = (day + daystoAugust) % 7;

        // Call function since code is reusable
        displayCalendar("May", 31, d1May, year);
        displayCalendar("August", 31, d1August, year);
        
        sc.close();
    }
    
    // Method (modularise your program)
    public static void displayCalendar(String month, int daysInMonth, int firstDay, int year) {
        System.out.println("\nCalendar for " + month + " " + year);
        // Calendar Header
        System.out.println("SUN MON TUE WED THU FRI SAT");

        // Print spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d%s", day, ((day + firstDay) % 7 == 0) ? "\n": " ");
        }
        System.out.println();
    }
}


