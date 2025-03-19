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

public class Q5Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        int grammar = sc.nextInt();
        System.out.print("Enter the marks for Spelling (maximum 20 marks): ");
        int spelling = sc.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        int length = sc.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        int content = sc.nextInt();
        
        Essay e = new Essay(grammar, spelling, length, content);
        System.out.println(e.toString());
        
        sc.close();
    }
}
