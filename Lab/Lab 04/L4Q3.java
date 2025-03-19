/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class L4Q3 {
    public static void main(String[] args) {
        // Create a Scanenr object to read input
        Scanner sc = new Scanner(System.in);
        
        // Method 1: Assume min is 9999999 and max is -1
//        int min=9999999, max=-1;

        // Method 2: use Integer.MAX_VALUE and Integer.MIN_VALUE
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        
        /*
        The reason behind Method 1 and Method 2:
        Why we should use min with higher values and max with lower values?
        This is because you will find at least one score that is your highest 
        (all integers are greater or equal than MIN_VALUE) and 
        another one that is your lowest 
        (all integers are lower or equal than MAX_VALUE)
        */
        
        int n = 0;
        double sum = 0, squared_sum = 0;
        
        while (true) {
            System.out.print("Enter a score [negative score to quit]:");
            int score = sc.nextInt();
            
            if(score >= 0){
                
                // Compare the values to obtain min
                if (min > score){ //Math.min
                    min = score;
                }
                // Compare the values to obtain max
                if (max < score){ //Math.max
                    max = score;
                }
                sum += score;
                squared_sum += score * score;
                n++;
            }else{
                // do calculation here
                double avg = sum / n;
                double variance = ((squared_sum - (sum*sum)/n) / (n-1));
                double sd = Math.sqrt(variance);
                
                System.out.println(variance);
                System.out.println("Minimum Score: " + min);
                System.out.println("Maximum Score: " + max);
                System.out.printf("Average Score: %.2f\n", avg);
                System.out.printf("Standard Deviation: %.2f\n", sd);
                
                break; // stop the loop once a negative score is entered
            }
        }
        
        sc.close();
    }
}
