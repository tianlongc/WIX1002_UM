/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q3;

/**
 *
 * @author tianlongc
 */
public class Room {
    private String roomNumber;
    private String roomType;
    private double rentalPrice;
    private static int totalRooms;
    
    public Room(String roomNumber, String roomType, double rentalPrice){
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.rentalPrice = rentalPrice;
        totalRooms++;
    }
    
    // Getter methods
    public String getRoomNumber(){
        return roomNumber;
    }
    
    public String getRoomType(){
        return roomType;
    }
    
    public double getRentalPrice(){
        return rentalPrice;
    }
    
    // Setter methods
    public void setRoomNumber(String roomNumber){
        this.roomNumber = roomNumber;
    }
    
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }
    
    public void setRentalPrice(double rentalPrice){
        this.rentalPrice = rentalPrice;
    }
    
    public double calculateRent(int days){
        return rentalPrice * days;
    }
    
    public double calculateRent(int days, double discount){
        return (rentalPrice * days) - discount;
    }
    
    public int getTotalRooms(){
        return totalRooms;
    }
    
    public static void displayRoomDetails(Room room){
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Room Type: " + room.getRoomType());
        System.out.println("Rental Price: $" + room.getRentalPrice());
        System.out.println("Total Rooms: " + totalRooms);
        System.out.println("Total Rent for 5 days: $" + room.calculateRent(5));
        System.out.println("Total Rent for 5 days with $50.0 discount: $" + room.calculateRent(5, 50));
    }
    
    public static void main(String[] args) {
        Room room1 = new Room("101", "Single", 100.0);
        Room room2 = new Room("202", "Double", 200.0);
        Room room3 = new Room("303", "Suite", 300.0);
        
        System.out.println("Room 1 Details:");
        displayRoomDetails(room1);
        
        System.out.println("\nRoom 2 Details:");
        displayRoomDetails(room2);
        
        System.out.println("\nRoom 3 Details:");
        displayRoomDetails(room3);
    }
}
