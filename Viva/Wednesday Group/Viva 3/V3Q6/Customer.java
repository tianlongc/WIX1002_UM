/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q6;

/**
 *
 * @author tianlongc
 */
public class Customer {
    private String name;
    private String email;
    private String shippingAddress;
    
    public Customer(String name, String email, String shippingAddress){
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
    }
    
    public String getName(){
        return name;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getShippingAddress(){
        return shippingAddress;
    }
    
    @Override
    public String toString(){
        return "";
    }
}
