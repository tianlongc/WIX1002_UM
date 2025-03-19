/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author tianlongc
 */
import java.util.Random;
public class L4Q5 {
    public static void main(String[] args) {
        // Player 1
        int sum1 = 0;
        // Player 2
        int sum2 = 0;
        int i = 1;
        
        while (true) {
            if (sum1 >= 100 || sum2 >= 100){
                if (sum1 > sum2){
                    System.out.println("Player 1 wins with the highest score of " + sum1);
                }else if (sum2 > sum1){
                    System.out.println("Player 2 wins with the highest score of " + sum2);
                }else{
                    System.out.println("It's a draw!");
                }
                break; // stop once any of the sum exceeded 100
            } else {
                System.out.println("Turn " + i);
                // Player 1
                sum1 = rollDice("1", sum1);
                // Player 2
                sum2 = rollDice("2", sum2);
                System.out.println("");
                i++;
            }
        }
    }
    
    // Method (modularise your program)
    public static int rollDice(String player, int sum){
        // Create an instance of Random class
        Random rd = new Random();
        int dice;

        do {
            dice = rd.nextInt(6)+1;
            System.out.println("Player " + player + " rolled: " + dice);
            sum += dice;

            if (dice == 6){
                System.out.println("Player " + player + " rolled a 6 and has a chance to roll again!");
                }
        } while (dice == 6); // check if rolled another 6

        System.out.println("Player " + player + " total score: "+ sum);
        
        return sum;
    }
}
