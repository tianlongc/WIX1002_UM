/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q4;

/**
 *
 * @author tianlongc
 */
public class Enemy {
    private String type;
    private int health;
    private int attackPower;
    private int tempMagicBoost;
    
    public Enemy(String type){
        this.type = type;
        this.health = 100;
        this.attackPower = 5;
        this.tempMagicBoost = 1;
    }
    
    public String getType(){
        return type;
    }
    
    public void attack(Player player){
        int damage = attackPower * tempMagicBoost;
        player.takeDamage(damage);
        System.out.println(type + " attacks " + player.getName() + " for " + damage + " damage!\n");
    }
    
    public void addTempMagicBoost(int boost){
        this.tempMagicBoost = boost;
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
        return String.format("%s [Health: %d, Attack Power: %d%s]", type, health, attackPower, (tempMagicBoost > 1) ? " (x" + tempMagicBoost + ")" : "");
    }
}
