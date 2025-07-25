/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q4;

/**
 *
 * @author tianlongc
 */
public class Player {
    private String name;
    private int health;
    private int attackPower;
    private int tempAttackBoost;
    
    public Player(String name){
        this.name = name;
        this.health = 100;
        this.attackPower = 10;
        this.tempAttackBoost = 0;
    }
    
    public String getName(){
        return name;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void setHealth(int health){
        this.health = health;
    }
    
    public int attack(Enemy enemy){
        int damage = attackPower + tempAttackBoost;
        enemy.takeDamage(damage);
        return damage;
    }
    
    public void addTempAttackBoost(int boost){
        this.tempAttackBoost = boost;
    }
    
    public int getAttackPower(){
        return attackPower;
    }
    
    public void setAttackPower(int attackPower){
        this.attackPower = attackPower;
    }
    
    public boolean isAlive(){
        return health > 0;
    }
    
    public void takeDamage(int damage){
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }
    
    @Override
    public String toString(){
        return String.format("%s [Health: %d, Attack Power: %d%s]", name, health, attackPower, (tempAttackBoost > 0) ? " (+" + tempAttackBoost + ")" : "");
    }
}
