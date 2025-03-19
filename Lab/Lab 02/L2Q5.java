/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2;

/**
 *
 * @author tianlongc
 */
import java.util.Random;
public class L2Q5 {
    public static void main(String[] args) {
        
        // Create an instance of Random class
        Random rd = new Random();
    
        int randomNumber = rd.nextInt(10001);
        System.out.println("The random number is " + randomNumber);
        
        int sum = 0;
        int number = randomNumber;
        
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        
        System.out.printf("The sum of all digits in %d is %d \n", randomNumber, sum);
    }
}
