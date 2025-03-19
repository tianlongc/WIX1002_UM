/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L8Q4;

/**
 *
 * @author tianlongc
 */
public class L8Q4 {}

class Tester{
    public static void main(String[] args) {
        Fraction f = new Fraction();
        
        // Test input method
        f.displayFraction();
        System.out.println("");
        
        // Test mutator
        f.setNumerator(48);
        f.setDenominator(18);
        f.displayFraction();
    }
}
