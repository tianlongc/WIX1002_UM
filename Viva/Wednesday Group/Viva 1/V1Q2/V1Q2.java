/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1Q2;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class V1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter the starting value : ");
        int start = sc.nextInt();
        System.out.print("Enter the ending value : ");
        int end = sc.nextInt();
        
        System.out.println("\nThe output is :");
        for (int i = start; i <= end; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("LuluLala"); // Multiple of both 3 and 5
            }else if (i % 3 == 0) {
                System.out.println("Lulu"); // Multiple of 3
            }else if(i % 5 == 0){
                System.out.println("Lala"); // Multiple of 5
            }else{
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
