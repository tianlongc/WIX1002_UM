/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1Q3;

/**
 *
 * @author tianlongc
 */
// The answer is only for research purpose
// The program must use only flow control constructs (no arrays, methods, or external libraries).
import java.util.ArrayList;
import java.util.Scanner;

public class V1Q3ex {
    public static void main(String[] args) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        ArrayList<Integer> primes = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int product = 1;
        boolean isPrime = true, isPerfect = false, overflow = false;
        
        System.out.print("Please enter a positive integer: ");
        int number = sc.nextInt();
        
        if (number > 0){
            if (number <= 1){
                isPrime = false;
            }else{
                // Check isPrime function
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if ((number % i) == 0){
                        isPrime = false;
                        break; // exits once it found a factor
                    }
                }
            }
        }else{
            System.out.println("Please enter a positive integer!");
            return; // exits the program 
        }
        
        if(isPrime){
            System.out.println("Integer is a prime number");
        }else{
            for (int i = 1; i <= number; i++) {
                if (number % i == 0){
                    factors.add(i);
                }
            }
            System.out.println("Integer is not a prime number, it has " + factors.size() + " factors");
            System.out.println("The factors of this integer are: ");
            
            for (int i = 0; i < factors.size() ; i++) {
                sum += factors.get(i);
                
                // Number overflows when converted into binary (sign magnitude)
                if (!overflow) {
                    if (product < 0){
                        overflow = true;
                    }else{
                        product *= factors.get(i);
                    }
                }
                
                System.out.printf("%d%s", factors.get(i), (i != factors.size() - 1) ? ", " : "\n");
            }
            
            if ((sum - number) == number){
                isPerfect = true;
            }
            
            System.out.println("The sum of the factors is " + sum);
            
            if (overflow){ // product > Integer.MAX_VALUE
                System.out.println("The product of the factors is too large to display");
            } else {
                System.out.println("The product of the factors is " + product);
            }
        }
        
        if(isPerfect){
            System.out.println(number + " is a perfect number.");
        }else{
            System.out.println(number + " is not a perfect number.");
        }
        
        // isPrime checking
        for (int prime = 2; prime <= number; prime++) {
            isPrime = true;
            
            for (int i = 2; i <= Math.sqrt(prime); i++) {
                if (prime % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primes.add(prime);
            }
        }
        
        // if the input number is not prime
        if(!isPrime && number != 1){
            System.out.print("Prime numbers between 2 and " + number + ": ");
            for (int i = 0; i < primes.size(); i++) {
                System.out.printf("%d%s", primes.get(i), (i != primes.size() - 1) ? ", " : "\n");
            }
        }
        
        sc.close();
    }
}
