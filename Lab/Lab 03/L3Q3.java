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
public class L3Q3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input 
        Scanner sc = new Scanner(System.in);
        
        double rate;
        
        // Prompt message
        System.out.print("Please enter the sales volume: ");
        int sales_volume = sc.nextInt();
        
        if (sales_volume <= 100){
            rate = 0.05;
        }else if ((sales_volume > 100) && (sales_volume <= 500)) {
            rate = 0.075;
        }else if ((sales_volume > 500) && (sales_volume <= 1000)) {
            rate = 0.10;
        }else{
            rate = 0.125;
        }
        
        double commission = sales_volume * rate;
        
        System.out.printf("The commission is: %.2f\n", commission);
    }
}
