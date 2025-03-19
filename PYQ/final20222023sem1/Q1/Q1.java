/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author tianlongc
 */
import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        Random rd = new Random();
        
        int sum = 0, reverse = 0;
        
        int number = rd.nextInt(10000);
//        int number = 3122;
        System.out.println("Generated number: " + number);
        
        while (number > 0) {
            sum += number % 10;
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }
        
        System.out.println("Number in reverse order: " + reverse);
        System.out.println("The sum of all integers: " + sum);
    }
}
