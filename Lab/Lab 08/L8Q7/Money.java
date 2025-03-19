/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L8Q7;

/**
 *
 * @author tianlongc
 */
public class Money {
    private double amount;
    private int note100 = 0;
    private int note50 = 0;
    private int note10 = 0;
    private int note5 = 0;
    private int note1 = 0;
    private int cent50 = 0;
    private int cent20 = 0;
    private int cent10 = 0;
    private int cent5 = 0;
    
    // Rounding
    public Money(double amount){
        // get the last decimal point number
        int lastDP = (int)(amount * 100) % 10;
        
        switch(lastDP){
            // enhanced switch case
            case 1, 2 -> {
                amount = Math.floor(amount * 10)/ 10.0;
            }
            case 3, 4, 6, 7 -> {
                amount = Math.floor(amount/ 10.0) + 0.05;
            }
            case 8,9 -> {
                amount = Math.ceil(amount * 10.0) / 10.0;
            }
        }
        this.amount = amount;
    }
    
    public void CalculateMoney(){
        int amountInt = (int)amount; 
        int amountDp = (int)(amount * 100) % 100;

        // integer part
        note100 = amountInt / 100;
        amountInt -= note100 * 100;
        note50 = amountInt / 50;
        amountInt -= note50 * 50;
        note10 = amountInt / 10;
        amountInt -= note10 * 10;
        note5 = amountInt / 5;
        amountInt -= note5 * 5;
        note1 = amountInt; // remainder
        
        // decimal part
        cent50 = amountDp / 50;
        amountDp -= cent50 * 50;
        cent20 = amountDp / 20;
        amountDp -= cent20 * 20;
        cent10 = amountDp / 10;
        amountDp -= cent10 * 10;
        cent5 = (amountDp == 5) ? 1 : 0;
    }
    
    public void add(Money a){
        amount += a.amount;
        System.out.printf("Amount after addition: RM%.2f\n", amount);
    }
    
    public void subtract(Money a){
        amount -= a.amount;
        System.out.printf("Amount after subtraction: RM%.2f\n", amount);
    }
    
    // accessor
    public double getAmount(){
        return amount;
    }
    
    public void displayMoney(){
        CalculateMoney();
        System.out.println("RM100: " + note100);
        System.out.println("RM50: " + note50);
        System.out.println("RM10: " + note10);
        System.out.println("RM5: " + note5);
        System.out.println("RM1: " + note1);
        System.out.println("50cent: " + cent50);
        System.out.println("20cent: " + cent20);
        System.out.println("10cent: " + cent10);
        System.out.println("5cent: " + cent5);
        System.out.println("");
    }
}
