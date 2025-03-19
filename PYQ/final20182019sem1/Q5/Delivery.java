/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class Delivery {
    protected String sender;
    protected String recipient;
    protected double weight; // in kg
    
    // Constructor
    public Delivery(String s, String r, double w){
        this.sender = s;
        this.recipient = r;
        this.weight = w; // in kg
    }
    
    public double totalCost(){
        if (weight <= 5) {
            return (weight * 2.80);
        }else if(weight > 5 && weight <= 20){
            return ((5 * 2.80) + ((weight - 5.0) *5.20));
        }else if (weight > 20 && weight <= 50){
            return ((5 * 2.80) + (15.0 *5.20) + ((weight - 20.0) * 7));
        }else if (weight > 50){
            return ((5 * 2.80) + (15.0 *5.20) + (30 * 7.0) + ((weight - 50.0) * 8.60));
        }else{
            return 0; // handles negative weight
        }
    }
    
    public String toString(){
        return ("From: " + this.sender + " To: " + this.recipient + "\n" +
                "Weight of Package : " + this.weight + "kg\n" +
                "Shipping Cost : RM" + totalCost());
    }
}
