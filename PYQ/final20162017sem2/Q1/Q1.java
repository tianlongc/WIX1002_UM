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
public class Q1 {
    public static void main(String[] args) {
        // Error 1: remove final
        int N;
        // Error 2: System.in
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        // Error 3: use integer data type
        N = s.nextInt();
        System.out.println("The first " + N + " triangular numbers");
        // Error 4: condition <= and increments
        for (int i = 1; i <= N; i++) 
            System.out.print(getTriangular(i) + " ");
        System.out.println("");
    }
    // Error 5: Change into integer data type
    public static int getTriangular(int n){
        // Error 6: initialise as 0
        int sum = 0;
        for (int i = 1; i <= n; i++) 
            // Error 7: change 1 into i
            sum+=i;
        return sum;
    }
}
