/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q2;

/**
 *
 * @author tianlongc
 */
public class Zoo {
    private Creature[] creatures;
    private int count; // Tracks the number of creatures added
    
    public Zoo(int size){
        creatures = new Creature[size];
        count = 0;
    }
    
    public void addCreature(String species, double magicPower, String habitat){
        if (count < creatures.length) {
            creatures[count] = new Creature(species, magicPower, habitat);
            System.out.println(species + " added to the zoo.");
            count++;
        }else{
            System.out.println("Zoo is full! Cannot add more creatures.");
        }
    }
    
    public void feedCreature(String species, double foodAmount){
        boolean found = false;
        for (Creature creature: creatures) {
            if (creature.getSpecies().equalsIgnoreCase(species)) {
                creature.feed(foodAmount);
                System.out.println(creature.getSpecies() + "'s magic power increased to " + creature.getMagicPower());
                found = true;
                break; // exit once found a space
            }
        }
        if (!found) {
            System.out.println(species + " not found!");
        }
    }
    
    public void displayAllCreatures(){
        for (Creature creature: creatures) {
            creature.displayInfo();
        }
    }
}
