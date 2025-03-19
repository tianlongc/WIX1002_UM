/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author tianlongc
 */
public class Main {
    public static void main(String[] args) {
        DivideF1 a = new DivideF1("data.dat");
        DivideF2 b = new DivideF2("data.dat");
        display(a);
        display(b);
    }
    
    public static void display(Eleven el){
        System.out.println(el.divide());
    }
}
