/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L9Q4;

/**
 *
 * @author tianlongc
 */

public class Tester {
    public static void main(String[] args) {
//        Game3 p1 = new Game3("Ali");
//        Game3 p2 = new Game3("Abu");
//        System.out.println("== Dice Game 3 ==");
//        
//        int i = 0;
//        while (true) {
//            i++;
//            System.out.println("Turn " + i);
//            p1.roll(); 
//            p1.display(); 
//            if (p1.getScore() == 50){ 
//                break; 
//            }
//            p2.roll(); 
//            p2.display(); 
//            if (p2.getScore() == 50){ 
//                break; 
//            }
//            System.out.println("");
//        }   
//    }

        Game1 p1 = new Game1("Ali");
        Game1 p2 = new Game1("Abu");
        System.out.println("== Dice Game 1 ==");
        
        int i = 0;
        while (true) {
            i++;
            System.out.println("Turn " + i);
            p1.roll(); 
            p1.display(); 
            if (p1.getScore() >= 100){ 
                break; 
            }
            p2.roll(); 
            p2.display(); 
            if (p2.getScore() >= 100){ 
                break; 
            }
            System.out.println("");
        }

        System.out.printf("%s won!\n", (p1.getScore() >= 100) ? p1.getName() : p2.getName());
        
        Game2 p3 = new Game2("Kim Seng");
        Game2 p4 = new Game2("Ai Ling");
        System.out.println("\n== Dice Game 2 ==");
        
        int j = 0;
        while (true) {
            j++;
            System.out.println("Turn " + j);
            p3.roll();
            p3.display();
            if (p3.getScore() == 100){ 
                break; 
            }
            p4.roll();
            p4.display(); 
            if (p4.getScore() == 100){ 
                break; 
            }
            System.out.println("");
        }

        System.out.printf("%s won!\n", (p3.getScore() == 100) ? p3.getName() : p4.getName());
    } 
}
