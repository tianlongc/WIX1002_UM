/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class Cloud {
    protected String cloudPackage;
    protected double totalCost;
    
    // Constructor
    public Cloud(String cloudPackage){
        this.cloudPackage = cloudPackage;
        this.totalCost = 0.0;
    }
    
    // Mutator
//    public void setTotalCost(double totalCost){
//        this.totalCost = totalCost;
//    }
    
    // Accessor
    public double getTotalCost(){
        return totalCost;
    }
    
    @Override
    public String toString(){
        return ("Cloud Package : " + cloudPackage + " Total Cost= " + totalCost);
    }
    
}
