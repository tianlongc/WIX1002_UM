/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9Q4;

/**
 *
 * @author tianlongc
 */
import java.util.Random;

public class Dice {
    protected int score;
    protected String name;
    
    public Dice(String name){
        this.name = name;
        this.score = 0;
    }
    
    // Accessor
    public String getName(){
        return name;
    }
    
    public int getScore(){
        return score;
    }
    
    public void display(){
        System.out.printf("%s's total score: %d\n", getName(), getScore());
    }
    
    public int rollDice(){
        Random rd = new Random();
        int dice = rd.nextInt(6)+1;
        return dice;
    }
}
