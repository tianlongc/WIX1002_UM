/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L8Q6;

/**
 *
 * @author tianlongc
 */
public class Burger {
    // Instance variable
    private String ID;
    private int numberBurgerSold;
    
    // Class variable
    private static int totalBurgerSold = 0;
    
    // Constructor
    public Burger(String id){
        this.ID = id;
        this.numberBurgerSold = 0;
    }
    
    // Accessor 
    public String getID(){
        return ID;
    }
    
    public int getSales(){
        return numberBurgerSold;
    }
    
    public static int getTotalSales(){
        return totalBurgerSold;
    }
    
    public void sold(int n){
        if (n > 0){
            this.numberBurgerSold += n;
            totalBurgerSold += n;
        } else {
            System.out.println("Invalid sales amount!");
        }
    }
    
    public void displaySales(){
        System.out.printf("Stall ID: %s sold %d burgers \n", getID(), getSales());
    }
    
    public static void displayTotalSales(){
        System.out.println("The total burger sold in all stalls: " + getTotalSales());
    }
    
}
