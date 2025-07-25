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

public class V1Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter n: ");
        long n = sc.nextLong(); // use long to handle large integer numbers
        
        int totalGroups = 0;
        int maxLength = 0, maxDigit = 0;
        int sumLengths = 0;
        
        // Processes the digits of the number one by one, starting from the last digit (rightmost) and moving to the first digit (leftmost).
        int currentDigit = (int)(n % 10);
        int currentLength = 1;
        n /= 10; // Remove the last digit
        
        while (n > 0) {
            int nextDigit = (int)(n % 10);
            if (nextDigit == currentDigit) {
                currentLength++; // Same group
            } else{
                // End of current group if not same
                totalGroups++;
                sumLengths += currentLength;
                
                // Check if this group is the longest or not
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxDigit = currentDigit;
                }
                // Start a new group
                currentDigit = nextDigit;
                currentLength = 1; // reset the length
            }
            n /= 10; // Remove the last digit
        }
        
        // Handle the last group
        totalGroups++;
        sumLengths += currentLength;
        
        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxDigit = currentDigit;
        }
        
        System.out.println(totalGroups);
        System.out.println(maxDigit + " " + maxLength);
        System.out.println(sumLengths);
                
        sc.close();
    }
}
