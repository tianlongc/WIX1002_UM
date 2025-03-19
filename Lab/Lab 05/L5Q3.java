/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author tianlongc
 */
/* 
    if you are using many classes from the package 
    (e.g., Scanner, Random, ArrayList, HashMap, Date, etc.).
    use wildcard imports (java.util.*;)
*/
// import java.util.*;
/*
     Im only using a few classes (two in this case). 
     So, I just use specific imports to makes it clear what dependencies my code relies on
*/
import java.util.Scanner;
import java.util.Random;
public class L5Q3 {
    public static void main(String[] args) {
        // Create Sc object to read input
        Scanner sc = new Scanner(System.in);

        // Create an instance of Random class
        Random rd = new Random();
        
        int work_hour, total = 0;
        
        System.out.print("Enter the number of employee, N: ");
        int N = sc.nextInt();
        
        // Table header
        System.out.printf("%10s%6s%6s%6s%6s%6s%6s%6s%21s\n","","Mon","Tue","Wed","Thu","Fri","Sat","Sun","Total Working Hour");
        
        for (int i = 1; i <= N; i++) {
            total = 0; // resets total after each loop
            System.out.printf("%9s%d","Employee ",i);
            
            // seven days 
            for (int j = 0; j < 7; j++) {
                work_hour = rd.nextInt(9)+1;
                System.out.printf("%6d", work_hour);
                total += work_hour;
            }
            System.out.printf("%21d\n", total);            
        }
        
        sc.close();
    }
}
