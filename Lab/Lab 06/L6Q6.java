/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author tianlongc
 */
public class L6Q6 {
    public static void main(String[] args) {

        displayPalindromicPrimes(20);
        displayEmirps(20);
    }
    
    public static void displayPalindromicPrimes(int n){
        int i = 0, number = 2;
        
        System.out.println("First " + n + " Palindromic Prime:");
        
        while (i < n) {
            if (isPalindromicPrime(number)) {
                System.out.printf("%d%s", number, (i != (n - 1)) ? ", " : "\n");
                i++;
            }
            number++;
        }
    }
    
    public static void displayEmirps(int n){
        int i = 0, number = 13;
        
        System.out.println("First " + n + " Emirps:");
        
        while (i < n){
            if(isEmirp(number)){
                System.out.printf("%d%s", number, (i != (n - 1)) ? ", " : "\n");
                i++;
            }
            number++;
        }
    }
    
    public static int reverse(int num){
    // Both emirps and palindromic primes are positive integers
        int reverse = 0;
        
        while (num > 0){
            reverse = (reverse * 10) + (num % 10);
            num /= 10;
        }
        
        return reverse;
    }
    
    public static boolean isPalindrome(int num){
        return num == reverse(num);
    }
    
    public static boolean isPalindromicPrime(int num){
        return isPrime(num) && isPalindrome(num);
    }
    
    public static boolean isPrime(int num){
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isEmirp(int num){
        if(!isPrime(num)){
            return false;
        }
        int reverse = reverse(num);
        return reverse != num && isPrime(reverse);
    }

}
