/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q4;

/**
 *
 * @author tianlongc
 */
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Random rd = new Random();
        
        Player player = new Player("Hero");
        Enemy enemy = new Enemy("Goblin");
        
        Item healthPotion = new Item("Health Potion", 20);
        Item sword = new Item("Sword", 15);
        
        BlackMagic poison = new BlackMagic("Poison", 10);
        BlackMagic magicOrb = new BlackMagic("Magic Orb", 3);
        
        boolean tempAttackBoost = false;
        boolean tempMagicBoost = false;
        boolean poisoned = false;
        int turn = 1;
        // Game flow
        while (player.isAlive() && enemy.isAlive()) {
            if (tempAttackBoost) {
                player.addTempAttackBoost(sword.use(player));
                tempAttackBoost = false;
            }else{
                player.addTempAttackBoost(0); // resets to 0
            }
            
            if (poisoned) {
                poisoned = false;
            }else{
                player.setAttackPower(10); // resets player attackPower
            }
            
            if (tempMagicBoost) {
                enemy.addTempMagicBoost(magicOrb.effect(player, enemy));
                tempMagicBoost = false;
            }else{
                enemy.addTempMagicBoost(1);
            }
            
            System.out.println("----------------------------------------");
            System.out.println("Turn " + turn + ":");
            // Display status of entities each turn
            System.out.println(player);
            System.out.println(enemy);
            System.out.println("----------------------------------------");
            
            System.out.println("\n--- Player's Turn ---");
           
            int action = rd.nextInt(2);
            if (action == 0) {
                healthPotion.use(player);
                System.out.println(healthPotion);
            }else if (action == 1){
                sword.use(player);
                tempAttackBoost = true;
                System.out.println(sword);
            }
            
            int damage = player.attack(enemy);
            System.out.println(player.getName() + " attacks " + enemy.getType() + " for " + damage + " damage!");
            
            if (enemy.isAlive()) {
                System.out.println("\n--- Enemy's Turn ---");
                action = rd.nextInt(2);
                if (action == 0) {
                    poison.effect(player, enemy);
                    poisoned = true;
                    System.out.println(poison);
                }else if (action == 1){
                    magicOrb.effect(player, enemy);
                    tempMagicBoost = true;
                    System.out.println(magicOrb);
                }
                enemy.attack(player);
            }else{
                System.out.println("\n" +enemy.getType() + " has been defeated!");
            }
            
            if (!player.isAlive()) {
                System.out.println("\n" +player.getName() + " has been defeated!");
            }
            turn++;
        }
        
        if (player.isAlive()) {
            System.out.println(player.getName() + " wins!");
        }else{
            System.out.println(player.getName() + " loses.");
        }
        System.out.println("----------------------------------------");
    }
}
