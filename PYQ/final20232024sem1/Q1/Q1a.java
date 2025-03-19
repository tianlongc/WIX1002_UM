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

public class Q1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countPositive = 0, countNegative = 0, countZero = 0;
        
        while (true) {
            // Prompt message
            System.out.print("Enter a number (Press X to Quit): ");
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                sc.nextLine(); // clear input buffer
                if(number > 0){
                    countPositive++;
                }else if (number < 0){
                    countNegative++;
                }else{
                    countZero++;
                }
            }else{
                String input = sc.nextLine();
                if(input.equalsIgnoreCase("X")){
                    break;
                }else{
                    // Exception handling without try catch
                    System.out.println("Invalid input! Please enter a number or press X to quit.");
                }
            }
        }
        System.out.println("The count of positive numbers: " + countPositive);
        System.out.println("The count of negative numbers: " + countNegative);
        System.out.println("The count of zeros: " + countZero);
        
        sc.close();
    }
}
