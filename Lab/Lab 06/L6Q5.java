/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
import java.util.Random;

public class L6Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        int num1, num2, num3, score = 0;
        
        do {
            num1 = rd.nextInt(13);
            num2 = rd.nextInt(13);
            
            System.out.println("Enter negative number to quit.");
            System.out.printf("%d x %d = ",num1, num2);
            num3 = sc.nextInt();
            
            if (compare(num1, num2, num3)) {
                score++;
            }
            
        } while (num3 >= 0);
        
        System.out.println("Your Score is " + score);
        
        sc.close();
    }
    
    public static boolean compare(int x, int y, int z){
        return ((x*y)==z);
    }
}
