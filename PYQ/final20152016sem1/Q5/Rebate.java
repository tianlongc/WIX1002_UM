/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class Rebate extends CreditCard{
    
    public Rebate(String n, String c){
        super(n, c, "Cash Rebate");
    }
    
    // Use mutator for calculation
    public void getReward(String itemType, double amount){
        double rebate = 0.0;
        switch(itemType){
            case "Fuel":
                rebate = amount * 0.08;
                break;
            case "Utility":
                rebate = amount * 0.05;
                break;
            case "Grocery":
                rebate = amount * 0.02;
                break;
            case "Other":
                rebate = amount * 0.002;
//            default:
//                throw new IllegalArgumentException("Invalid item type: " + itemType);
        }
//        totalReward += rebate; // protected means direct access to CreditCard class
        setTotalReward(getTotalReward() + rebate);
    }
}
