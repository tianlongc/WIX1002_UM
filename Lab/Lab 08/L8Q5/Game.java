/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L8Q5;

/**
 *
 * @author tianlongc
 */
import java.util.Random;
public class Game {
    private String name;
    private int score;
    
    // Argument Constructor
    public Game(String n){
        this.name = n;
        this.score = 0;
    }
    
    // Accessor
    public String getName(){
        return name;
    }
    
    public int getScore(){
        return score;
    }
    
    // Method
    public void rollDice(){
        Random rd = new Random();
        
        int dice = rd.nextInt(1,7);
        score += dice;
        
        System.out.println(name + " rolled: " + dice);
        System.out.println(name + "'s total score: " + score);
    } 
}
