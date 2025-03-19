/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L8Q2;

/**
 *
 * @author tianlongc
 */
public class BankAccount {
    private String name = "";
    private String IC = "";
    private String passportNumber = "";
    private double balance = 0;
    
    public BankAccount(String n, String ic, String p, double b){
        this.name = n;
        this.IC = ic;
        this.passportNumber = p;
        this.balance = b;
        System.out.printf("== Bank Account ==\nName: %s\nIC: %s\nPassport Number: %s\nBalance: RM%.2f\n\n", this.name, this.IC, this.passportNumber, this.balance);
        
    }
    
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.printf("Deposited RM%.2f\n", amount);
        } else{
            System.out.println("Invalid deposit amount!");
        }
        
    }
    
    public void withdraw(double amount){
        if (amount > balance) {
            System.out.println("The withdraw amount exceed your current balance!");
        } else if(amount < 0){
            System.out.println("Invalid withdrawal amount!");
        } else {
            balance -= amount;
            System.out.printf("Withdrawed RM%.2f\n", amount);
        }
    }
    
    public void displayBalance(){
        System.out.printf("Current balance: RM%.2f\n", this.balance);
    }
    
}
