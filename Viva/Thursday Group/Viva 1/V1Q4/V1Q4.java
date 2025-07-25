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
public class V1Q4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int option, page = 0;
        double total_price = 0;
        boolean hasPizza = false, hasDrinks = false, hasDessert = false;
        
        while (true){
            switch(page){
                case 0:
                    System.out.println("Welcome to Maroni's Pizza!");
                    System.out.println("1. Pizza");
                    System.out.println("2. Drinks");
                    System.out.println("3. Dessert");
                    System.out.println("4. CHECKOUT");
                    break;
                case 1:
                    // PIZZA
                    System.out.println("\nPIZZA");
                    System.out.println("1 Chicken Peperoni - RM15");
                    System.out.println("2 Chicken Supreme - RM18");
                    System.out.println("3 Vegan Indulgence - RM12");
                    System.out.println("4 Beef Delight - RM22");
                    System.out.println("5 Margherita - RM9");
                    System.out.println("6 BACK TO MAIN MENU");
                    break;
                case 2:
                    // DRINKS
                    System.out.println("\nDRINKS");
                    System.out.println("1 Strawberry Smoothie - RM8");
                    System.out.println("2 Banana Smoothie - RM8");
                    System.out.println("3 Mocktail - RM12");
                    System.out.println("4 Soft Drink - RM5");
                    System.out.println("5 Mineral Water - RM3");
                    System.out.println("6 BACK TO MAIN MENU");
                    break;
                case 3:
                    // DESSERT
                    System.out.println("\nDESSERT");
                    System.out.println("1 Tiramisu - RM7");
                    System.out.println("2 Strawberry Shortcake - RM10");
                    System.out.println("3 Green Jello - RM4");
                    System.out.println("4 Creme Brulee - RM15");
                    System.out.println("5 Raspberry Pie - RM20");
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
                    if (hasPizza && hasDrinks && hasDessert) {
                        System.out.println("\nYour total is RM" + total_price + "!");
                        System.out.println("You've availed the One-of-each offer. You get a 20% discount!");
                        System.out.println("your new total is " + (total_price*0.8) + "!\n");
                    }else{
                        System.out.println("\nYour total is RM" + total_price + "!");
                        
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
                switch (page) {
                    case 1:
                        switch (option) {
                            case 1:
                                total_price += 15;
                                hasPizza = true;
                                System.out.println("Added Chicken Peperoni");
                                System.out.println("Current total : " + total_price);
                                break;
                            case 2:
                                total_price += 18;
                                hasPizza = true;
                                System.out.println("Added Chicken Supreme");
                                System.out.println("Current total : " + total_price);
                                break;
                            case 3:
                                total_price += 12;
                                hasPizza = true;
                                System.out.println("Added Vegan Indulgence");
                                System.out.println("Current total : " + total_price);
                                break;
                            case 4:
                                total_price += 22;
                                hasPizza = true;
                                System.out.println("Added Beef Delight");
                                System.out.println("Current total : " + total_price);
                                break;
                            case 5:
                                total_price += 9;
                                hasPizza = true;
                                System.out.println("Added Margherita");
                                System.out.println("Current total : " + total_price);
                                break;
                            case 6:
                                page = 0;
                                break;
                            default:
                                System.out.println("Invalid option! Please try again.");
                                break;
                        }
                        break;
                    case 2:
                        switch (option) {
                            case 1:
                                total_price += 8;
                                hasDrinks = true;
                                System.out.println("Added Strawberry Smoothie");
                                System.out.println("Current total : " + total_price);
                                break;
                            case 2:
                                total_price += 8;
                                hasDrinks = true;
                                System.out.println("Added Banana Smoothie");
                                System.out.println("Current total : " + total_price);
                                break;
                            case 3:
                                total_price += 12;
                                hasDrinks = true;
                                System.out.println("Added Mocktail");
                                System.out.println("Current total : " + total_price);
                                break;
                            case 4:
                                total_price += 5;
                                hasDrinks = true;
                                System.out.println("Added Soft Drink");
                                System.out.println("Current total : " + total_price);
                                break;
                            case 5:
                                total_price += 3;
                                hasDrinks = true;
                                System.out.println("Added Mineral Water");
                                System.out.println("Current total : " + total_price);
                                break;
                            case 6:
                                page = 0;
                                break;
                            default:
                                System.out.println("Invalid option! Please try again.");
                                break;
                        }
                        break;
                    case 3:
                        switch (option) {
                            case 1:
                                total_price += 7;
                                hasDessert = true;
                                System.out.println("Added Tiramisu");
                                System.out.println("Current total : " + total_price);
                                break;
                            case 2:
                                total_price += 10;
                                hasDessert = true;
                                System.out.println("Added Strawberry Shortcake");
                                System.out.println("Current total : " + total_price);
                                break;
                            case 3:
                                total_price += 4;
                                hasDessert = true;
                                System.out.println("Added Green Jello");
                                System.out.println("Current total : " + total_price);
                                break;
                            case 4:
                                total_price += 15;
                                hasDessert = true;
                                System.out.println("Added Creme Brulee");
                                System.out.println("Current total : " + total_price);
                                break;
                            case 5:
                                total_price += 20;
                                hasDessert = true;
                                System.out.println("Added Raspberry Pie");
                                System.out.println("Current total : " + total_price);
                                break;
                            case 6:
                                page = 0;
                                break;
                            default:
                                System.out.println("Invalid option! Please try again.");
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid option! Please try again.");
                        break;
                }
            }
            else{
                System.out.println("Invalid option! Please try again.");
                break;
            }        
        }
        }
        
        sc.close();
    }
}
