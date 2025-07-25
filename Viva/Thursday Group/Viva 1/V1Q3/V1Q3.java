/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1Q3;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class V1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String factors = "";
        String primes = "";
        int nfactor = 0, sum = 0;
        int product = 1;
        boolean isPrime = true, overflow = false;
        
        // Prompt message
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        
        if (number > 0) {
            if (number <= 1) {
                isPrime = false;
            }else{
                // Check isPrime function
                for (int i = 2; i < Math.sqrt(number); i++) {
                    if ((number % i) == 0) {
                        isPrime = false;
                        break; // exits once it found a factor
                    }
                }
            }
        }else{
            System.out.println("Please enter a postive integer!");
            return;
        }
        
        if (isPrime) {
            System.out.println("Integer is a prime number");
        }else{
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    factors += String.format("%d%s", i, (i != number)? ", ": "");
                    sum += i;
                    nfactor++;
                    // Check for overflow
                    if (product > Integer.MAX_VALUE / i) {
                        overflow = true;
                    }else{
                        product *= i;
                    }
                }
            }
            
            System.out.println("Integer is not a prime number, it has " + nfactor + " factors");
            System.out.println("The factors of this integer are: \n" + factors);
            System.out.println("The sum of the factors is " + sum);
            
            if (overflow) {
                System.out.println("The product of the factors is too large to display");
            }else{
                System.out.println("The product of the factors is " + product);
            }
            
            // Check perfect number condition
            if ((sum-number) == number){
                System.out.println(number + " is a perfect number.");
            }else{
                System.out.println(number + " is not a perfect number.");
            }
            
            if (!isPrime && number != 1) {
                for (int prime = 2; prime <= number; prime++) {
                    isPrime = true;
                    for (int i = 2; i < Math.sqrt(prime); i++) {
                        if (prime % i == 0) {
                            isPrime = false;
                            break; // No need to check further if divisible
                        }
                    }
                    if (isPrime) {
                        primes += String.format("%s%d", (prime == 2)? "": ", ", prime);
                    }
                }
                System.out.println("Prime numbers between 2 and " + number + ": " + primes);
            }
        }
        
        sc.close();
    }
}