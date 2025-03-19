/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L8Q2;

/**
 *
 * @author tianlongc
 */
public class L8Q2 {}

class Tester{
    public static void main(String[] args) {
        BankAccount a = new BankAccount("John Doe", "060402-01-1379","PA0940443",1000);
        
        a.deposit(1000);
        a.displayBalance();
        a.withdraw(1500);
        a.displayBalance();
        
    }
    
}
