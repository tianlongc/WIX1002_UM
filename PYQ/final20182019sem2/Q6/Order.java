/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q6;

/**
 *
 * @author tianlongc
 */
public class Order {
    protected String customer_name;
    protected String customer_ID;
    protected int quantity_ordered;
    protected double unit_price;
    
    // no-argument constructor
    public Order(){
        // Appropriate default values (Initializing 0 or null)
        this.customer_name = null;
        this.customer_ID = null;
        this.quantity_ordered = 0;
        this.unit_price = 0.0;
    }
    
    // Argument constructor with specified data values
    public Order(String customer_name, String customer_ID, int quantity_ordered, double unit_price){
        this.customer_name = customer_name;
        this.customer_ID = customer_ID;
        this.quantity_ordered = quantity_ordered;
        this.unit_price = unit_price;
    }
    
    // Accessor
    public String getCustomerName(){
        return customer_name;
    }
    
    public String getCustomerID(){
        return customer_ID;
    }
    
    public int getQuantityOrdered(){
        return quantity_ordered;
    }
    
    public double getUnitPrice(){
        return unit_price;
    }
    
    // Mutator
    public void setCustomerName(String customer_name){
        this.customer_name = customer_name;
    }
    
    public void setCustomerID(String customer_ID){
        this.customer_ID = customer_ID;
    }
    
    public void setQuantityOrdered(int quantity_ordered){
        this.quantity_ordered = quantity_ordered;
    }
    
    public void setUnitPrice(double unit_price){
        this.unit_price = unit_price;
    }
    
    public double computeTotalPrice(){
        double totalPrice = quantity_ordered * unit_price;
        return totalPrice;
    }
    
    @Override
    public String toString(){
        return ("\nOrder record\nCustomer Name : " + getCustomerName()
                + "\nCustomer Id : " + getCustomerID()
                + "\nQuantity ordered: " + getQuantityOrdered()
                + "\nUnit price : " + getUnitPrice()
                + "\nTotal price : " + computeTotalPrice());
    }
        
}
