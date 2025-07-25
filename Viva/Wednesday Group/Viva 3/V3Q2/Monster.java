/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q2;

/**
 *
 * @author tianlongc
 */
public class Monster {
    private String name;
    private double pyroResistance;
    private double hydroResistance;
    private double electroResistance;
    private double cyroResistance;
    private double hp;
    
    public Monster(String name, double pyroResistance, double hydroResistance, double electroResistance, double cyroResistance, double hp){
        this.name = name;
        this.pyroResistance = pyroResistance;
        this.hydroResistance = hydroResistance;
        this.electroResistance = electroResistance;
        this.cyroResistance = cyroResistance;
        this.hp = hp;
    }
    
    public double getHp(){
        return hp;
    }
    
    public double getPyroResistance(){
        return pyroResistance;
    }
    
    public double getHydroResistance(){
        return hydroResistance;
    }
    
    public double getElectroResistance(){
        return electroResistance;
    }
    
    public double getCyroResistance(){
        return cyroResistance;
    }
    
    public String getName(){
        return name;
    }
}
