/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class PermanentStaff extends Staff{
    private String grade;
    
    public PermanentStaff(String n, String ic, String g){
        super(n, ic);
        this.grade = g;
    }
    
    public int getSalary(){
        switch (grade) {
            case "EM01":
                return 7000;
            case "EM02":
                return 5000;
            case "EM03":
                return 3000;
            case "EM04":
                return 1000;
            default:
                System.out.println("Grade not found!");
                return 0;
       }
    }
    @Override
    public String toString(){
        return (super.toString() + "Grade: " + this.grade + "\n"
                + "Salary: RM " + getSalary() + "\n");
    }
}
