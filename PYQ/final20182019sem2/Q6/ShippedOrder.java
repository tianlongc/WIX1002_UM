/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q6;

/**
 *
 * @author tianlongc
 */
public class ShippedOrder extends Order{
    
    public ShippedOrder(String customer_name, String customer_ID, int quantity_ordered, double unit_price){
        super(customer_name, customer_ID, quantity_ordered, unit_price);
    }
    
    @Override
    public double computeTotalPrice(){
        return (super.computeTotalPrice() + 4);
    }
    
    @Override
    public String toString(){
        return ("\nShipped" + super.toString());
    }
}
