/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        String[] shape = {"Paper", "Scissor", "Rock"};
        int playerWinCounter = 0, computerWinCounter = 0;
        String player, computer;
        int choice;
        
        while (playerWinCounter != 3 && computerWinCounter != 3){
            // Prompt message 
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock: ");
            
            // Input validation without try catch
            while (true) {
                if(sc.hasNextInt()){
                    choice = sc.nextInt();
                    if (choice >= 1 && choice <= 3) {
                        break; // exit loop once input is valid
                    } else{
                        System.out.println("Please enter from 1 to 3 only!");
                    }
                } else{
                    System.out.println("Invalid input. Please enter from 1 to 3 only!");
                    sc.nextLine(); // clear input buffer
                }
            }
            player = shape[choice-1];
            computer = shape[rd.nextInt(3)];
            
            // Output validation
            System.out.printf("Player : %s --- Computer : %s\n",player,computer);
            
            if (player.equals(computer)) {
                System.out.println("It's a draw!");
            }else if((player.equals("Paper") && computer.equals("Rock")) ||
                    player.equals("Scissor") && computer.equals("Paper") ||
                    player.equals("Rock") && computer.equals("Scissor")){
                playerWinCounter++;
                System.out.printf("Player win %d time(s)\n",playerWinCounter);
            }else{
                computerWinCounter++;
                System.out.printf("Computer win %d time(s)\n",computerWinCounter);
            }
            
        }
        
        if (playerWinCounter == 3) {
            System.out.println("Player wins the game.");
        }else{
            System.out.println("Computer wins the game.");
        }
        
        sc.close();
    }
}
