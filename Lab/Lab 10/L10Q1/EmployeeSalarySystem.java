/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10Q1;

/**
 *
 * @author tianlongc
 */
public abstract class EmployeeSalarySystem {
    protected String name;
    protected String type;
    
    // abstract method to calculate salary
    public abstract double getSalary();
    
    public void display(){
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Type: " + this.type);
        System.out.printf("Total Salary per month: RM%.2f \n\n",getSalary());
    }
}
