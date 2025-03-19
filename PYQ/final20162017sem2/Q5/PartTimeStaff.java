/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class PartTimeStaff extends Staff {
    private int workingHours;
    
    public PartTimeStaff(String n, String ic, int w){
        super(n, ic);
        this.workingHours = w;
    }
    
    public int getSalary(){
        // RM40 per hour
        return (this.workingHours * 40);
    }
    
    @Override
    public String toString(){
        return (super.toString() + "Number of working hours: " + this.workingHours + "\n" 
                + "Salary: RM " + getSalary() + "\n");
    }
}
