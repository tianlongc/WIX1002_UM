/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class SpecialDelivery extends Delivery{
    private boolean weekendDelivery, nightTimeDelivery;
    
    public SpecialDelivery(String s, String r, double w, boolean wd, boolean nd){
        super(s, r, w);
        this.weekendDelivery = wd;
        this.nightTimeDelivery = nd;
    }
    
    @Override
    public double totalCost(){
        if (weekendDelivery && nightTimeDelivery) {
            return ((super.totalCost() + 50) * 1.2);
        }else if (weekendDelivery) {
            return (super.totalCost() + 50);
        }else if (nightTimeDelivery){
            return (super.totalCost() * 1.2);
        }else{
            return (super.totalCost());
        }
    }
    
    @Override
    public String toString(){
        if (weekendDelivery && nightTimeDelivery) {
            return (super.toString() + "\nWeekend Delivery\nNight Time Delivery");
        }else if (nightTimeDelivery){
            return (super.toString() + "\nNight Time Delivery");
        }else if(weekendDelivery){
            return (super.toString() + "\nWeekend Delivery");
        }else{
            return super.toString();
        }
    }
}
