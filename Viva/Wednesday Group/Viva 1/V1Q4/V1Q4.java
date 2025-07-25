/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1Q4;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class V1Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message 
        System.out.print("Please input a positive integer: ");
        int number = 0;
        
        boolean isValid = false;
        
        while (!isValid) {
            String input = sc.nextLine();
            
            // Assume input is valid initially
            isValid = true;
            
            // Check each character in the input string
            // No need to handle for '-' and '.' for negative and floating numbers
            // since they are handled in characters cases already
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (!Character.isDigit(currentChar)) {
                    isValid = false;
                    break; // exit loop once it is not number
                }
            }
            
            if (!isValid) {
                System.out.print("Invalid input. Please re-input a valid +ve integer: ");
            }else{
                number = Integer.parseInt(input);
                System.out.println("you've inputed a valid integer!");
            }
        }
        
        if (number % 2 == 0) {
            System.out.println("The integer is even!");
        }else{
            System.out.println("The integer is odd!");
        }
        
        sc.close();
    }
}
