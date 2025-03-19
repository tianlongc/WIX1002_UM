/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9Q1;

/**
 *
 * @author tianlongc
 */
public class Shape {
      protected String name;
      protected double perimeter;
      protected double area;
      
      // Argument constructor
      public Shape(String name){
          this.name = name;
          this.perimeter = 0.0;
          this.area = 0.0;
      }
      
      // Accessor
      public double getPerimeter(){
          return perimeter;
      }
      
      public double getArea(){
          return area;
      }
      
      // Mutator
      public void setPerimeter(double p){
          this.perimeter = p;
      }
      
      public void setArea(double a){
          this.area = a;
      }
      
      // Display
      public void display(){
          System.out.println("Shape: " + this.name);
          System.out.printf("Perimeter: %.2f\n", getPerimeter());
          System.out.printf("Area: %.2f\n", getArea());
      }
}