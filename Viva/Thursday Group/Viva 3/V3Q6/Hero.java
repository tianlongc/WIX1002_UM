/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q6;

/**
 *
 * @author tianlongc
 */
public class Hero {
    private String name;
    private String element;
    private double hp;
    private double attack;
    
    public Hero(String name, String element, double hp, double attack){
        this.name = name;
        this.element = element;
        this.hp = hp;
        this.attack = attack;
    }
    
    public String getName(){
        return name;
    }
    
    public String getElement(){
        return element;
    }
    
    public double getHp(){
        return hp;
    }
    
    public double getAttack(){
        return attack;
    }
    
    public double calculateDamage(Villain enemy, int rsMultiplier){
        double dmMultiplier = 1.0;
        
        // Dominance relationships of elements
        if (element.equals("Fire")) {
            if (enemy.getElement().equals("Earth")) {
                dmMultiplier = 1.5;
            }else if(enemy.getElement().equals("Water")){
                dmMultiplier = 0.5;
            }
        }else if (element.equals("Water")) {
            if (enemy.getElement().equals("Fire")) {
                dmMultiplier = 1.5;
            }else if(enemy.getElement().equals("Earth")){
                dmMultiplier = 0.5;
            }
        }else if (element.equals("Earth")) {
            if (enemy.getElement().equals("Water")) {
                dmMultiplier = 1.5;
            }else if(enemy.getElement().equals("Fire")){
                dmMultiplier = 0.5;
            }
        }else if (element.equals("Light")) {
            if (enemy.getElement().equals("Dark")) {
                dmMultiplier = 1.5;
            }
        }else if (element.equals("Dark")){
            if (enemy.getElement().equals("Light")) {
                dmMultiplier = 1.5;
            }
        }
        
        double damage = (attack * dmMultiplier * rsMultiplier) - enemy.getDefense();
        
        if (damage < 0) {
            damage = 0;
        }else if (damage < 1 && rsMultiplier != 0) {
            damage = 1;
        }
        
        return damage;
    }
    
    @Override
    public String toString(){
        return String.format("Name: %s\nElement: %s\nHP: %.1f\nAttack: %.1f\n", name, element, hp, attack);
    }
}
