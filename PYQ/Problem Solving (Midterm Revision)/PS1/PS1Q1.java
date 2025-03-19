/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PS1;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class PS1Q1 {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
//        for (int i = 0; i < 3; i++) { 
        System.out.print("Enter the coordinate X and Y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        // Clean scanner so that it will omit next line (clear input buffer)
        sc.nextLine();
        
        System.out.print("Enter the move: ");
        String move = sc.nextLine().toUpperCase();
        
        System.out.printf("Initial Coordinate (%d,%d)\n", x, y);
        
        for (int i = 0; i < move.length(); i++) {
            // Read the character at the current index
            char currentChar = move.charAt(i);
            
            if (currentChar == 'L'){
                x--;
            }
            else if (currentChar == 'R'){
                x++;
            }
            else if (currentChar == 'U'){
                y++;
            }
            else if (currentChar == 'D'){
                y--;
            }
            else{
                System.out.println("Please enter valid moves like L (Left), R (Right), U (Up) and D (Down)!");
                break;
            }
        }
        
        System.out.printf("Final Coordinate (%d,%d)\n", x, y);
//        }
        sc.close();
    }
}
    
