/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q1;

/**
 *
 * @author tianlongc
 */
public class Potion {
    private String ingredient;
    private double volume;
    
    // Argument constructor
    public Potion(String ingredient, double volume){
        this.ingredient = ingredient;
        this.volume = volume;
    }
    
    // Accessor
    public String getIngredient(){
        return ingredient;
    }
    
    public double getVolume(){
        return volume;
    }
    
    public void consume(double amount){
        if (amount <= volume) {
            volume -= amount;
            System.out.printf("%.1f ml of %s used.\n", amount, getIngredient());
        } else {
            System.out.println("Not enough " + getIngredient() + " available.");
        }
    }
}
