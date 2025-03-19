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
public class L3Q4 {
    public static void main(String[] args) {
        // Create an instance of Random class
        Random rd = new Random();
        // Player 1
        int dice1, sum1 = 0;
        // Player 2
        int dice2, sum2 = 0;
     
        // A dice is numbered from 1 to 6
        for (int i = 1; i < 3; i++) {
            // Player 1
            dice1 = rd.nextInt(6)+1; // [0,5]+1 becomes [1,6]
            System.out.println("Player 1 gets " + dice1 + " in roll " + i);
            sum1 += dice1;
            
            // Player 2
            dice2 = rd.nextInt(6)+1;
            System.out.println("Player 2 gets " + dice2 + " in roll " + i);
            sum2 += dice2;
        }
        
        if (sum1 > sum2){
            System.out.println("Player 1 wins the game with the highest score of " + sum1);
        }else if (sum2 > sum1){
            System.out.println("Player 2 wins the game with the highest score of " + sum2);
        }else{
            System.out.println("It's a tie!");
        }
    }
}

