/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author tianlongc
 */
public class FlowControlTest {
    public static void main(String[] args) {
        int x = 15;
        int y = 5;
        int z = 10;
        
        if (x > y) {
            if (y > z) {
                System.out.println("Condition 1");
            } else {
                if (x < z) {
                    System.out.println("Condition 2");
                } else {
                    System.out.println("Condition 3");
                }
            }
        } else {
            if (z > x) {
                if (z > y) {
                    System.out.println("Condition 4");
                } else {
                    System.out.println("Condition 5");
                }
            } else {
                System.out.println("Condition 6");
            }
        }
    }
}
