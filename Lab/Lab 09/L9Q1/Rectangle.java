/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9Q1;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class Rectangle extends Shape{
    protected double length;
    protected double width;
    
    public Rectangle(){
        super("Rectangle");
        this.inputDimensions();
    }
    
    public void inputDimensions(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of the rectangle: ");
        this.length = sc.nextDouble();
        
        System.out.print("Enter the width of the rectangle: ");
        this.width = sc.nextDouble();
        
    }
    
    @Override
    public double getArea(){
        return (this.length * this.width);
    }
    
    @Override
    public double getPerimeter(){
        return (2 * (this.length * this.width));
    }
}
