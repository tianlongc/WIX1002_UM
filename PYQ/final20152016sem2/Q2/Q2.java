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
        
        // Prompt message
        System.out.print("Enter a number between 0 and 1000: ");
        
        int number, sum = 0;
        
        // input validation
        while(true){
            if(sc.hasNextInt()){
                number = sc.nextInt();
                if(number > 0 && number < 1000){
                    break;
                }else{
                    System.out.println("Please enter a number between 0 and 1000!");
                }
            }else{
                sc.nextLine();
                System.out.println("Please enter a number between 0 and 1000!");
            }
        }
        sc.nextLine(); // clear input buffer
        
        while (number > 0) {
            sum += (number % 10);
            number /= 10;
        }
        
        System.out.println("The sum of the digits is " + sum);
        
        sc.close();
    }
}
