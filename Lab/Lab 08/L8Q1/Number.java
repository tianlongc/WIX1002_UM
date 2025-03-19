/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l8q1;

/**
 *
 * @author tianlongc
 */
import java.util.Random;

public class Number {
    private int[] numbers;
    private int max = Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;
    private double average = 0.0;
    Random rd = new Random();
    
    public Number(){
        numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rd.nextInt(100);
        }
    }
    
    public Number(int size){
        numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rd.nextInt(100);
        }
    }
    
    public Number(int size, int highest){
        numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rd.nextInt(highest);
        }
    }
    
    public void displayArray(){
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d%s", numbers[i], (i != numbers.length - 1) ? " ": "\n");
        }
    }
    
    public void displayEven(){
        System.out.print("Even: ");
        for (int number: numbers) {
            if (number % 2 == 0){
                System.out.print(number + " ");
            }
        }
        System.out.println("");
    }
    
    public void displayPrime(){
        System.out.print("Prime: ");
        for (int number: numbers) {
            if (number <= 1){
                continue;
            }
            
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(number); j++) {
                if(number % j == 0){
                    isPrime = false;
                    break; // stop once found a factor
                }
            }
            if(isPrime){
                System.out.print(number + " ");
            }
        }
        System.out.println("");
    }
    
    public void displayMaxMin(){
        for (int number: numbers){
            max = Math.max(max, number);
            min = Math.min(min, number);
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
    
    public void displayAverage(){
        double sum = 0.0;
        for (int number: numbers){
            sum += number;
        }
        average = sum/numbers.length;
        
        System.out.println("Average: " + average);
    }
    
    public void displaySquare(){
        System.out.print("Square numbers: ");
        for (int number: numbers) {
            int sqrt = (int) Math.sqrt(number);
            if ((sqrt * sqrt) == number){
                System.out.print(number + " ");
            }
        }
        System.out.println("");
    }
    
    public void display(){
        displayArray();
        displayEven();
        displayPrime();
        displayMaxMin();
        displayAverage();
        displaySquare();
    }
}

