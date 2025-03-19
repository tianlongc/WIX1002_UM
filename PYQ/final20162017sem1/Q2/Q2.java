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
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the initial tuition fee (i.e year 1): ");
        double initialTuitionFee = sc.nextDouble();
        
        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%): ");
        double rateIncrement = sc.nextDouble();
        
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year = sc.nextInt();
        
        double computeFee = computeFee(initialTuitionFee, rateIncrement, year);
        System.out.printf("\nComputed tuition fee for year %d is: %.2f\n", year, computeFee);
    }
    // use repetition
    public static double computeFee(double initialTuitionFee, double rateIncrement, int year){
        double fee = initialTuitionFee;
        
        // iniFee is year 1 already thus,year = year - 1
        for (int i = 1; i < year; i++) {
            fee += (fee * (rateIncrement/100.0));
        }
        return fee;
//        return initialTuitionFee * Math.pow(1.0+rateIncrement/100.0,year-1);
    }
}
