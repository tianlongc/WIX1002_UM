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
public class Cylinder extends Shape{
    protected double radius;
    protected double height;
    
    public Cylinder(){
        super("Cylinder");
        this.inputDimensions();
    }
    
    public void inputDimensions(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the radius of the cylinder: ");
        this.radius = sc.nextDouble();
        
        System.out.print("Enter the height of the cylinder: ");
        this.height = sc.nextDouble();
    }
    
    @Override
    public double getArea(){
        return ((2.0 * Math.PI * this.radius)*(this.height+this.radius)) ;
    }
    
    public double getVolume(){
        return (Math.PI * (this.radius * this.radius) * this.height);
    }
    
    @Override
    public void display(){
          System.out.println("Shape: " + this.name);
          System.out.printf("Area: %.2f\n", getArea());
          System.out.printf("Volume: %.2f\n", getVolume());
      }
}
