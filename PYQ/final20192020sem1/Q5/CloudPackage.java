/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class CloudPackage extends Cloud{
    private int numbersOfCore;
    private int memory;
    private double pricePerHour;
    
    // Argument constructor
    public CloudPackage(String cloudPackage, int numbersOfCore, int memory, double pricePerHour){
        super(cloudPackage);
        this.numbersOfCore = numbersOfCore;
        this.memory = memory;
        this.pricePerHour = pricePerHour;
    }
    
    public boolean check(Job j){
        return (memory >= j.getMemory());
    }
    
    public double totalCost(Job j){
        /* 
            The following line will act as a mutator/setter for totalCost without creating a method
            since we are using protected access modifiers
            Ensures floating point calculation by doing typecasting
        */
        totalCost = ((double)j.getNumberOfTasks() / numbersOfCore * pricePerHour);
        return totalCost;
    }
}
