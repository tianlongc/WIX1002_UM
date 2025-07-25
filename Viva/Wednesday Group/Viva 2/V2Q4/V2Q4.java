/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V2Q4;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class V2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt message
        System.out.print("Enter an integer and  width: ");
        int number = sc.nextInt();
        int width = sc.nextInt();
        
        // Call the format function
        String result = format(number, width);
        
        System.out.println("The resulting string: " + result);
        
        sc.close();
    }
    
    public static String format(int number, int width){
        // let n = number of digits in a number
//        int n = ((int)Math.log10(number) + 1);
        int n = String.valueOf(number).length();
        
        if (n > width) {
            return String.valueOf(number);
        }else{
            return String.format(("%0" + width + "d"), number);
        }
    }
}
