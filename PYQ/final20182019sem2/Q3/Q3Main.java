/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
import java.util.Random;

public class Q3Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        char choice;
        do {
            // Randomly generates two single digit integers so [0,9] which is [0,10)
            int number1 = rd.nextInt(10);
            int number2 = rd.nextInt(10);

            System.out.printf("What is %d + %d ? ", number1, number2);
            int answer = sc.nextInt();

            boolean result = (number1 + number2) == answer;

            System.out.printf("%d + %d = %d is %b\n", number1, number2, answer, result);
            
            System.out.print("Do you want to try another question (y/n) ? : ");
            choice = sc.next().charAt(0);
            
            System.out.println("");
        } while (choice == 'y');
        
        sc.close();
    }
}
