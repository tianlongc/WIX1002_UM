/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q6;

/**
 *
 * @author tianlongc
 */
import java.util.Random;

public class Team {
    private Hero[] deck;
    private Hero[] heroList;
    private double hp;
    
    public Team(Hero[] heroes){
        this.heroList = new Hero[4];
        this.deck = heroes;
        this.hp = 0.0;
    }
    
    public double getHp(){
        return hp;
    }
    
    public Hero[] getHeroList(){
        return heroList;
    }
    
    public void formTeam(){
        Random rd = new Random();
        boolean[] selected = new boolean[deck.length]; // Track selected heroes
        
        for (int i = 0; i < heroList.length; i++) {
            int index;
            do {
                index = rd.nextInt(deck.length);
            } while (selected[index]); // Repeat if the hero is already selected
            
            heroList[i] = deck[index];
            selected[index] = true;
            this.hp += heroList[i].getHp();
        }
    }
    
    public void getDamaged(double damage){
        this.hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
    }
    
    public void resetTeamHp(){
        double teamHp = 0;
        for (int i = 0; i < heroList.length; i++) {
            teamHp += heroList[i].getHp();
        }
        this.hp = teamHp;
    }
    
    @Override
    public String toString(){
        String output = "Team's HP: " + hp + "\n\n";
        for (int i = 0; i < heroList.length; i++) {
            output += String.format("Hero %d\n%s\n", i+1, heroList[i]);
        }
        return output;
    }
}
