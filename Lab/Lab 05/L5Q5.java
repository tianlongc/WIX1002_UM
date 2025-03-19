/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
import java.util.Random;

public class L5Q5 {
    public static void main(String[] args) {
        // Create Sc object to read input
        Scanner sc = new Scanner(System.in);
        
        // Create an instance of Random class
        Random rd = new Random();
        
        int[] numbers = new int[20];
//        int numbers[] = {57, 53, 46, 83, 74, 99, 30, 75, 61, 89, 28, 30, 56, 41, 27, 32, 79, 48, 46, 88};

        System.out.println("A list of 20 random integer within 0 to 100");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rd.nextInt(101);
            System.out.printf("%d%s", numbers[i], ((i != numbers.length - 1) ? ", ":"\n"));
        }
        
        System.out.println("Array in descending order");
        // Bubble sort to sort in descending order
        for (int i = 0; i < numbers.length; i++) {
            /*
            numbers.length - 1: Prevents out-of-bounds errors when comparing adjacent elements
            - i: Ensures you don’t re-check the already sorted portion of the array.
            */
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] < numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%d%s", numbers[i], ((i != numbers.length - 1) ? ", ": "\n"));
        }
        
        System.out.print("Enter a number to search: ");
        int searchKey = sc.nextInt();
        
        boolean search = false;
        
        // Linear search
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchKey) {
                search = true;
                System.out.println(searchKey + " found");
                System.out.println("Linear Search - "+ i + " loop(s)");
            }
        }
            
        if (!search){
            System.out.println(searchKey + " is not found using Linear Search");
        }
        
        int low = 0;
        int high = numbers.length - 1;
        int middle;
        int loop = 0;
        search = false;
        
        while (low <= high){
            middle = (low + high) / 2;
            
            if (searchKey == numbers[middle]){
                search = true;
                System.out.println(searchKey + " found");
                System.out.println("Binary Search - " + loop + " loop(s)");
                break; // exits once the number is found
                
                // If the number is smaller than the searchKey at middle index
            } else if (searchKey < numbers[middle]){
                low = middle + 1; // Search in right because smaller number
                loop++;
            } else {
                // Search in right
                high = middle - 1; // Search in left because larger number
                loop++;
            }
        }
        
        if (!search) {
            System.out.println(searchKey + " is not found using Binary Search");
        }
        
        sc.close();
    }
}
