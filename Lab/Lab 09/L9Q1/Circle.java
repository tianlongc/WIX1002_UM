/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9Q1;

import java.util.Scanner;

/**
 *
 * @author tianlongc
 */
public class Circle extends Shape {
    protected double diameter;
    
    public Circle(){
        super("Circle");
        this.inputDimensions();
    }
    
    public void inputDimensions(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the diameter of the circle: ");
        this.diameter = sc.nextDouble();
        
    }
    
    @Override
    public double getArea(){
        // Ensures using floating point division
        return ((Math.PI * this.diameter * this.diameter) / 4.0) ;
    }
    
    @Override
    public double getPerimeter(){
        return (Math.PI * this.diameter);
    }
}
