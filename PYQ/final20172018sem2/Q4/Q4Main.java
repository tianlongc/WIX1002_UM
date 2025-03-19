/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class Q4Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter the values for a, b, c, d, e and f : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        
        LinearEquation l = new LinearEquation(a, b, c, d, e, f);
        
        System.out.println(l.toString());
        
        if (l.isSolvable()) {
            System.out.printf("\nx = %d ; y = %d\n", l.computeX(), l.computeY());
        }else{
            System.out.println("\nthe equation has no solution");
        }
        
        sc.close();
    }
}
