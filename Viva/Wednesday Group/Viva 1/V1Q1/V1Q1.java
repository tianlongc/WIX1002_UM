/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1Q1;

/**
 *
 * @author tianlongc
 */

/*
    Incorrect   [Input : ‘arcanor’, Output : ‘ALLY DETECTED!’]
    Correct     [Input: ‘arcanor’, Output: 'ENEMY ALERT!']
*/

import java.util.Scanner;

public class V1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter username: ");
        String username = sc.nextLine().toLowerCase();
        
        int distinctCount = 0;
        
        if (username.length() <= 100) {
            for (int i = 0; i < username.length(); i++) {
                char currentChar = username.charAt(i);
                boolean distinct = true; // Assume character is distinct

                // Check if this current character has appeared before in the string
                for (int j = 0; j < i; j++) {
                    if (username.charAt(j) == currentChar) {
                        distinct = false;
                        break; // exit early once it is found not distinct
                    }
                }

                if (distinct) {
                    distinctCount++;
                }
            }

            if (distinctCount % 2 == 0) {
                System.out.println("ALLY DETECTED!");
            }else{
                System.out.println("ENEMY ALERT!"); // is odd
            }
        }else{
            System.out.println("The string contains at most 100 runes only!");
        }
        
        sc.close();
    }
}
