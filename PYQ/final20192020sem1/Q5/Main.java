/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
// Tester class
public class Main {
    public static void main(String[] args) {
        Job j1 = new Job("J1", 252, 20);
        Job j2 = new Job("J2", 108, 10);
        Job j3 = new Job("J3", 72, 25);
        Job[] jobs = {j1,j2,j3};
        
        CloudPackage c1 = new CloudPackage("P2-15", 4, 15, 1.24);
        CloudPackage c2 = new CloudPackage("P2-30", 6, 30, 2.11);
        CloudPackage c3 = new CloudPackage("P5-20", 4, 20, 1.38);
        CloudPackage c4 = new CloudPackage("P6-20", 6, 20, 1.88);
        CloudPackage[] cloudPackages = {c1,c2,c3,c4};
        
        
        double totalCost = 0.0;
        for (Job job: jobs) {
            // Initialize cheapest as a temporary variable that holds the highest value for pricePerHour to compare
            CloudPackage cheapest = new CloudPackage("temp", 0, 0, Double.MAX_VALUE);
            // Find the cheapest package for the current job
            for (CloudPackage cloudPackage: cloudPackages) {
                // Check if the package can execute the job and it is cheaper
                if (cloudPackage.check(job) && (cloudPackage.totalCost(job) < cheapest.totalCost(job))) { 
                    cheapest = cloudPackage;
//                    cheapest.setTotalCost(cloudPackage.totalCost(job));
                }
            }
            totalCost += cheapest.getTotalCost();
            System.out.println(job.toString());
            System.out.println(cheapest.toString());
        }
        System.out.printf("Total Cost : %.2f\n", totalCost);
    }
}
