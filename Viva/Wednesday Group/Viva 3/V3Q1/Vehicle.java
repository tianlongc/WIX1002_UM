/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q1;

/**
 *
 * @author tianlongc
 */
public class Vehicle {
    private String vehicleID;
    private String type;
    private String brand;
    private double rentalRate; // per day
    private double fuelLevel; // in percentage
    private int rentalDays;
    private double rentalCost;
    
    // empty constructor (No-argument constructor)
    public Vehicle(){
        this.vehicleID = "0000";
        this.type = "Car";
        this.brand = "Myvi";
        this.rentalRate = 100;
        this.fuelLevel = 100;
    }
    
    // Argument constructor
    public Vehicle(String vehicleID, String type, String brand, double rentalRate, double fuelLevel){
        this.vehicleID = vehicleID;
        this.type = type;
        this.brand = brand;
        this.rentalRate = rentalRate;
        this.fuelLevel = fuelLevel;
    }
    
    // Accessor
    public String getVehicleID(){
        return vehicleID;
    }
    
    public String getType(){
        return type;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public double getRentalRate(){
        return rentalRate;
    }
    
    public double getFuelLevel(){
        return fuelLevel;
    }
    
    // Mutator 
    public void setVehicleID(String vehicleID){
        this.vehicleID = vehicleID;
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    public void setRentalRate(double rentalRate){
        this.rentalRate = rentalRate;
    }
    
    public void setFuelLevel(double fuelLevel){
        this.fuelLevel = fuelLevel;
    }
    
    public double calculateRentalRate(){
        if (type.equalsIgnoreCase("Van") || type.equalsIgnoreCase("Vans")) {
            return rentalRate * 1.20;
        }else if (type.equalsIgnoreCase("Motorcycles")){
            return rentalRate * 0.75;
        }else{
            return rentalRate; // default for other types
        }
    }
    // Mutate rentalCost without returning the value
    public void calculateRentalCost(int input){
        this.rentalDays = input;
        this.rentalCost = calculateRentalRate() * rentalDays;
        
        if (rentalDays >= 7 && rentalDays <= 14) {
            rentalCost *= 0.95; // 5% discount
        }else if (rentalDays > 14) {
            rentalCost *= 0.90; // 10% discount
        }
    }
    
    public double calculateFuelCharge(){
        if (fuelLevel <= 50) {
            return 50.0; // RM50 penalty
        }
        return 0.0; // No penalty
    }
    
    @Override
    public String toString(){
        return String.format("Vehicle ID: %s\nType: %s\nBrand: %s\nRental Rate: $%.1f\nFuel Level: %.1f%%\nRental Days: %d\nTotal Cost: RM%.1f", vehicleID, type, brand, rentalRate, fuelLevel, rentalDays, (rentalCost + calculateFuelCharge()));
    }
}
