/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1q3;

/**
 *
 * @author tianlongc
 */
public class L1Q3 {
    public static void main(String[] args) {
        
//        System.out.println("*********           ***               *                 *               ");
//        System.out.println("*       *         *     *            ***               * *              ");
//        System.out.println("*       *        *       *          *****             *   *             ");
//        System.out.println("*       *        *       *            *              *     *            ");
//        System.out.println("*       *        *       *            *             *       *           ");
//        System.out.println("*       *        *       *            *              *     *            ");
//        System.out.println("*       *        *       *            *               *   *             ");
//        System.out.println("*       *         *     *             *                * *              ");
//        System.out.println("*********           ***               *                 *               ");
        
        for (int row = 0; row < 9; row++) {
            // Print square
            for (int col = 0; col < 9; col++) {
                if (row == 0 || row == 8 || col == 0 || col == 8) {
                    System.out.print("*");   
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\t"); // Add a spacing in between shapes
            
            // Print oval
            for (int col = 0; col < 9; col++) {
                if ((row == 0 || row == 8) && (col > 2 && col < 6) || // top and bottom rows
                    (row == 1 || row == 7) && (col == 1 || col == 7) || // second and second last row
                    (row > 1 && row < 7) && (col == 0 || col == 8)) { // middle
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\t"); // Add a spacing in between shapes
            
            // Print arrow
            for (int col = 0; col < 9; col++) {
                if ((row == 0 && col == 3) ||
                        (row == 1 && (col == 2 || col == 3 || col == 4)) ||
                        (row == 2 && (col == 1 || col == 2 || col == 3 || col == 4 || col == 5)) ||
                        (row > 2 && col == 3)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\t"); // Add a spacing in between shapes
            
            // Print diamond
            for (int col = 0; col < 9; col++) {
                if ((row + col == 4) || 
                        (col - row == 4) ||
                        (row - col == 4) ||
                        (row + col == 12)) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            System.out.println("");
        }
    }
}
