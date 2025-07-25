/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1Q5;

/**
 *
 * @author tianlongc
 */
/*
    Sample Input:
    1223334444
    11122221111
    The input consists of a single positive integer nnn (1 ≤ n ≤ 10^18). The number n is
    guaranteed to have no leading zeros.
*/
import java.util.Scanner;

public class V1Q5ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter n: ");
        String n = sc.nextLine();
        
        int totalGroups = 0;
        int maxLength = 0;
        char maxDigit = '\0';
        int sumLengths = 0;
        int currentLength = 1;
        
        for (int i = 0; i < n.length()-1; i++) {
            if (n.charAt(i) == n.charAt(i+1)) {
                currentLength++;
            }else{
                // End of current group if not same
                totalGroups++;
                sumLengths += currentLength;
                // Check if this group is the longest or not
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxDigit = n.charAt(i);
                }
                // Start a new group
                currentLength = 1; // reset the length
            }
        }
        
        // Handle the last group
        totalGroups++;
        sumLengths += currentLength;
        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxDigit = n.charAt(n.length() - 1);
        }
        
        System.out.println(totalGroups);
        System.out.println(maxDigit + " " + maxLength);
        System.out.println(sumLengths);
        
        sc.close();
    }
}
