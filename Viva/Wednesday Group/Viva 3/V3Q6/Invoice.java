/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q6;

/**
 *
 * @author tianlongc
 */
public class Invoice {
    private Order order;
    private Customer customer;
    
    public Invoice(Order order, Customer customer){
        this.order = order;
        this.customer = customer;
    }
    
    @Override
    public String toString(){
        String orders = "";
        for (Product product: order.getProducts()) {
            orders += product + "\n";
        }
        return String.format("Invoice for %s\nShipping Address: %s\n\nProducts:\n%s\nTotal: RM%.2f", customer.getName(), customer.getShippingAddress(), orders, order.calculateTotal());
    }
}
