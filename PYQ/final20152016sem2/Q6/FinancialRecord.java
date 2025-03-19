/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q6;

/**
 *
 * @author tianlongc
 */
public class FinancialRecord {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    
    public FinancialRecord(){
        
    }
    
    public FinancialRecord(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    
    // Accessor
    public int getId(){
        return this.id;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public double getInterest(){
        return this.annualInterestRate;
    }
    
    // Mutator
    public void setId(int id){
        this.id = id;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public void setInterest(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
    // Method
    public double getMonthlyInterestRate(){
        // Ensures floating point division
        return (this.annualInterestRate / 12.0);
    }
    
    public void withdraw(double amount){
        if (amount > balance) {
            System.out.println("The amount of withdraw cant be exceed balance!");
        }else if (amount < 0) {
            System.out.println("The amount of withdraw cant be negative!");
        }else{
            System.out.printf("Previous balance: RM%.1f\n", this.balance);
            this.balance -= amount;
            System.out.printf("Current balance after withdrawal of RM%6.1f is: RM%.1f\n", amount, this.balance);
        }
    }
    
    public void deposit(double amount){
        if (amount < 0) {
            System.out.println("The amount of deposit cant be negative!");
        }else{
            System.out.printf("Previous balance: RM%.1f\n", this.balance);
            this.balance += amount;
            System.out.printf("Current balance after deposit of RM%6.1f is: RM%.1f\n", amount, this.balance);
        }
    }
    
    public void displayRecordInfo(){
        System.out.println("Financial record id is: " + this.id);
        System.out.printf("Financial record balance is: RM%.1f\n", this.balance);
        System.out.printf("Annual interest rate is: %.2f\n", this.annualInterestRate);
    }
    
}
