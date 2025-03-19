/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author tianlongc
 */
import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        Random rd = new Random();
        
        // Task 1: Generate 3 random price values (100.00-300.00) --> (0, 200.00)+100.00
        System.out.print("3 random price values : ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%.2f%s", rd.nextDouble(200.00)+100.00, (i != 2) ? " ": "\n");
        }
        
        // Task 2: Generate 5 random even-numbered years (1990-2030) --> (0,40)+1990
        System.out.print("5 random even-numbered years : ");
        for (int i = 0; i < 5; i++) {
            int year = 0;
            do {
                year = rd.nextInt(40)+1990;
            } while (year % 2 != 0);
            System.out.printf("%d%s", year, (i != 4) ? " ": "\n");
        }
        
        // Task 3: Generate 1 random car plate number
        System.out.print("Car Plate Number : ");
        for (int i = 0; i < 7; i++) {
            char c = 'Z'; // resets upon each loop
            if (i < 5) {
                // 0 - 9 digits
                System.out.print(rd.nextInt(10));
            }else{
                // A - Z
                int letterIndex = rd.nextInt(26);
                System.out.printf("%c%s", (char)(c - letterIndex), (i != 6) ? "": "\n");
            }
        }
        
        // Task 4: Generate 1 random word (1-8 characters, a-z or A-Z)
        System.out.print("Random Word : ");
        int wordLength = rd.nextInt(8)+1;
        for (int i = 0; i < wordLength; i++) {
            char c = 'Z'; // resets upon each loop
            int letterCase = rd.nextInt(2); // let 0: lowercase 1: uppercase
            int letterIndex = rd.nextInt(26);
            System.out.print((letterCase == 0) ? (char) (c - letterIndex) : (char) (c - letterIndex));
        }
        System.out.println("");
    }
}
