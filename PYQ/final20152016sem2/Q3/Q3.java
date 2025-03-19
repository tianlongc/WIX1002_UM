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

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of lines:");
        int lines;
        // input validation
        while(true){
            if(sc.hasNextInt()){
                lines = sc.nextInt();
                if(lines >= 1 && lines <= 15){
                    break;
                }else{
                    System.out.println("Please enter a number between 1 and 15!");
                }
            }else{
                sc.nextLine();
                System.out.println("Please enter a number between 1 and 15!");
            }
        }
        sc.nextLine(); // clear input buffer
        
        // Looping approach
        for (int i = 1; i <= lines; i++) {
            // Print spaces
            for (int j = 0; j < lines - i; j++) {
                System.out.print("  ");
            }
            
            // Print numbers in descending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            // Print numbers in ascending order
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            System.out.println("");
        }
        
        sc.close();
    }
}
