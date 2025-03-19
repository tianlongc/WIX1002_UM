/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class Q1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        
        System.out.print("Please enter n: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
        
        System.out.println("The sum of the series from 1 up to 1/"+ n +" is " + sum);
        
        sc.close();
    }
}
