/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public abstract class Fruit {
    protected String name;
    protected String type;
    
    public Fruit(String n, String t){
        this.name = n;
        this.type = t;
    }
    
    public abstract double totalPrice();
    
    @Override
    public String toString(){
        return (type + " " + name);
    }
}
