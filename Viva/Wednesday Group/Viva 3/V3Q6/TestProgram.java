/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q6;

/**
 *
 * @author tianlongc
 */
public class TestProgram {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1200.00, 10);
        Product phone = new Product("Smartphone", 800.00, 5);
        Product powerBank = new Product("Power Bank", 100.00, 0);
        
        Customer customer = new Customer("John Doe", "john@example.com", "1234 Main St");
        
        Inventory inventory = new Inventory();
        inventory.addProduct(laptop, 10);
        inventory.addProduct(phone, 5);
        inventory.addProduct(powerBank, 0);
        
        Order order = new Order();
        if (inventory.isAvailable(laptop, 1)) {
            order.addProduct(laptop);
            inventory.updateStock(laptop, 1);
        } else {
            System.out.println(laptop.getName() + " is out of stock.");
        }
        
        if (inventory.isAvailable(phone, 2)) {
            order.addProduct(phone);
            inventory.updateStock(phone, 2);
        } else {
            System.out.println(phone.getName() + " is out of stock.");
        }
        
        if (inventory.isAvailable(powerBank, 1)) {
            order.addProduct(powerBank);
            inventory.updateStock(powerBank, 1);
        } else {
            System.out.println(powerBank.getName() + " is out of stock.");
        }
        
        Invoice invoice = new Invoice(order, customer);
        System.out.println(invoice);
    }
}
