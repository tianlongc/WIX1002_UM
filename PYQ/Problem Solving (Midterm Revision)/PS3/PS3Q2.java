/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS3;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class PS3Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter Integer (-1 to quit): ");
        int number, occ = 0;
        int min = 10; // Assume min as the highest value
        String numbers = "";
        // 5 9 13 5 4 6 4 4 8 9 -1
        do{
            number = sc.nextInt();
            // Take integers from 1 to 9
            if (number >= 1 && number <= 9) {
                numbers += number + " ";
                if (min > number) {
                    min = number;
                    occ = 1;
                }else if (min == number){
                    occ++;
                }
            }
        }while(number != -1);
        
        // Question does not mention about the output "No minimum number or valid numbers" can just ignore
        if (min == 10 || numbers.isEmpty()) {
            System.out.println("No minimum number or valid numbers"); // Handles edge case if -1 is entered only
        }else{
            // Question only mention here
            // .trim() to remove last space after 9 (unnecessary actually)
            System.out.println(numbers.trim());
            System.out.println("The minimum number is " + min);
            System.out.println("The occurence count of " + min + " is " + occ);
        }
        sc.close();
    }
}
