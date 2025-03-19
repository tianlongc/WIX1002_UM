/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class CreditCard {
    protected String name;
    protected String card;
    protected String type;
    private double totalReward;
    
    public CreditCard(String n, String c, String t){
        this.name = n;
        this.card = c;
        this.type = t;
        this.totalReward = 0.0;
    }
    
    // Accessor
    public double getTotalReward(){
        return this.totalReward;
    }
    
    // Mutator
    public void setTotalReward(double total){
        this.totalReward = total;
    }
    
    // toString
    public String toString(){
        return ("Credit Card : " + this.name + "(" + this.card + ")\n"
                + "Card Type : " + this.type + "\n"
                + "Total Cash Reward : " + this.totalReward);
    }
}
