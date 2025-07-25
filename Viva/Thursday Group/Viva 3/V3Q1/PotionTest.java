/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q1;

/**
 *
 * @author tianlongc
 */

// Alllow user to create a new recipe he will decide how much ingredient is needed he make the potion
import java.util.Scanner;

public class PotionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PotionContainer container = new PotionContainer();
        
        System.out.println("Adding potions to the container...");
        container.addPotion("Unicorn Tears", 200.0);
        container.addPotion("Dragon Blood", 150.0);
        System.out.println("Potion container successfully initialized.\n");
        
        System.out.println("=== Using Potions ===");
        container.usePotion("Unicorn Tears", 50.0);
        System.out.println("Remaining volume of Unicorn Tears: " + container.getRemainingVolume("Unicorn Tears") + " ml");
        container.usePotion("Dragon Blood", 30.0);
        System.out.println("Remaining volume of Dragon Blood: " + container.getRemainingVolume("Dragon Blood") + " ml");
        System.out.println("\nAttempting to use more Dragon Blood than available...");
        container.usePotion("Dragon Blood", 200.0);
        System.out.println("Remaining volume of Dragon Blood: " + container.getRemainingVolume("Dragon Blood") + " ml");
        
        System.out.println("\n=== Checking Potion Availability for Invisibility Draught ===");
        double requiredUnicornTears = 200.0;
        double requiredDragonBlood = 150.0;
        boolean readyForInvisibilityDraught = container.isEnoughForPotion(requiredUnicornTears, requiredDragonBlood);
        
        System.out.println("\nCan prepare Invisibility Draught?");
        if (readyForInvisibilityDraught) {
            System.out.println("Yes, we have enough Unicorn Tears and Dragon Blood!");
        } else {
        System.out.println("No, we do not have enough ingredients to prepare the Invisibility Draught.");
        }
        
        System.out.println("\nFinal state of the potion container:");
        container.printPotions();
        
        // Prompt user to make a recipe
        System.out.println("\n=== Create a new Custom Recipe ===");
        System.out.print("Please enter a recipe name you wanted to create: ");
        String recipeName = sc.nextLine();
        
        Recipe customRecipe = new Recipe(recipeName);
        
        System.out.print("How many ingredients you are going to use: ");
        int quantity = sc.nextInt();
        sc.nextLine(); // clear input buffer
        
        // Add ingredients to the recipe
        for (int i = 1; i <= quantity; i++) {
            System.out.print("Enter ingredient " + i + ": ");
            String ingredient = sc.nextLine();
            System.out.print("Enter the required volume (in ml) for " + ingredient + ": ");
            double volume = sc.nextDouble();
            sc.nextLine(); // Clear the input buffer
            customRecipe.addIngredient(ingredient, volume);
        }
        
        // Check if the recipe can be brewed
        System.out.println("\n=== Brewing the Custom Recipe ===");
        container.useRecipe(customRecipe);

        // Print the final inventory
        System.out.println("\nFinal state of the potion container:");
        container.printPotions();
    }
}