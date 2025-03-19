/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner; // is this an error since importing useless library
// Filename: Q1.java
public class Q1 {
    public static void main(String[] args) {
        // Error 1: Numerical data types doesnt use ""
        int[] num = {69, 15, 12, 27, 74, 23};
        int cnt=0;
        // Error 2: .length to determine the length of the array
        // .length() to determine the length of the String variable
        for (int i = 0; i < num.length; i++) 
            // Error 3: Pass down a single number to the isOdd method
            if (isOdd(num[i])) 
                cnt++;
            System.out.println("The number of odd number is " + cnt);
            // Error 4: Pass down the whole array not the num[0] number only!
            System.out.println("The sum of the array is " + compSum(num));
    }
    
    // Error 5: isOdd is called from a static context (like main), it must be declared as static
    public static boolean isOdd(int a){
        // Error 6: comparison operators !=
        if (a%2 != 0) 
            return true;
        else
            return false;
        // Refinements to avoid redunancy
//            return (a%2 != 0);
    }
    // Error 7: using int data type instead of void to return values
    public static int compSum(int[] a){
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            // Error 8: summing up the value not assigning the value
            total += a[i];
        }
        return total;
    }
} // end class
