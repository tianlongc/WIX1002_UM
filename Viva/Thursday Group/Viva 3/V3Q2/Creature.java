/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q2;

/**
 *
 * @author tianlongc
 */
public class Creature {
    private String species;
    private double magicPower;
    private String habitat;
    
    public Creature(String species, double magicPower, String habitat){
        this.species = species;
        this.magicPower = magicPower;
        this.habitat = habitat;
    }
    
    // Accessor methods
    public String getSpecies(){
        return species;
    }
    
    public double getMagicPower(){
        return magicPower;
    }
    
    public void feed(double foodAmount){
        this.magicPower += foodAmount;
    }
    
    public void displayInfo(){
        System.out.println("Species: " + this.species);
        System.out.println("Magic Power: " + this.magicPower);
        System.out.println("Habitat: " + this.habitat + "\n");
    }
}
