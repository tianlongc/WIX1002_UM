/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V2Q1;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class V2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter string: ");
        String input = sc.nextLine().toLowerCase();
        
        System.out.println("Longest Palindromic Substring: " + findLongestPalindromicSubstring(input));
        
        sc.close();
    }
    
    public static String findLongestPalindromicSubstring(String input){
        int startIndex = 0, endIndex = 0;
        
        for (int i = 0; i < input.length(); i++) {
            // Check for odd-length palindrome
            int left = i, right = i;
            while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
                if (right - left + 1 > endIndex - startIndex + 1) {
                    startIndex = left;
                    endIndex = right;
                }
                left--;
                right++;
            }
            
            // Check for even-length palindrome
            left = i; 
            right = i + 1;
            while (left >= 0 && right < input.length() && input.charAt(left) == input.charAt(right)) {
                if (right - left + 1 > endIndex - startIndex + 1) {
                    startIndex = left;
                    endIndex = right;
                }
                left--;
                right++;
            }
        }
        
        return input.substring(startIndex, endIndex + 1);
    }
}
