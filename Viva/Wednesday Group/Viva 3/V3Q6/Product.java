/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q6;

/**
 *
 * @author tianlongc
 */
public class Product {
    private String name;
    private double price;
    private int stock;
    
    // Argument Constructor
    public Product(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    
    // Accessor
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getStock(){
        return stock;
    }
    
    // Mutator
    public void setStock(int stock){
        this.stock = stock;
    }
    
    public void reduceStock(int qty){
        // Availability already handled in main program
        stock -= qty;
    }
    
    @Override
    public String toString(){
        return String.format("- %s: RM%.2f", name, price);
    }
}
