/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q5;

/**
 *
 * @author tianlongc
 */
import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Customer> customers;
    
    public Bank(String bankName){
        this.bankName = bankName;
        this.customers = new ArrayList<>();
        System.out.println("Welcome to " + bankName + "!");
    }
    
    public void addCustomer(Customer customer){
        this.customers.add(customer);
    }
    
    public Customer getCustomer(String customerId){
        for (Customer customer: customers) {
            if (customer.getCustomerId().equalsIgnoreCase(customerId)) {
                return customer;
            }
        }
        return null;
    }
    
    public void displayAllCustomers(){
        System.out.println("Displaying all customers of " + bankName + ":");
        for (Customer customer: customers) {
            System.out.printf("Customer: %s, ID: %s\n", customer.getName(), customer.getCustomerId());
        }
    }
}
