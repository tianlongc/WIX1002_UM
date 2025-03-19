/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS2;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
import java.util.Random;
public class PS2Q1 {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);
        // Create Random object
        Random rd = new Random();
        
        int work = 0;
        
        System.out.print("Enter the number of staff [N] : ");
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            /* 
            uses upper boundary and lower boundary is valid way but in exam
            we are using an older version of Random class using upper boundary only!
            so it is important to familiarise ourselves with using upper boundary only
            */
//            int randomID = rd.nextInt(10000, 100000);
            
            /*
                [10000, 99999] means [10000-10000, 99999-10000] = [0, 89999]
                Important Tip: Try minus the side with lower value until 0 
                and plus it back in the interval!
            */
            int randomID = rd.nextInt(89999)+10000; // range: 10000 to 99999
            System.out.println("Staff ID : " + randomID);
            
            int second_digit = (randomID / 1000) % 10; 
            int fourth_digit = (randomID / 10) % 10;
            
            if ((second_digit % 2 != 0) && (fourth_digit % 2 == 0)) {
                System.out.println("Weekend Duty");
                work++;
            }else{
                System.out.println("Weekend Off");
            }
        }
        System.out.println("The number of staffs work during weekend is " + work);
        
        sc.close();
    }
}
