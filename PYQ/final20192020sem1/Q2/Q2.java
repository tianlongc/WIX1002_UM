/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        System.out.println("Enter Location 1");
        double[] location1 = inputDirection();
        
        System.out.println("Enter Location 2");
        double[] location2 = inputDirection();
        
        System.out.printf("Location 1 : %.6f Latitude , %.6f Longitude%n", location1[0], location1[1]);
        System.out.printf("Location 1 : %.6f Latitude , %.6f Longitude%n", location2[0], location2[1]);
        System.out.printf("Distance : %.2f KM\n", distance(location1, location2));
    }
    
    public static double[] inputDirection(){
        double[] location = new double[2]; // 0 for latitude 1 for longitude
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter Direction: [N, S, E, W]: ");
            char direction = sc.next().charAt(0);

            System.out.print("Enter Degree, Minute and Second : ");
            int degree = sc.nextInt();
            int minute = sc.nextInt();
            int second = sc.nextInt();

            if (direction == 'N' || direction == 'S') {
                location[0] = convertInput(direction, degree, minute, second);
            }else if (direction == 'E' || direction == 'W'){
                location[1] = convertInput(direction, degree, minute, second);
            }
        }
        
        return location;
    }
    
    public static double convertInput(char direction, int degree, int minute, int second){
        // Positive
        if (direction == 'N' || direction == 'E') {
            return degree + (minute * 60.0 + second) / 3600.0;
        }else{
            return -1 * (degree + (minute * 60.0 + second) / 3600.0);
        }
    }
    
    public static double distance(double[] location1, double[] location2){
        // difference between latitudes
        double deltaLatitude = Math.toRadians(Math.abs(location1[0] - location2[0]));
        // difference between longitudes
        double deltaLongitude = Math.toRadians(Math.abs(location1[1] - location2[1]));
        double a = Math.pow(Math.sin(deltaLatitude/2.0),2) +
                Math.cos(Math.toRadians(location1[0])) * Math.cos(Math.toRadians(location2[0])) *
                        Math.pow(Math.sin(deltaLongitude/2),2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double d = 6371 * c;

        return d;
    }
}
