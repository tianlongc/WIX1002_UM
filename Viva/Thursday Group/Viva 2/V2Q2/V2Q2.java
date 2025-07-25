/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package V2Q2;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class V2Q2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.println("Choose the shape to calculate the area:\n1. Circle\n2. Rectangle\n3. Triangle");
        
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                System.out.printf("The area of the circle is: %.2f\n", calculateCircleArea(radius));
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                System.out.printf("The area of the rectangle is: %.1f\n", calculateRectangleArea(length, width));
                break;
            case 3:
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                System.out.printf("The area of the triangle is: %.1f\n", calculateTriangleArea(base, height));
                break;
            default:
                System.out.println("Invalid choice! Please enter from 1 to 3 only!");
                break;
        }
        
        sc.close();
    }
    
    public static double calculateCircleArea(double radius){
        return Math.PI * (radius * radius);
    }
    
    public static double calculateRectangleArea(double length, double width){
        return length * width;
    }
    
    public static double calculateTriangleArea(double base, double height){
        return (base * height) / 2;
    }
    
}
