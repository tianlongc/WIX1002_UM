/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class Staff {
    protected String name;
    protected String IC;
    
    public Staff(String n, String ic){
        this.name = n;
        this.IC = ic;
    }
    
    public String toString(){
        return ("Full Name: " + this.name + "\n"
                + "IC: " + this.IC + "\n");
    }
}
