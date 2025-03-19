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
        PermanentStaff p1 = new PermanentStaff("Abdul Razak", "871001-14-1765", "EM02");
        PartTimeStaff p2 = new PartTimeStaff("Tengku Ali", "911223-08-3301", 35);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
