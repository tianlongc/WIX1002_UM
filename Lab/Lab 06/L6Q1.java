/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

/**
 *
 * @author tianlongc
 */
public class L6Q1 {

    public static void main(String[] args) {
        int n = 20;
        triangular(n);
    }
    
    public static void triangular(int n){
        int triangle;
                
        for (int i = 1; i <= n; i++) {
            triangle = (i * (i+1)) / 2;
            System.out.printf("%d%s", triangle, (i != n) ? ", " : "\n");
        }
    }
    
}
