/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10Q1;

/**
 *
 * @author tianlongc
 */
public class PermanentStaff extends EmployeeSalarySystem{
    private char category;
    
    public PermanentStaff(String n, char category){
        this.name = n;
        this.type = "Permanent Staff";
        this.category = category;
    }
    
    public double getSalary(){
        switch (category) {
            case 'A': return 4000;
            case 'B': return 3000;
            case 'C': return 2000;
            default:  return 0; // handles exception
        }
    }
}
