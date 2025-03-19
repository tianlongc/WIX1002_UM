/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9Q4;

import java.util.Random;

/**
 *
 * @author tianlongc
 */
//1. 50 points only
//2. dice now can roll a 7
//3. if get 7, roll one more time, get 7 second time, roll again, roll third 3 get 7 get 0
public class Game3 extends Dice{
    protected Dice dice;
    
    @Override
    public int rollDice(){
        Random rd = new Random();
        int dice = rd.nextInt(1,8);
        return dice;
    }
    
    public Game3(String name){
        super(name);
        this.dice = new Dice(this.name);
    }
    
    public void roll(){
        int firstDice, secondDice, thirdDice;
        int turnScore = 0; // Track the score for the current turn
        
        firstDice = this.dice.rollDice();
        System.out.printf("%s rolled %d\n", getName(), firstDice);

        if (firstDice == 7){
            System.out.printf("%s rolled a %d and has a chance to roll again!\n", getName(), firstDice);
            secondDice = this.dice.rollDice();

            if (secondDice == 7) {
                System.out.printf("%s rolled a %d again in second attempt and has a chance to roll again!\n", getName(), secondDice);
                thirdDice = this.dice.rollDice();
                if (thirdDice == 7) {
                    System.out.printf("%s rolled a %d again in third attempt! No score for this turn.\n", getName(), thirdDice);
                    turnScore = 0;
                } else{
                    turnScore += firstDice + secondDice + thirdDice;
                }
            }else{
                turnScore += firstDice + secondDice;
            }
        } else {
            turnScore += firstDice;
        }
            
        if (this.score + turnScore > 50){
            System.out.printf("%s scores more 50 points and have to roll again in the next turn.\n", getName());
        } else {
            this.score += turnScore;
        }
    } 
}
