/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L8Q6;

/**
 *
 * @author tianlongc
 */
public class L8Q6 {}
    
class Tester{
    public static void main(String[] args) {
        
        Burger b1 = new Burger("1");
        Burger b2 = new Burger("2");
        Burger b3 = new Burger("3");
        
        b1.sold(10);
        b2.sold(20);
        b3.sold(30);
        b1.sold(40);
        
        b1.displaySales();
        b2.displaySales();
        b3.displaySales();
        Burger.displayTotalSales();
    }
}
