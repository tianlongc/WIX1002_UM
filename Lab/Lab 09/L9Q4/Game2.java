/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9Q4;

/**
 *
 * @author tianlongc
 */
public class Game2 extends Dice{
    protected Dice dice;
    
    public Game2(String name){
        super(name);
        this.dice = new Dice(this.name);
    }
    
    public void roll(){
        int firstDice, secondDice;
        int turnScore = 0; // Track the score for the current turn
        
        firstDice = this.dice.rollDice();
        System.out.printf("%s rolled %d\n", getName(), firstDice);

        if (firstDice == 6){
            System.out.printf("%s rolled a %d and has a chance to roll again!\n", getName(), firstDice);
            secondDice = this.dice.rollDice();

            if (secondDice == 6) {
                System.out.printf("%s rolled a %d again in second attempt! No score for this turn.\n", getName(), secondDice);
                turnScore = 0;
            } else{
                turnScore += firstDice + secondDice;
            }
        } else {
            turnScore += firstDice;
        }
            
        if (this.score + turnScore > 100){
            System.out.printf("%s scores more 100 points and have to roll again in the next turn.\n", getName());
        }else{
            this.score += turnScore;
        }
    } 
}
