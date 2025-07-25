/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V2Q6;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class G101{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int testCases = 0;
        
        // Input validation without try catch
        while (true) {
            if(sc.hasNextInt()){
                testCases = sc.nextInt();
                if (testCases >= 1 && testCases <= 10) {
                    break; // exit loop once input is valid
                } else{
                    System.out.println("Number of test cases must be between 1 and 10 inclusive.");
                }
            } else{
                System.out.println("Invalid input. Please enter from 1 to 10 only!");
                sc.nextLine(); // clear input buffer
            }
        }
     
        sc.nextLine(); // clear input buffer
        
        for (int i = 0; i < testCases; i++) {
            String name = sc.nextLine();
            String currentTime = sc.nextLine();
            String targetTime = sc.nextLine();
            
            String initials = generateInitials(name);
            String interval = calculateInterval(currentTime, targetTime);
            
            // Standardize the cleanedName with lower case
            String cleanedName = name.replaceAll("[_. '-]+", "").toLowerCase();
                        
            // why do this? because I brainrot didnt use any try catch
            if (interval.equals("-1")) {
                System.out.println("Invalid time format. Use hh:mm:ss a or hh:mm:ss \n");
                continue; // skip to the next test case
            }
            
            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            
            if (isPrintingWelcomeMessage(cleanedName)) {
                System.out.println("Welcome to G101, Kolej Kediaman Kinabalu, Universiti Malaya!");
            }
            
            boolean isLeeKahSing = cleanedName.matches(".*(kahsinglee|leekahsing).*");
            
            if (isLeeKahSing){
                System.out.println("LKS!!!!!!!!!!");
                System.out.println("WE KNOW IT'S YOU -- LEE KAH SING!");
            }else{
                System.out.println(initials);
            }
            
            // sleepNow checking
            int currentHour = parseTimeToSeconds(currentTime) / 3600;
            int targetHour = parseTimeToSeconds(targetTime) / 3600;
            
            if (currentHour >= 0 && currentHour < 6 && targetHour >= 0 && targetHour < 6 && parseTimeToSeconds(targetTime) > parseTimeToSeconds(currentTime)) {
                System.out.println("SLEEP NOW!!!!!!!!!!");
            }
            
            System.out.println(interval);
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
        }
            
        sc.close();
    }
    
    public static String generateInitials(String name){
        String[] parts = name.split("[_. '-]+");
        String initials = "";
        
        for (String part: parts) {
            if(!part.matches("a/l|a/p|al|ap|bin|binti")){
                initials += Character.toUpperCase(part.charAt(0));
            }
        }
        return initials;
    }
    
    public static boolean isPrintingWelcomeMessage(String name){
        return name.matches(".*(ridwanfaizbinmohamadhassan|suresha/lsubramaniam|kahsinglee|leekahsing|kahsing).*");
    }
    
    public static String calculateInterval(String currentTime, String targetTime){
        int currentSeconds = parseTimeToSeconds(currentTime);
        int targetSeconds = parseTimeToSeconds(targetTime);
                
        int totalIntervalSeconds;
        if (targetSeconds >= currentSeconds){
            totalIntervalSeconds = targetSeconds - currentSeconds;
        }else if (targetSeconds < currentSeconds){
            // If target time is before current time, assume it's the next day
            totalIntervalSeconds = ((24 * 3600) + (targetSeconds - currentSeconds));
        }else{
            return "-1"; // indicate error
        }
        
        int intervalHour = totalIntervalSeconds / 3600;
        int intervalMinutes = (totalIntervalSeconds % 3600) / 60;
        int intervalSeconds = totalIntervalSeconds % 3600 % 60;
        
        return String.format("%02d:%02d:%02d", intervalHour, intervalMinutes, intervalSeconds);
    }
    
    // Conversion without import i dunno its allowed or not
    public static int parseTimeToSeconds(String timeString){
        String[] parts = timeString.split("[: ]+");
        
        // Extract information
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2]);
        
        // Validate time components
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
            return -1; // indicate error
        }
        
        // Handles 12-hour format and convert it into 24-hour format (STANDARDIZE)
        if(parts.length == 4){
            String ampm = parts[3];
            // Convert time into 24-hour format
            if(ampm.equalsIgnoreCase("am")){
                if (hours == 12){
                    hours = 0;
                }
            } else if (ampm.equalsIgnoreCase("pm")){
                if (hours != 12){
                    hours += 12;
                }
            }
            else {
                // indicate error
                return -1;
            }
        }
        return ((hours * 3600) + (minutes * 60) + seconds);
    }
}
