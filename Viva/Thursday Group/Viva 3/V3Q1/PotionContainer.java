/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q1;

/**
 *
 * @author tianlongc
 */
import java.util.ArrayList;

public class PotionContainer{
    private ArrayList<Potion> potions;
    
    public PotionContainer(){
        potions = new ArrayList<>(); // Initialize ArrayList
    }
    
    public void addPotion(String ingredient, double volume){
        potions.add(new Potion(ingredient, volume));
        System.out.printf("%.1f ml of %s added to the container.\n",volume, ingredient);
    }
    
    public void usePotion(String ingredient, double amount){
        boolean found = false; // flag to track if the ingredient was found
        for (Potion potion: potions){
            if (potion.getIngredient().equals(ingredient)){
                potion.consume(amount);
                found = true;
                break; // exit once it found the potion
            }
        }
        if(!found){
            System.out.println(ingredient + " is not found in the container"); // If the ingredient is not found
        }
    }
    
    public double getRemainingVolume(String ingredient){
        for (Potion potion: potions){
            if (potion.getIngredient().equals(ingredient)){
                return potion.getVolume();
            }
        }
        return 0.0; // if the ingredient is not found
    }
    
    public boolean isEnoughForPotion(double requiredUnicornTears, double requiredDragonBlood){
        double remainingUnicornTears = getRemainingVolume("Unicorn Tears");
        double remainingDragonBlood = getRemainingVolume("Dragon Blood");
        
        return (remainingUnicornTears >= requiredUnicornTears && remainingDragonBlood >= requiredDragonBlood);
    }
    
    public void printPotions(){
        System.out.println("\n--- Potion Inventory ---");
        for (Potion potion: potions){
            System.out.printf("%s: %.2f ml\n", potion.getIngredient(), potion.getVolume());
            }
        }
    
    // Check if there are enough ingredients for a custom recipe
    public boolean isEnoughForRecipe(Recipe recipe) {
        for (Potion requiredIngredient : recipe.getIngredients()) {
            double remainingVolume = getRemainingVolume(requiredIngredient.getIngredient());
            if (remainingVolume < requiredIngredient.getVolume()) {
                return false; // Not enough of this ingredient
            }
        }
        return true; // Enough of all ingredients
    }
    
    // Consume ingredients based on the recipe
    public void useRecipe(Recipe recipe) {
        if (isEnoughForRecipe(recipe)) {
            for (Potion requiredIngredient : recipe.getIngredients()) {
                usePotion(requiredIngredient.getIngredient(), requiredIngredient.getVolume());
                System.out.printf("Remaining volume of %s: %.1f ml\n", requiredIngredient.getIngredient(), getRemainingVolume(requiredIngredient.getIngredient()));
            }
            System.out.println("Successfully brewed " + recipe.getName() + "!");
        } else {
            System.out.println("Not enough ingredients to brew " + recipe.getName() + ".");
        }
    }
}
