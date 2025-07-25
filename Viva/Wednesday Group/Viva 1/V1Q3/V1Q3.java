/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1Q3;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class V1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter three integers for the aangles of a triangle: ");
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        
        int sum = angle1 + angle2 + angle3;
        
        if ((sum == 180) && (angle1 > 0 && angle2 > 0 && angle3 > 0)) {
            System.out.println("The triangle is valid.");
            if ((angle1 == 90) || (angle2 == 90) || (angle3 == 90)) {
                System.out.println("It is a right-angled triangle.");
            }
            // Equilateral, Isosceles, and Scalene are mutually exclusive
            if ((angle1 == angle2) && (angle2 == angle3) && (angle1 == angle3)) {
                System.out.println("It is an equilateral triangle.");
            }else if ((angle1 == angle2) || (angle2 == angle3) || (angle1 == angle3)){
                System.out.println("It is an isosceles triangle.");
            }else {
                System.out.println("It is a scalene triangle");
            }
        }else{
            System.out.println("The triangle is not valid.");
        }
        
        sc.close();
    }
}
