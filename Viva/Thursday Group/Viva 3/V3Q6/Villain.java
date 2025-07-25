/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q6;

/**
 *
 * @author tianlongc
 */
public class Villain {
    private String name;
    private String element;
    private double maxHp;
    private double hp;
    private double attack;
    private double defense;
    private int initialCd;
    private int currentCd;
    
    public Villain(String name, String element, double hp, double attack, double defense, int initialCd ){
        this.name = name;
        this.element = element;
        this.maxHp = hp;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.initialCd = initialCd;
        this.currentCd = initialCd;
    }
    
    public String getName(){
        return name;
    }
    
    public String getElement(){
        return element;
    }
    
    public double getDefense(){
        return defense;
    }
    
    public double getAttack(){
        return attack;
    }
    
    public double getHp(){
        return hp;
    }
    
    public int getCurrentCd(){
        return currentCd;
    }
    
    public int getInitialCd(){
        return initialCd;
    }
    
    public void getDamaged(double damage){
        this.hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
    }
    
    public void resetHp(){
        this.hp = this.maxHp;
    }
    
    public void decreaseCd(){
        this.currentCd--;
    }
    
    public void resetCd(){
        this.currentCd = this.initialCd;
    }
    
    @Override
    public String toString(){
        return String.format("Villain Name: %s\nElement: %s\nHP: %.1f\nAttack: %.1f\nDefense: %.1f\nInitial Cd: %d\nCurrent Cd: %d\n", name, element, hp, attack, defense, initialCd, currentCd);
    }
}
