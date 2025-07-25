/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1Q4;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class V1Q4ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Use arrays to modularise the whole program
        String[] pizza = {"Chicken Peperoni","Chicken Supreme","Vegan Indulgence","Beef Delight","Margherita"};
        String[] drinks = {"Strawberry Smoothie","Banana Smoothie","Mocktail","Soft Drink","Mineral Water"};
        String[] dessert = {"Tiramisu","Strawberry Shortcake","Green Jello","Creme Brulee","Raspberry Pie"};
        int[] price_pizza = {15,18,12,22,9};
        int[] price_drinks = {8,8,12,5,3};
        int[] price_dessert = {7,10,4,15,20};
        boolean[] discount = {false, false, false};
        int option, page = 0;
        double total_price = 0;
        
        while (true) {
            switch(page){
                case 0:
                    System.out.println("\nWelcome to Maroni's Pizza!\n1. Pizza\n2. Drinks\n3. Dessert\n4. CHECKOUT");
                    break;
                case 1:
                    // PIZZA
                    System.out.println("\nPIZZA");
                    for (int i = 0; i < pizza.length; i++) {
                        System.out.printf("%d %s - RM%d\n",i+1, pizza[i], price_pizza[i]);
                    }
                    System.out.println("6 BACK TO MAIN MENU");
                    break;
                case 2:
                    // DRINKS
                    System.out.println("\nDRINKS");
                    for (int i = 0; i < drinks.length; i++) {
                        System.out.printf("%d %s - RM%d\n",i+1, drinks[i], price_drinks[i]);
                    }
                    System.out.println("6 BACK TO MAIN MENU");
                    break;
                case 3:
                    // PIZZA
                    System.out.println("\nDESSERT");
                    for (int i = 0; i < dessert.length; i++) {
                        System.out.printf("%d %s - RM%d\n",i+1, dessert[i], price_dessert[i]);
                    }
                    System.out.println("6 BACK TO MAIN MENU");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
                    break;
            }
            
            System.out.print("\nPick an option: ");
            option = sc.nextInt();
            
            if (page == 0) {
                if (option >= 1 && option <= 3) {
                    page = option;
                }
                else if(option == 4){
                    // CHECKOUT
                    System.out.println("\nYour total is RM" + total_price + "!");
                    if (discount[0] && discount[1] && discount[2]) {
                        System.out.println("You've availed the One-of-each offer. You get a 20% discount!");
                        System.out.printf("your new total is RM%.1f!\n\n", (total_price*0.8));
                    }
                    System.out.println("Have a nice day!");
                    break;
                }
                else{
                    System.out.println("Invalid option! Please try again.");
                }
            }
            else{
                if(option == 6){
                    page = 0;
                }
                else if(option >= 1 && option <= 5){
                    switch(page){
                        case 1:
                            System.out.println("Added " + pizza[option - 1]);
                            total_price += price_pizza[option - 1];
                            break;
                        case 2:
                            System.out.println("Added " + drinks[option - 1]);
                            total_price += price_drinks[option - 1];
                            break;
                        case 3:
                            System.out.println("Added " + dessert[option - 1]);
                            total_price += price_dessert[option - 1];
                            break;
                    }
                    discount[page-1] = true;
                    System.out.println("Current Total: RM" + total_price);
                }
                else{
                    System.out.println("Invalid option! Please try again.");
                }
            }
        }
        sc.close();
    }
}
