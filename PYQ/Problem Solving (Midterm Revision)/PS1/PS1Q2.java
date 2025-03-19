/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS1;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class PS1Q2 {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        double total = 0;
        double price = 0;            
        while (true) {
            System.out.print("Enter the type of durian [Quit] to teriminate: ");
            String type = sc.nextLine();

            if (type.equalsIgnoreCase("Quit")) {
                System.out.printf("Total Sales : %.2f\n", total);
                break; // exit loop once quit is entered
            } else {
                System.out.print("Enter the sales in kg: ");
                double sales = sc.nextDouble();
                
                // Clean scanner
                sc.nextLine();
                
                if (type.equalsIgnoreCase("MK")){
                    price = 25 * sales;
                } else if (type.equalsIgnoreCase("HL")){
                    price = 22 * sales;
                } else if (type.equalsIgnoreCase("D24")){
                    price = 20 * sales;
                } else if (type.equalsIgnoreCase("UM")){
                    price = 18 * sales;
                } else {
                    System.out.println("Invalid type! Please try again!");
                }
                
                total += price;
            }
        }
        
        sc.close();
    }
}
