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
        Scanner sc = new Scanner(System.in);
        String input = "";
        
        String line = "";
        // Read input line by line refer back C7:file handling
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            // Enter key to terminate input
            if(line.isEmpty()){
                break;
            }
            input += line;
        }
        
        String[] boards = input.split("#");
        
        for (int i = 0; i < boards.length; i++) {
            System.out.printf("Game %d:\n", i+1);
            System.out.println("Tic-Tac-Toe Board:");
            if (boards[i].length() == 9) {
                processBoard(boards[i]);
            }else{
                // Handles exception zzz Haiya memang buat kerja susah kita
                System.out.println("Error: Input string must have exactly 9 characters!\n");
            }
        }

        sc.close();
    }
    
    // Parse the input into grid board
    public static void processBoard(String line){
        // 3x3 grid
        char[][] grid = new char[3][3];
            
        int index = 0;
        // Length of the rows in the array
        for (int i = 0; i < grid.length; i++) {
            // Length of the columns in the array
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = line.charAt(index); // Store each character in the board array
                index++; // // Move to the next character in the input string
                if (grid[i][j] == '.') {
                    grid[i][j] = ' '; // replace period with space
                }
            }
        }
        
        // Print the board for debugging purpose
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                    System.out.print(grid[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("Winner: " + checkBoard(grid) + "\n");
    }
    
    // Determine win condition
    public static String checkBoard(char[][] board){
        // Check rows x1 = x2 = x3
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return String.valueOf(board[i][0]);
            }
        }

        // Check columns y1 = y2 = y3
        for (int j = 0; j < board[0].length; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != ' ') {
                return String.valueOf(board[0][j]);
            }
        }
        
        // Check diagonals \ /
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return String.valueOf(board[0][0]);
        }
        
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return String.valueOf(board[0][2]);
        }
        
        // Check if the game is still ongoing
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == ' ') {
                    return "None (on going)";
                }
            }
        }
        // if none fulfilled return draw
        return "Draw";
    }
}