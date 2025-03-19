/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class Point extends CreditCard{
    
    public Point(String n, String c){
        super(n, c, "Point Reward");
    }
    
    public void getReward(String day, double amount){
        int points = (int) Math.floor(amount); // Round to the nearest whole number
        switch (day) {
            case "Friday":
                points *= 2;
                break;
            case "Saturday":
                points *= 3;
                break;
            case "Sunday":
                points *= 4;
            default:
                points *= 1;
                break;
        }
        double reward = points * 0.01; // 1 point = RM0.01
        setTotalReward(getTotalReward() + reward);
    }
}
