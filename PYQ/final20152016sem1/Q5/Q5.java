/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class Q5 {
    public static void main(String[] args) {
        Rebate r = new Rebate("John Lim", "1111222233334444");
        Point p = new Point("John Lim", "5555666677778888");
        
        String[] type = {"Grocery", "Other", "Fuel", "Utility", "Other"};
        String[] day = {"Saturday", "Friday", "Sunday", "Friday", "Tuesday"};
        double[] total = {124.80, 64.60, 95.40, 100.00, 220.00};
        
        for (int i = 0; i < total.length; i++) {
            r.getReward(type[i], total[i]);
            p.getReward(day[i], total[i]);
        }
        
        System.out.println(r.toString());
        System.out.println(p.toString());
        if (r.getTotalReward() > p.getTotalReward()) {
            System.out.println("The best card is Cash Rebate Card");
        }else{
            System.out.println("The best card is Point Reward Card");
        }
    }
}
