/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

// Template to create custom exception
class InvalidAgeException extends Exception{
    
    public InvalidAgeException(String message){
        super(message);
    }
}
    
public class CustomException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        try{
            checkAge(age);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
    
    public static void checkAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("The age is less than 18!");
        }else{
            System.out.println("Valid age");
        }
    }
}

