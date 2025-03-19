/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter values for a, b and c : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        QuadraticEquation q = new QuadraticEquation(a, b, c);
        
        System.out.printf("The equation is : %dx(^2) + (%d)x + (%d)\n", a, b, c);
        System.out.println("Discriminant: " + q.Discriminant());
        if (q.Discriminant() > 0) {
            System.out.printf("The roots : %d and %d\n", (int)q.calcRoot2(), (int)q.calcRoot1());
        }else if (q.Discriminant() == 0){
            System.out.println("Same roots : " + (int)q.calcRoot1());
        }else{
            System.out.println("The equation has no roots");
        }
        
        sc.close();
    }
}
