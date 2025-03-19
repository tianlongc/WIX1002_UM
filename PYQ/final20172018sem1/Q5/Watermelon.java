/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class Watermelon extends Fruit{
    private double weight;
    
    public Watermelon(String t, double w){
        super("Watermelon", t);
        this.weight = w;
    }
    
    public double totalPrice(){
        if (type.equalsIgnoreCase("Local")) {
            if (weight < 2) {
                return (weight * 2.25);
            }else if (weight >= 2 && weight <= 5){
                return (weight * 1.95);
            }else{
                return (weight * 1.65);
            }
        }else if (type.equalsIgnoreCase("Imported")){
            if (weight < 2) {
                return (weight * 3.75);
            }else if (weight >= 2 && weight <= 5){
                return (weight * 3.45);
            }else{
                return (weight * 3.15);
            }
        }else{
            return 0;
        }
    }
    @Override
    public String toString(){
        return (super.toString() + " - " + weight + "kg = RM " + totalPrice());
    }
}
