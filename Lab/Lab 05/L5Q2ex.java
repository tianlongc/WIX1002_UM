/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

/**
 *
 * @author tianlongc
 */
import java.util.Random;
public class L5Q2ex {
    public static void main(String[] args) {
        Random rd = new Random();
        boolean[] number = new boolean[21];
        int i, counter = 0;
    
        System.out.println("10 non-duplicate random integers within the range from 0 to 20:");
        while(counter<10){
            i = rd.nextInt(21);
            if(number[i]){
                continue; // mark the number as seen
            }
            number[i] = true;
            counter++;
            System.out.printf("%d%s", i, (counter < 10) ? ", ": "\n");
        }
    }
}
