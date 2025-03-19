/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
import java.util.Random;

public class Q5 {
    public static void main(String[] args) {
        Random rd = new Random();
        
        // Sample output
//        int[][] grid = {
//            {0, 0, 1},
//            {0, 0, 1},
//            {1, 1, 1}
//        };
        
        // 3x3 grid
        int[][] grid = new int[3][3];
        
        // Print the board for debugging purpose
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                grid[i][j] = rd.nextInt(2);
                System.out.print(grid[i][j]);
            }
            System.out.println("");
        }
        
        // Check rows x1 = x2 = x3
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][0] == 1) {
                System.out.println("All 1s on row " + i);
            }
        }
        
        // Check columns y1 = y2 = y3
        for (int j = 0; j < grid[0].length; j++) {
            if (grid[0][j] == grid[1][j] && grid[1][j] == grid[2][j] && grid[0][j] == 1) {
                System.out.println("All 1s on column " + j);
            }
        }
    }
}
