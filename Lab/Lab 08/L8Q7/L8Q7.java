/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L8Q7;

/**
 *
 * @author tianlongc
 */
public class L8Q7 {
    public static void main(String[] args) {
        Money m1 = new Money(900.85);
        double amount = m1.getAmount();
        System.out.printf("Amount after rounding: RM%.2f%n",amount);
        m1.displayMoney();
        
        Money m2 = new Money(50.82);
        double amount2 = m2.getAmount();
        System.out.printf("Amount after rounding: RM%.2f%n",amount2);
        m2.displayMoney();
        
        // Test addition method
        m1.add(m2);
        m1.displayMoney();
        
        // Test subtraction method
        m1.subtract(m2);
        m1.displayMoney();
    }
    
}
