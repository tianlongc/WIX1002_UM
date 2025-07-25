/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1Q6;

/**
 *
 * @author tianlongc
 */
public class V1Q6 {
    public static void main(String[] args) {
       
        for (int row = 0; row < 7; row++) {
            // Print M
            for (int col = 0; col < 7; col++) {
                if (col == 0 || col == 6 || (row == col && row <= 3) || (row + col == 6 && row <= 3)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // spacing between letters
            
            // Print A
            for (int col = 0; col < 7; col++) {
                if (col == 0 || col == 6 || row == 0 || row == 3) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // spacing between letters
            
            // Print L
            for (int col = 0; col < 7; col++) {
                if (col == 0 || row == 6) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // spacing between letters
            
            // Print A
            for (int col = 0; col < 7; col++) {
                if (col == 0 || col == 6 || row == 0 || row == 3) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // spacing between letters
            
            // Print Y
            for (int col = 0; col < 7; col++) {
                if ((row == col && row <= 3) || (row + col == 6 && row <= 3) || (col == 3 && row >= 3)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // spacing between letters
            
            // Print S
            for (int col = 0; col < 7; col++) {
                if (row == 0 || row == 3 || row == 6 || (col == 0 && row <= 3) || (col == 6 && row >= 3)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // spacing between letters
            
            // Print I
            for (int col = 0; col < 7; col++) {
                if (col == 3 || row == 0 || row == 6) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // spacing between letters
            
            // Print A
            for (int col = 0; col < 7; col++) {
                if (col == 0 || col == 6 || row == 0 || row == 3) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("  "); // spacing between letters
            
            System.out.println(""); 
        }
    }
}
