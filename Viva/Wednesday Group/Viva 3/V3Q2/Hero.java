/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q2;

/**
 *
 * @author tianlongc
 */
public class Hero {
    private String name;
    private String element;
    private double power;
    
    public Hero(String name, String element, double power){
        this.name = name;
        this.element = element;
        this.power = power;
    }
    
    // Accessor
    public double getPower(){
        return power;
    }
    
    public String getElement(){
        return element;
    }
    
    public String getName(){
        return name;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
