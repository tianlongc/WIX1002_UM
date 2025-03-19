/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS2;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class PS2Q2 {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        int correct = 0, total =0;
        
        while (true) {
            System.out.print("Enter a number (-1 to quit) : ");
            int number = sc.nextInt();
            
            if (number != -1) {
            
                System.out.print("Enter a factor : ");
                int factor = sc.nextInt();
                
                // Clean input buffer
                sc.nextLine();

                System.out.print(factor + " is a factor of " + number + "? (true/false): ");
                boolean answer = sc.nextBoolean();
                
                total++;

                if ((number % factor == 0) == answer){
                    System.out.println("Your answer is correct");
                    correct++;
                } else {
                    System.out.println("Your answer is incorrect");
                }  
            }else{
                System.out.println("The final score is " + correct + "/" + total);
                break;
            }
        }
        
        sc.close();
    }
}
