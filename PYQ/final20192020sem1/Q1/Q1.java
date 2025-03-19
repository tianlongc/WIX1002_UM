/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
// Filename: Q1.java
public class Q1 {
    public static void main(String[] args) {
        System.out.println("This program changes all the odd numbers in the array into even numbers.");
        // Error: System.in
        Scanner s = new Scanner(System.in);
        int size = 5;
        // Error: Array int
        int[] num = new int[size];
        System.out.print("Enter five integer numbers: ");
        // Error: wrong array index!!! array starts from 0
        for (int i = 0; i < size; i++) {
            // Error: use Int instead of double
            num[i] = s.nextInt();
        }
        convert(num);
        
        System.out.print("The numbers are: ");
        for (int i = 0; i < num.length; i++) {
            // use elements instead of the memory address
            System.out.print(num[i] + " ");
        }
        System.out.println("");
    }
    // add static
    public static void convert(int[] a){
        // use a.length not length()
        for (int i = 0; i < a.length; i++) {
            // use elements a[i] not the whole array
            if (a[i]%2==1) {
                a[i]+=1;
            }
        }
    }
}
