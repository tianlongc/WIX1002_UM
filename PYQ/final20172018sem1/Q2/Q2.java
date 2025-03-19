/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author tianlongc
 */
import java.util.Random;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        int AAA = 0;
        int AA = 0;
        int A = 0;
        
        // Prompt message
        System.out.print("Enter N number: ");
        int N = sc.nextInt();
        
        System.out.print("The random numbers are: ");
        for (int i = 0; i < N; i++) {
            int number = rd.nextInt(100)+50;
            int lastDigit = number % 10;
            if (lastDigit >= 0 && lastDigit <= 3) {
                AAA++;
            }else if(lastDigit >= 4 && lastDigit <= 6){
                AA++;
            }else if(lastDigit >= 7 && lastDigit <= 9){
                A++;
            }
            System.out.printf("%d%s", number, (i != N-1) ? " ": "\n");
        }
        System.out.println("Group AAA: " + AAA);
        System.out.println("Group AA: " + AA);
        System.out.println("Group A: " + A);
        
        sc.close();
    }
}
