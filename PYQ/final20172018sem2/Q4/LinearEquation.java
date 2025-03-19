/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author tianlongc
 */
public class LinearEquation {
    private int a, b, c, d, e, f;
    
    public LinearEquation(int a, int b, int c, int d, int e, int f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public String toString(){
        return String.format("\nThe equation :\n%dx + %dy = %d\n%dx + %dy = %d", a, b, e, c, d, f);
    }
    
    public boolean isSolvable(){
        return ((a * d) - (b * c) != 0);
    }
    
    public int computeX(){
        return (((e * d) - (b * f)) / ((a * d) - (b * c)));
    }
    
    public int computeY(){
        return (((a * f) - (e * c)) / ((a * d) - (b * c)));
    }
}
