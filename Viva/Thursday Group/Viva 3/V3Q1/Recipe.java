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

public class Recipe {
    private String name;
    private ArrayList<Potion> ingredients;

    public Recipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    // Add an ingredient to the recipe
    public void addIngredient(String ingredient, double volume) {
        ingredients.add(new Potion(ingredient, volume));
    }

    // Get the list of ingredients
    public ArrayList<Potion> getIngredients() {
        return ingredients;
    }

    // Get the recipe name
    public String getName() {
        return name;
    }
}
