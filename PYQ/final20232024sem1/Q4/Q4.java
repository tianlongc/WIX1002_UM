/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author tianlongc
 */
import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        
        int[][] seatingPlan = new int[5][5];
        /*
            Arrays are mutable, so we can use void methods 
            to modify them in place instead of creating new arrays.
        */
        initializeSeatingPlan(seatingPlan);
        
        // 0: store occupied seats
        // 1: store row with the maximum number of occupied seats
        int[] results = new int[2]; 
        
        analyzeSeating(seatingPlan, results);
        
        System.out.println("Total Occupied Seats: " + results[0]);
        System.out.println("Row with Most Occupied Seats: Row " + results[1]);
        
        System.out.println("Seating Plan:");
        for (int i = 0; i < seatingPlan.length; i++) {
            for (int j = 0; j < seatingPlan[i].length; j++) {
                System.out.print(seatingPlan[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static void initializeSeatingPlan(int[][] seatingPlan){
        Random rd = new Random();
        
        for (int i = 0; i < seatingPlan.length; i++) {
            for (int j = 0; j < seatingPlan[i].length ; j++) {
                seatingPlan[i][j] = rd.nextInt(2); // occupied (1) vacant (0)
            }
        }
    }
    
    public static void analyzeSeating(int[][] seatingPlan, int[] results){
        results[0] = 0;
        int maxRowSeats = -1; // Assume max as the lowest value
        
        // i is row j is column
        for (int i = 0; i < seatingPlan.length; i++) {
            int rowSeats = 0; // reset upon each loop
            
            for (int j = 0; j < seatingPlan[i].length ; j++) {
                if (seatingPlan[i][j] == 1) {
                    results[0]++;
                    rowSeats++;
                }
            }
            if (rowSeats > maxRowSeats) {
                maxRowSeats = rowSeats;
                results[1] = i+1; // // Rows are zero-indexed, so we add 1 to get the actual row number.
            }
        }
    }
}
