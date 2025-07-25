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

public class V1Q4ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Please input a positive integer: ");
        int number = 0;
        
        while (true) {
            if (sc.hasNextInt()) {
                number = sc.nextInt();
                if (number > 0) {
                    System.out.println("you've inputed a valid integer!");
                    break;
                }
            }else{
                sc.nextLine(); // No need to store the string but to skip the input
            }
            System.out.print("Invalid input. Please re-input a valid +ve integer: ");
        }
        
        if (number % 2 == 0) {
            System.out.println("The integer is even!");
        }else{
            System.out.println("The integer is odd!");
        }
        
        sc.close();
    }
}
