/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L10Q1;

/**
 *
 * @author tianlongc
 */
public class Tester {
    public static void main(String[] args) {
       PermanentStaff p1 = new PermanentStaff("John", 'B');
       ContractStaff p2 = new ContractStaff("Ahmad", 4000);
       TemporaryStaff p3 = new TemporaryStaff("Lim", 40);
       
       p1.display();
       p2.display();
       p3.display();
    }
    
}
