/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L8Q5;

/**
 *
 * @author tianlongc
 */
public class L8Q5 {}

class Tester{
    public static void main(String[] args) {
        
        Game player1 = new Game("Ali bin Abu");
        Game player2 = new Game("Tan Kim Seng");
        
        while (true) {
            player1.rollDice();
            if (player1.getScore() >= 100){
                System.out.println(player1.getName() + " wins with the highest score of " + player1.getScore());
                break;
            }
            
            player2.rollDice();
            if (player2.getScore() >= 100){
                System.out.println(player2.getName() + " wins with the highest score of " + player2.getScore());
                break;
            }
            System.out.println("");
        }
    }
}
