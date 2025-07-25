/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q2;

/**
 *
 * @author tianlongc
 */
import java.util.Random;

public class HeroParty {
    private Hero[] heroList;
    
    public HeroParty(Hero[] heroList){
        this.heroList = heroList;
    }
    
    public void sortList(){
        // Bubble Sort Implementation (ASC)
        for (int i = 0; i < heroList.length; i++) {
            for (int j = 0; j < heroList.length-i-1; j++) {
                if (heroList[j].getPower() > heroList[j+1].getPower()) {
                    Hero temp = heroList[j];
                    heroList[j] = heroList[j+1];
                    heroList[j+1] = temp;
                }
            }
        }
    }
    
    public void battleWinners(Monster enemy){
        double elementalRes = 0.0;
        for (Hero hero: heroList) {
            if (hero.getElement().equalsIgnoreCase("Pyro")) {
                elementalRes = enemy.getPyroResistance();
            }else if (hero.getElement().equalsIgnoreCase("Hydro")){
                elementalRes = enemy.getHydroResistance();
            }else if (hero.getElement().equalsIgnoreCase("Cryo")){
                elementalRes = enemy.getCyroResistance();
            }else if (hero.getElement().equalsIgnoreCase("Electro")){
                elementalRes = enemy.getElectroResistance();
            }
            
            double damage = hero.getPower() * ((100.0 - elementalRes)/100.0);
            
            if (damage >= enemy.getHp()) {
                System.out.println(hero.getName());
            }
        }
    }
    
    public void battleBoss(Monster boss){
        Random rd = new Random();
        double maxDamage = 0.0;
        Hero[] bestPair = new Hero[2];
        
        for (Hero hero1: heroList) {
            for (Hero hero2: heroList) {
                if (hero1 != hero2) {
                    double elementalRes1 = 0.0;
                    if (hero1.getElement().equalsIgnoreCase("Pyro")) {
                        elementalRes1 = boss.getPyroResistance();
                    }else if (hero1.getElement().equalsIgnoreCase("Hydro")){
                        elementalRes1 = boss.getHydroResistance();
                    }else if (hero1.getElement().equalsIgnoreCase("Cryo")){
                        elementalRes1 = boss.getCyroResistance();
                    }else if (hero1.getElement().equalsIgnoreCase("Electro")){
                        elementalRes1 = boss.getElectroResistance();
                    }
                    
                    double elementalRes2 = 0.0;
                    if (hero2.getElement().equalsIgnoreCase("Pyro")) {
                        elementalRes2 = boss.getPyroResistance();
                    }else if (hero2.getElement().equalsIgnoreCase("Hydro")){
                        elementalRes2 = boss.getHydroResistance();
                    }else if (hero2.getElement().equalsIgnoreCase("Cryo")){
                        elementalRes2 = boss.getCyroResistance();
                    }else if (hero2.getElement().equalsIgnoreCase("Electro")){
                        elementalRes2 = boss.getElectroResistance();
                    }
                    
                    double totalDamage = 0.0;
                    double multiplier1 = 1.0; // Assume multiplier1 for hero1 as 1
                    // Element Combination Special buff 
                    if ((hero1.getElement().equalsIgnoreCase("Pyro") && hero2.getElement().equalsIgnoreCase("Hydro")) ||
                            (hero1.getElement().equalsIgnoreCase("Hydro") && hero2.getElement().equalsIgnoreCase("Pyro"))) {
                        multiplier1 = 1.5;
                    }else if ((hero1.getElement().equalsIgnoreCase("Pyro") && hero2.getElement().equalsIgnoreCase("Cryo")) ||
                            (hero1.getElement().equalsIgnoreCase("Cryo") && hero2.getElement().equalsIgnoreCase("Pyro"))){
                        multiplier1 = 2.0;
                    }else if ((hero1.getElement().equalsIgnoreCase("Pyro") && hero2.getElement().equalsIgnoreCase("Electro")) ||
                            (hero1.getElement().equalsIgnoreCase("Electro") && hero2.getElement().equalsIgnoreCase("Pyro"))) {
                        totalDamage += rd.nextInt(51)+50; // between 50 to 100
                    }else if ((hero1.getElement().equalsIgnoreCase("Hydro") && hero2.getElement().equalsIgnoreCase("Electro")) ||
                            (hero1.getElement().equalsIgnoreCase("Electro") && hero2.getElement().equalsIgnoreCase("Hydro"))) {
                        totalDamage += (rd.nextInt(20)+1) * 5;
                        // Hydro x Cryo no buff
                    }else if ((hero1.getElement().equalsIgnoreCase("Electro") && hero2.getElement().equalsIgnoreCase("Cryo")) ||
                            (hero1.getElement().equalsIgnoreCase("Cryo") && hero2.getElement().equalsIgnoreCase("Electro"))) {
                        elementalRes2 *= 0.9; // reduce by 10%
                    }
                    
                    double damage1 = (hero1.getPower() * ((100.0 - elementalRes1)/100.0)) * multiplier1;
                    double damage2 = (hero2.getPower() * ((100.0 - elementalRes2)/100.0));
                    
                    totalDamage += damage1 + damage2;
                    
                    if (totalDamage > maxDamage) {
                        bestPair[0] = hero1;
                        bestPair[1] = hero2;
                        maxDamage = totalDamage;
                    }
                }
            }
        }
        
        System.out.printf("The pair with the highest damage: %s and %s\n", bestPair[0].getName(), bestPair[1].getName());
        System.out.println("Total damage dealt: " + maxDamage);
    }
}
