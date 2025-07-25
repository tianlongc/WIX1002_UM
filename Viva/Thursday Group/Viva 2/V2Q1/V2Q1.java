/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V2Q1;

/**
 *
 * @author tianlongc
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class V2Q1 {
    // Use global variables to do calculation ensures the data is accessible across all methods
    private static double balance = 1000.0;
    private static List<String> transactionHistory = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Bank!");
        
        while (true) {
            System.out.print("1. Check Balance\n2. Deposit Money\n3. Withdraw Money\n4. View Transaction History\n5. Exit \nChoose an option: ");
            
            int option = sc.nextInt();
            
            if (option >= 1 && option <= 5) {
                if (option == 1) {
                    checkBalance();
                }else if (option == 2) {
                    System.out.print("Enter amount to deposit: ");
                    double amount = sc.nextDouble();
                    deposit(amount);
                }else if (option == 3) {
                    System.out.print("Enter amount to withdraw: RM");
                    double amount = sc.nextDouble();
                    withdraw(amount);
                }else if (option == 4) {
                    printTransactions();
                }else if (option == 5) {
                    System.out.println("\nThank you for using our banking system!");
                    System.out.printf("Your final balance is: RM%.2f\n", balance);
                    break;
                }
            } else {
                System.out.println("Invalid input! Please enter from 1 to 5 only.");
            }
        
        }
        sc.close();
    }
    
    public static void checkBalance(){
        System.out.printf("Current balance: %.2f\n\n", balance);
    }
    
    public static void deposit(double amount){
        if(amount > 0){
            balance += amount;
            transactionHistory.add(String.format("Deposited: RM%.2f", amount));
            System.out.printf("Your balance is now: %.2f\n\n", balance);
        } else {
            System.out.println("Invalid deposit amount! Please enter a positive value for deposit.\n");
        }
    }
    
    public static void withdraw(double amount){
        if(amount <= 0){
            System.out.println("Invalid withdrawal amount! Please enter a positive value for withdraw.\n");
        }else if (amount > balance){
            System.out.println("Insufficient balance for withdrawal! Please enter an amount lower than or equal to the current balance.\n");
        } else {
            balance -= amount;
            transactionHistory.add(String.format("Withdrew: RM%.2f", amount));
            System.out.printf("Your balance is now: RM %.2f\n\n", balance);
        }
    }
    
    public static void printTransactions(){
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions found.\n");
        } else {
            System.out.println("Transaction History:");
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
            System.out.println("");
        }
    }
}
