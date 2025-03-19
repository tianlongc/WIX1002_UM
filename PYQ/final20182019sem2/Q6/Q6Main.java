/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q6;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class Q6Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter customer name :");
        String name = sc.nextLine();
        
        System.out.print("Enter customer id:");
        String id = sc.nextLine();
        
        System.out.print("Enter quantity ordered: ");
        int quantity = sc.nextInt();
        
        System.out.print("Enter price per unit : ");
        double price = sc.nextDouble();
        
        Order o = new Order(name, id, quantity, price);
        System.out.println(o.toString());
        
        ShippedOrder so = new ShippedOrder("joe", "123", 10, 5.0);
        System.out.println(so.toString());
        
        sc.close();
    }
}
