/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9Q4;

/**
 *
 * @author tianlongc
 */
public class Game1 extends Dice{
    protected Dice d1,d2;
    
    public Game1(String name){
        super(name);
        this.d1 = new Dice(this.name);
        this.d2 = new Dice(this.name);
    }
    
    public void roll(){
        int dice1 = 0, dice2 = 0;
        do {
            dice1 = this.d1.rollDice();
            dice2 = this.d2.rollDice();
            System.out.printf("%s rolled %d and %d\n", getName(), dice1, dice2);
            this.score += dice1 + dice2;
            
            // Break once the score reaches or exceeds 100
            if (this.score >= 100) {
                break;
            }
        } while (dice1 == dice2);
    }
    
}
