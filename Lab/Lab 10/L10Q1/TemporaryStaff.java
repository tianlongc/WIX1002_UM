/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10Q1;

/**
 *
 * @author tianlongc
 */
public class TemporaryStaff extends EmployeeSalarySystem{
    private int workHour;
    
    public TemporaryStaff(String n, int w){
        this.name = n;
        this.type = "Temporary Staff";
        this.workHour = w;
    }
    
    public double getSalary(){
        return (15*this.workHour);
    }
}
