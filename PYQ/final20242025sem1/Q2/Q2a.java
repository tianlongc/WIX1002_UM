/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author tianlongc
 */
import java.util.Random;
public class Q2a {
    public static void main(String[] args) {
        int[] numbers = new int[10];
//        int[] numbers = {21, 34, 67, 82, 14, 71, 53, 45, 90, 29};
        int largestEven = findLargestEven(numbers);
        
        System.out.print("The generated array is: [");
        for (int i = 0; i < numbers.length; i++) {
            // ternary operator (condition) ? true : false
            System.out.printf("%d%s", numbers[i], ((i != numbers.length - 1) ? ", ": "]\n"));
        }
        System.out.println("The largest even number is: " + largestEven);
    }
    
    public static int findLargestEven(int[] numbers){
        Random rd = new Random();
        boolean hasEven = false;
        int largestEven = -1;
        
        // Generate random integers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rd.nextInt(100)+1;
            if (numbers[i] % 2 == 0) {
                hasEven = true;
                largestEven = Math.max(numbers[i], largestEven);
            }
        }
        
        if (hasEven) {
            return largestEven;
        }else{
            return -1;
        }
    }
}
