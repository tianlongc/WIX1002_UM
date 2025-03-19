/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author tianlongc
 */

import java.util.Random;
public class L3Q2 {
    public static void main(String[] args) {
        // Create an instance of Random class
        Random rd = new Random();
        int randomNumber = rd.nextInt(6);
        
        // Array index 0 to 5 represent each numbers
        String[] numbers = {"zero", "one", "two", "three", "four", "five"};
        
        System.out.println(randomNumber + " is " + numbers[randomNumber] + ".");
        
        // Alternative (Switch Case)
//        switch (randomNumber) {
//            case 0:
//                System.out.println(randomNumber + " is zero.");
//                break;            
//            case 1:
//                System.out.println(randomNumber + " is one.");
//                break;
//            case 2:
//                System.out.println(randomNumber + " is two.");
//                break;
//            case 3:
//                System.out.println(randomNumber + " is three.");
//                break;
//            case 4:
//                System.out.println(randomNumber + " is four.");
//                break;
//            case 5:
//                System.out.println(randomNumber + " is five.");
//                break;
//            // no default for this case since it already handles 0 to 5
//        }
            
        }
        
    }
