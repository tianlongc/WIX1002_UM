/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q1;

/**
 *
 * @author tianlongc
 */
public class V3Q1 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("0011", "Van", "Toyota", 100.0, 50.0);
        v.calculateRentalCost(2);
        System.out.println(v);
        
        v.calculateRentalCost(14);
        System.out.println("\n" + v);
    }
}
