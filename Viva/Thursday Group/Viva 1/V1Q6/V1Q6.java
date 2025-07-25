
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package V1Q6;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class V1Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number;
        int max = -99, secondMax = -99; // lower-than expected value
        int sum = 0, fmax = 0, fsecondMax = 0;
        boolean negative = false;
        boolean secondMaxExist = false;
        
        System.out.print("Enter numbers: ");
        
        while (true) {
            number = sc.nextInt();
            
            if (number != 0) {
                sum += number;
                if (number > max){ //comparing values
                    secondMax = max; // Update old highest to second highest
                    fsecondMax = fmax;
                    secondMaxExist = fsecondMax > 0;
                
                    max = number;
                    fmax = 1;
                } else if (number == max){ 
                    fmax++;
                } else if (number > secondMax){
                    secondMax = number; // Update secondMax and reset frequency
                    fsecondMax = 1;
                    secondMaxExist = true; 
                } else if (number == secondMax){
                    fsecondMax++;
                } 
            }else{
                break;
            }
            if (number < 0){
                negative = true;
            }
        }
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + fmax);
        
        // Check if second highest score exists
        if (secondMaxExist) {
            System.out.println("The second-largest number is " + secondMax);
            System.out.println("The occurrence count of the second-largest number is "+ fsecondMax);
        } else {
            System.out.println("The second-largest number does not exist.");
        }
       
        System.out.println("The total sum of all numbers is " + sum);
        if (negative){
            System.out.println("Negative numbers were entered.");
        } else {
            System.out.println("No negative numbers were entered.");
        }
        
        sc.close();
    }
}
