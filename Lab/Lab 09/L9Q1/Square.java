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
public class Square extends Shape{
    protected double side;
    
    public Square(){
        super("Square");
        this.inputDimensions();
    }
    
    public void inputDimensions(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the side length of the square: ");
        this.side = sc.nextDouble();
        
    }
    
    @Override
    public double getArea(){
        return (this.side * this.side);
    }
    
    @Override
    public double getPerimeter(){
        return (this.side * 4);
    }
}

