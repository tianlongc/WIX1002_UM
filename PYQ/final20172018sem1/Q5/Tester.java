/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class Tester {
    public static void main(String[] args) {
        Fruit f1 = new Apple("Red",8);
        Fruit f2 = new Apple("Green", 11);
        Fruit f3 = new Watermelon("Local", 7.6);
        Fruit f4 = new Watermelon("Imported", 4);
        
        Fruit[] fruits = {f1, f2, f3, f4};
        double[] price = {f1.totalPrice(), f2.totalPrice(), f3.totalPrice(), f4.totalPrice()};
        double min = price[0];
        int cheapest = 0;
        
        // Use looping to find the cheapest price
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i].toString());
            if (price[i] < min) {
                min = price[i];
                cheapest = i;
            }
        }
        
        System.out.println("The cheapest item is \n" + fruits[cheapest].toString());
    }
}
