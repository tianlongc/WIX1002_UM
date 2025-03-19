/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class L3Q6 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter the radius of a circle: ");
        double radius = sc.nextDouble();
        
        System.out.print("Please enter a coordinate point (x, y) for x and y: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        
        double distance = Math.sqrt((x * x) + (y * y));
        
        // Compare the distance and center point of the circle
        if (distance <= radius){
            System.out.println("The coordinate point ("+ x + ", " + y + ") is inside the circle centered at (0, 0) ");
        }else{
            System.out.println("The coordinate point ("+ x + ", " + y + ") is outside the circle centered at (0, 0) ");
        }
        
        sc.close();
    }
}
