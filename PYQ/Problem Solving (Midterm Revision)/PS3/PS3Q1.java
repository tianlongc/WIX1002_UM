/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS3;

/**
 *
 * @author tianlongc
 */

/*  Sample Input
    154086543
    013376131
    029598905
*/

import java.util.Scanner;

public class PS3Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter nine digit integer : ");
        String isbn = sc.nextLine();
        
        int sum = 0;
        if (isbn.length() != 9) {
            System.out.println("Invalid format! Please enter a nine-digit integer.");
        }else{
            for (int i = 0; i < 9; i++) {
                char c = isbn.charAt(i);
                if (!Character.isDigit(c)) {
                    System.out.println("Not a nine-digit integer! Please enter again.");
                    return; // ends the program once it is not a valid input
                }
                /*
                   c - '0' converts char to int (e.g., '5' -> 5). 
                   Meanwhile, (int)c gives ASCII value (e.g., 'd' -> 0x64 or 100), which is incorrect here.
                   Convert character digit to integer representation: 
                   '5' -> 5 (ASCII adjustment: '5' - '0' = 53 - 48 = 5)
                */
                sum += ((i + 1) * (c - '0'));
            }
            int checksum = sum % 11;
            /* 
                Convert integer digit to character representation: 
                5 -> '5' (ASCII adjustment: 5 + '0' = 5 + 48 = 53 -> '5') 
            */
            char lastDigit = (checksum == 10) ? 'X': (char)(checksum + '0');
            /*
                .substring(start, end): start is inclusive, end is exclusive
                Example: "012345".substring(1, 4) -> "123"
            */
            System.out.printf("10-digit ISBN: %c-%s-%s-%c\n",
                    isbn.charAt(0), isbn.substring(1, 4), isbn.substring(4, 9), lastDigit);
            
        }
        sc.close();
    }
}
/*
    c - '0': You're "shifting down" from the character world (ASCII) to the integer world.
    checksum + '0': You're "shifting up" from the integer world to the character world.
*/
