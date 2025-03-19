/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L8Q3;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class WeightCalculator {
    private int age;
    private int height;
    
    public WeightCalculator(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        this.age = sc.nextInt();
        System.out.print("Enter height in cm: ");
        this.height = sc.nextInt();
        sc.close();
    }
    
    // Accessors
    public double getRecommendedWeight(){
        // make sure floating point division for age
        return ((height - 100 + age / 10.0) * 0.9); 
    }
    
    public int getAge(){
        return age;
    }
    
    public int getHeight(){
        return height;
    }
    
    public void display(){
        System.out.println("Your age is " + getAge());
        System.out.printf("Your height is %dcm\n", getHeight());
        System.out.printf("Your recommended weight is %.2fkg\n", getRecommendedWeight());
    }
}
