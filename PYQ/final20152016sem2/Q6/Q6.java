/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q6;

/**
 *
 * @author tianlongc
 */
public class Q6 {
    public static void main(String[] args) {
        FinancialRecord acc_a = new FinancialRecord(1234, 10000.0);
        acc_a.setInterest(7.77);
        System.out.println("The information about financial record A is as follows:");
        acc_a.displayRecordInfo();
        
        System.out.println("");
        
        // Modification
        FinancialRecord acc_b = new FinancialRecord(1235, 20000);
        acc_b.setInterest(8.0);
        acc_b.setId(1001);
        System.out.println("The information about financial record B is as follows:");
        acc_b.displayRecordInfo();
        System.out.println("The monthly interest rate is: " + acc_b.getMonthlyInterestRate());
        acc_b.deposit(1500);
        acc_b.withdraw(500);
        
    }
}
