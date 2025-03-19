/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10Q1;

/**
 *
 * @author tianlongc
 */
public class ContractStaff extends EmployeeSalarySystem{
    public double sales;
    
    public ContractStaff(String n, double s){
        this.name = n;
        this.type = "Contract Staff";
        this.sales = s;
    }
    
    public double getSalary(){
        return (500 + (0.5*this.sales));
    }
}
