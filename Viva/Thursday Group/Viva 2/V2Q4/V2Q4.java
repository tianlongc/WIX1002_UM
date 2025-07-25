/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V2Q4;

/**
 *
 * @author tianlongc
 */

public class V2Q4 {
    public static void main(String[] args) {
        // Test input
        String[] isbnList = {"123456789X","1234567890","0471958697"};
        boolean[] isValid = new boolean[isbnList.length];
        
        validateISBNList(isbnList, isValid);
        System.out.print("The validation results are : ");
        for (int i = 0; i < isValid.length; i++) {
            System.out.printf("%b%s", isValid[i], (i != isValid.length - 1) ? " " : "\n");
        }
    }
    
    public static boolean isValidISBN(String isbn){        
        // The number must have exactly 10 characters.
        if (isbn.length() != 10) {
            return false;
        }
        
        int sum = 0;
        
        // The first 9 characters must be digits.
        for (int i = 0; i < 9; i++) {
            char c = isbn.charAt(i);
            
            if(!Character.isDigit(c)){
                return false;
            }
            
            // It calculates the weighted sum of the first 9 digits
            // Check digit=( 1×digit1 + 2×digit2⋯ + 9×digit9 ) mod 11
            // sum = 1*digit1 + 2*digit2
            // Why use c - '0'???
            // Always use c - '0' to convert a character digit to its numeric value.
            // Using (int)c will give you the Unicode or ASCII value of the character, which is not what you want for numeric calculations.
            // 0x64 format
            sum += (i + 1) * (c - '0'); 
            
        }
        
        // compares the last character (check digit)
        char lastChar = isbn.charAt(9);
        int checkDigit;

        // If the last character is 'X', it's treated as the digit 10.
        if (lastChar == 'X') {
            checkDigit = 10;
        } else if (Character.isDigit(lastChar)){
            checkDigit = (lastChar - '0');
        } else{
            return false;
        }

        //Compare the computed check digit with the 10th character in the string (either '0-9' or 'X').
        return (sum % 11 == checkDigit);
    }
    
    // Use void method to update since array is mutable
    public static void validateISBNList(String[] isbnList, boolean[] isValid){
        // Validate each one and stores the results in a boolean array
        for (int i = 0; i < isbnList.length; i++) {
            isValid[i] = isValidISBN(isbnList[i]);
        }
    }  
}
