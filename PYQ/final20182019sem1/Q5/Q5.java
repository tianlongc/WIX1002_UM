/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class Q5 {
    public static void main(String[] args) {
        SpecialDelivery d1 = new SpecialDelivery("Ali", "Ahmad", 4.4, false, false);
        SpecialDelivery d2 = new SpecialDelivery("Ah Chong", "Fatimah", 63.1, false, false);
        SpecialDelivery d3 = new SpecialDelivery("FSKTM, UM", "FK, UM", 32.5, true, false);
        SpecialDelivery d4 = new SpecialDelivery("Ang", "Liew", 19.0, true, true);
        
        System.out.println(d1.toString() + "\n");
        System.out.println(d2.toString() + "\n");
        System.out.println(d3.toString() + "\n");
        System.out.println(d4.toString() + "\n");
        
        System.out.println("The total shipping cost is RM " + (d1.totalCost() + d2.totalCost() + d3.totalCost() + d4.totalCost()));
    }
}
