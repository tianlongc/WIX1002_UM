/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class QuadraticEquation {
    private int a, b, c;
    
    // Argument constructor
    public QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    // Get methods
    public int getA(){
        return a;
    }
    
    public int getB(){
        return b;
    }
    
    public int getC(){
        return c;
    }
    
    public int Discriminant(){
        return ((b*b) - (4 * (a*c)));
    }
    
    public double calcRoot1(){
        if (Discriminant() >= 0) {
            return (((-1*b) + Math.sqrt(Discriminant())) / (2*a));
        }else{
            return 0;
        }
    }
    
    public double calcRoot2(){
        if (Discriminant() >= 0) {
            return (((-1*b) - Math.sqrt(Discriminant())) / (2*a));
        }else{
            return 0;
        }
    }
}
