/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author tianlongc
 */
/* 
    in UML Diagram,
    - sign indicates private modifiers
    + sign indicates public modifiers
*/
public class Pizza {
    private String size;
    private int numOfCheeseTopping;
    private int numOfBeefTopping;
    private int numOfChickenTopping;
    
    // No argument constructor
    public Pizza(){
        
    }
    
    // Argument constructor
    public Pizza(String size, int numOfCheeseTopping, int numOfBeefTopping, int numOfChickenTopping){
        this.size = size;
        this.numOfCheeseTopping = numOfCheeseTopping;
        this.numOfBeefTopping = numOfBeefTopping;
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    // Accessors
    public String getSize(){
        return size;
    }
    
    public int getNumOfCheeseTopping(){
        return numOfCheeseTopping;
    }
    
    public int getNumOfBeefTopping(){
        return numOfBeefTopping;
    }
    
    public int getNumOfChickenTopping(){
        return numOfChickenTopping;
    }
    
    // Mutators
    public void setSize(String size){
        this.size = size;
    }
    
    public void setNumOfCheeseTopping(int numOfCheeseTopping){
        this.numOfCheeseTopping = numOfCheeseTopping;
    }
    
    public void setNumOfBeefTopping(int numOfBeefTopping){
        this.numOfBeefTopping = numOfBeefTopping;
    }
    
    public void setNumOfChickenTopping(int numOfChickenTopping){
        this.numOfChickenTopping = numOfChickenTopping;
    }
    
    public double computeCost(){
        double price = 0.0;
        int numTopping = numOfCheeseTopping + numOfBeefTopping + numOfChickenTopping;
        if (size.equalsIgnoreCase("Small")) {
            price = 10 + (2 * numTopping);
        }else if (size.equalsIgnoreCase("Medium")){
            price = 12 + (2 * numTopping);
        }else if(size.equalsIgnoreCase("Large")){
            price = 14 + (2 * numTopping);
        }else{
            System.out.println("Invalid size! Please try again.");
        }
        return price;
    }
    
    public void display(){
        System.out.println("Pizza Size: " + getSize());
        System.out.println("Number of Cheese Toppings: " + getNumOfCheeseTopping());
        System.out.println("Number of Beef Toppings: " + getNumOfBeefTopping());
        System.out.println("Number of Chicken Toppings: " + getNumOfChickenTopping());
        System.out.printf("Total cost: $%.2f\n", computeCost());
    }
}
