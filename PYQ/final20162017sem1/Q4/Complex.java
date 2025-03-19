/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author tianlongc
 */
public class Complex {
    private double real;
    private double imaginary;
    
    // no-arugment constructor
    public Complex(){
        this.real = 0.0;
        this.imaginary = 0.0;
    }
    
    // argument constructor
    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    
    // method
    public Complex addComplexNum(Complex other){
        return new Complex((this.real + other.real), (this.imaginary + other.imaginary)); 
    }
    
    public Complex subtractComplexNum(Complex other){
        return new Complex((this.real - other.real), (this.imaginary - other.imaginary)); 
    }
    
    @Override
    public String toString(){
        return String.format("(%d + %di)", (int)real, (int)imaginary);
    }
    
}
