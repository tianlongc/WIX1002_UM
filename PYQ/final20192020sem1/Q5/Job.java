/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class Job {
    private String name;
    private int numberOfTasks;
    private int memory;
    
    // Argument Constructor
    public Job(String name, int numberOfTasks, int memory){
        this.name = name;
        this.numberOfTasks = numberOfTasks;
        this.memory = memory;
    }
    
    // Accessor methods
    public String getName(){
        return name;
    }
    
    public int getNumberOfTasks(){
        return numberOfTasks;
    }
    
    public int getMemory(){
        return memory;
    }
    
    @Override
    public String toString(){
        return ("Job Name : " + getName() + " Memory = " + getMemory() + "GB Number of Task = " + getNumberOfTasks());
    }
}
