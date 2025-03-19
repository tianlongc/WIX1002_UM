/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class Apple extends Fruit{
    private int quantity;
    
    public Apple(String t, int q){
        super("Apple",t);
        this.quantity = q;
    }
    
    public double totalPrice(){
        if (type.equalsIgnoreCase("Green")) {
            return (quantity * 1.20);
        }else if (type.equalsIgnoreCase("Red")){
            return (quantity * 1.80);
        }else{
            return 0;
        }
    }
    @Override
    public String toString(){
        return (super.toString() + " - " + quantity + " = RM " + totalPrice());
    }
}
