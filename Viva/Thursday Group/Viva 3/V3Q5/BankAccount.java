/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q5;

/**
 *
 * @author tianlongc
 */
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    
    public BankAccount(String accountNumber, String accountHolderName){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountNumber;
        this.balance = 0.0; // default
    }
    
    public void deposit(double amount){
        if (amount > 0) {
            this.balance += amount;
        }else{
            System.out.println("Invalid deposit amount! Please enter a positive value for deposit.\n");
        }
    }
    
    public boolean withdraw(double amount){
        return (amount <= balance && amount > 0);
    }
    
    // Accessor methods
    public String getAccountNumber(){
        return accountNumber;
    }
    
    public String getAccountHolderName(){
        return accountHolderName;
    }
    
    public double getBalance(){
        return balance;
    }
    
    // Mutator
    public void setBalance(double balance){
        this.balance = balance;
    }
}
