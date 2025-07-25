/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1Q1;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class V1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int sum = 0;
        
        while (number > 0 || sum > 9) {
            if (number == 0){
                number = sum;
                sum = 0;
            }
            
            sum += (number % 10);
            number /= 10;
        }
        System.out.println("Sum of digits until single digit: " + sum);
        
//        int R = (number - 1) % 9;
//        System.out.println(R);
//        int digitalRoot = 1 + ((number - 1) % 9);
//        System.out.println("Digital root: " + digitalRoot);
//        
//        int digitalRoot2 = (number-9) * ((int)Math.ceil(number/9) - 1);
//        System.out.println("Digital root: " + digitalRoot2);
        
        sc.close();
    }
}
