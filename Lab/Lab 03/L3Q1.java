/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

/**
 *
 * @author tianlongc
 */

import java.util.Scanner;
public class L3Q1 {
    public static void main(String[] args) {
        // Create scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter two integer number: ");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        
        System.out.print("Enter the operand: ");
        char operand = sc.next().charAt(0);
        
        switch (operand){
            case '+': 
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
                break;
            case '-': 
                System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
                break;
            case '*': 
                System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
                break;
            case '/': 
                System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
                break;
            case '%': 
                System.out.println(number1 + " % " + number2 + " = " + (number1 % number2));
                break;
            default:
                System.out.println("Invalid operand! Please enter +, -, *, /, %");
                break;
        }
        
        sc.close();
    }
    
}
