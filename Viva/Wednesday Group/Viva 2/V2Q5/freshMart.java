/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V2Q5;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class freshMart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[] fruits = {"Apple", "Grape", "Banana", "Mango", "Orange", "Strawberry", "Blueberry"};
        int[] storage = {45, 57, 75, 34, 75, 65, 78};
        double[] price = {5.00, 10.00, 2.50, 6.00, 3.00, 15.00, 12.00};
        
        printFruit(fruits);
        
        System.out.print("Please enter the fruit you want to buy: ");
        String fruitSelect = in.nextLine();
        
        System.out.print("Unit or Box: ");
        int quantity = in.nextInt();
        
        int fruitIdx = getIdxFruit(fruits, fruitSelect);
        
        if (!haveProduct(fruits, fruitIdx)) {
            System.out.println("Sorry we currently do not offer this product.");
        } else if (!haveStock(fruitIdx, storage, quantity)) {
            System.out.println("Sorry, we do not have enough stock for " + fruits[fruitIdx] + ". Plese come agin later!");
        } else {
            System.out.println("Kindly Checkout here: ");
            generateBill(fruits, fruitIdx, price, quantity);
        }
        
        in.close();
    }
    
    public static void printFruit(String[] fruits){
        System.out.println("FreshMart Fruit Selection");
        for (int i = 0; i < fruits.length; i++) {
            System.out.printf("%d. %s\n", (i+1), fruits[i]);
        }
    }
    
    public static int getIdxFruit(String[] fruits, String fruitSelect){
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equalsIgnoreCase(fruitSelect)) {
                return i;
            }
        }
        return -1; // not found
    }
    
    public static boolean haveProduct(String[] fruits, int fruitIdx){
        return fruitIdx != -1;
    }
    
    public static boolean haveStock(int fruitIdx, int[] storage, int quantity){
        return storage[fruitIdx] >= quantity;
    }
    
    public static void generateBill(String[] fruits, int fruitIdx, double[] price, int quantity){
        System.out.println("-------------------------------------------------------------");
        System.out.println("-----------------Fresh Mart Receipt-------------------");
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%s%25s  %s\n", "Product", "Quantity", "Price per Unit(RM)");
        System.out.printf("%-24s%7d  %18.2f\n", fruits[fruitIdx], quantity, price[fruitIdx]);
        System.out.println("-------------------------------------------------------------");
        System.out.printf("Total Price: RM%.2f\n", (quantity * price[fruitIdx]));
        System.out.println("-------------------------------------------------------------");

    }
}
