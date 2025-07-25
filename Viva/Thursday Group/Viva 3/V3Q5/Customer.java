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

public class Customer {
    private String name;
    private String customerId;
    private ArrayList<BankAccount> accounts;
    
    public Customer(String name, String customerId){
        this.name = name;
        this.customerId = customerId;
        this.accounts = new ArrayList<>();
        System.out.printf("Creating a new customer: %s (ID: %s)\n", this.name, this.customerId);
    }
    
    public void addAccount(BankAccount account){
        this.accounts.add(account);
    }
    
    public BankAccount getAccount(String accountNumber){
        for (BankAccount account: accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
    
    // Accessors
    public String getName(){
        return name;
    }
    
    public String getCustomerId(){
        return customerId;
    }
    
    public void displayAccounts(){
        System.out.println("Displaying all accounts for customer " + name + ":");
        for (BankAccount account: accounts) {
            System.out.printf("Account Number: %s, Balance: $%.1f\n", account.getAccountNumber(), account.getBalance());
        }
    }
}
