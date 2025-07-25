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

public class Game {
    
    public void battle(Team team, Villain enemy){
        Random rd = new Random();
        team.resetTeamHp();
        enemy.resetHp();
        enemy.resetCd();
        
        /* 
            To debug heroes attacks when specific elements appeared 
            we can just String[] runestones = {"Water"};  or other specific element
            to test "No hero attacked in this round" output
        */
        String[] runestones = {"Water", "Fire", "Earth", "Light", "Dark"};
        String[] runeDissolved = new String[3];
        Hero[] heroesList = team.getHeroList();
        
        int round = 1;
        
        while (team.getHp() > 0 && enemy.getHp() > 0) {
            System.out.println("\nRound " + round);
            
            enemy.decreaseCd();
            if (enemy.getCurrentCd() == 0) {
                enemy.resetCd();
            }
            // Reset rsMultiplier each round
            int[] rsMultiplier = new int[heroesList.length]; 
            
            System.out.println("Enemy's current CD: " + enemy.getCurrentCd());
            System.out.println("Runestones dissolved:");
            
            for (int i = 0; i < runeDissolved.length; i++) {
                runeDissolved[i] = runestones[rd.nextInt(runestones.length)];
                System.out.println(" - " + runeDissolved[i]);
                for (int j = 0; j < heroesList.length; j++) {
                    if (heroesList[j].getElement().equals(runeDissolved[i])) {
                        rsMultiplier[j]++;
                    }
                }
            }
            System.out.println("");
            
            double totalDamage = 0;
            for (int i = 0; i < heroesList.length; i++) {
                double damage = heroesList[i].calculateDamage(enemy, rsMultiplier[i]);
                if (damage != 0) {
                    System.out.printf("%s dealt %.1f damage to %s\n", heroesList[i].getName(), damage, enemy.getName());
                    totalDamage += damage;
                }
            }
            
            if (totalDamage == 0) {
                System.out.println("No hero attacked in this round");
            }else{
                enemy.getDamaged(totalDamage);
            }
            
            // enemy can attack when its hp > 0
            if (enemy.getCurrentCd() == enemy.getInitialCd() && enemy.getHp() > 0) {
                team.getDamaged(enemy.getAttack());
                System.out.printf("%s dealt %.1f damage to the team\n", enemy.getName(), enemy.getAttack());
            }
            
            System.out.println("\nTeam's remaining HP: " + team.getHp());
            System.out.println("Enemy's remaining HP: " + enemy.getHp());
            
            if(enemy.getHp() == 0){
                System.out.println("\nThe team won!");
            }else if (team.getHp() == 0) {
                System.out.println("\nThe team lose."); 
            }
            
            round++;
        }   
    }
}