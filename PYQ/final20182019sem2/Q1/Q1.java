/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author tianlongc
 */

// Filename: Q1.java
// The purpose of this program is to count and display the total number of even integers in the array.
// Another purpose is to find the biggest integer in the array and display it.
// The output based on the given list, should be as below.
// The number of even integers is 3
// The biggest integer is 74

import java.util.Scanner; // is this an error since importing useless library
public class Q1 {
    public static void main(String[] args) {
        // Error 1: Numerical data types doesnt use ""
        int[] num = {66, 15, 20, 27, 74, 33};
        int cnt=0;
        // Error 2: .length to determine the length of the array
        // .length() to determine the length of the String variable
        for (int k = 0; k < num.length; k++) 
            // Error 3: Pass down a single number to the isEven method
            if (isEven(num[k]))
                cnt++;
        
        System.out.println("The number of even integers is " + cnt);
        // Error 4: Pass down the whole array not the num[0] number only!
        System.out.println("The biggest integer is " + findMax(num));
    }
    
    // Error 5: isEven is called from a static context (like main), it must be declared as static
    public static boolean isEven(int a){
        if (a%2==0)
        return true;
        else
        return false;
        // Refinements to avoid redunancy
//            return (a%2 == 0);
    }
    
    // Error 6: using int data type instead of void to return values
    public static int findMax(int[] a){
        int max = a[0];
        for (int n = 0; n < a.length; n++) 
            if (a[n] > max) 
                max = a[n];
        return max;
    }
} // end class
