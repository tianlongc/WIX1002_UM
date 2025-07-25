/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V2Q6;

/**
 *
 * @author tianlongc
 */

import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class G101ex{
    private static final DateTimeFormatter TIME_FORMAT12 = DateTimeFormatter.ofPattern("hh:mm:ss a");
    private static final DateTimeFormatter TIME_FORMAT24 = DateTimeFormatter.ofPattern("HH:mm:ss");
    
    private static boolean sleepNow = false;
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int testCases = 0;
        
        while(true){
            try{
                testCases = sc.nextInt();
            
                if (testCases >= 1 && testCases <= 10) {
                    break; // exit loop once input is valid
                } else{
                    System.out.println("Number of test cases must be between 1 and 10 inclusive.");
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter an integer between 1 and 10 only!");
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
            
            if (interval.equals("-1")) {
                System.out.println("Invalid time format. Use hh:mm:ss a or hh:mm:ss \n");
                continue; // skip to the next test case
            }
            
            System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            
            if (isPrintingWelcomeMessage(cleanedName)) {
                System.out.println("Welcome to G101, Kolej Kediaman Kinabalu, Universiti Malaya!");
            }
            
            // checking isLeeKahSing
            if (cleanedName.matches(".*(kahsinglee|leekahsing).*")){
                System.out.println("LKS!!!!!!!!!!");
                System.out.println("WE KNOW IT'S YOU -- LEE KAH SING!");
            }else{
                System.out.println(initials);
            }
            
            // sleepNow checking
            if (sleepNow) {
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
        String[] partsCurrentTime = currentTime.split(" ");
        String[] partsTargetTime = targetTime.split(" ");
        LocalTime time1, time2;
        
        if (partsCurrentTime.length == 2) {
            try{
                time1 = LocalTime.parse(currentTime, TIME_FORMAT12);
            }catch(DateTimeParseException e){
                return "-1";
            }
        }else if (partsCurrentTime.length == 1){
            try{
                time1 = LocalTime.parse(currentTime, TIME_FORMAT24);
            }catch(DateTimeParseException e){
                return "-1";
            }
        }else{
            return "-1";
        }
        
        if (partsTargetTime.length == 2) {
            try{
                time2 = LocalTime.parse(targetTime, TIME_FORMAT12);
            }catch(DateTimeParseException e){
                return "-1";
            }
        }else if (partsTargetTime.length == 1){
            try{
                time2 = LocalTime.parse(targetTime, TIME_FORMAT24);
            }catch(DateTimeParseException e){
                return "-1";
            }
        }else{
            return "-1";
        }
        
        // Calculate the duration between the two times
        Duration duration = Duration.between(time1, time2);
        
        // If duration is negative, adjust it to represent the correct interval
        // Assume next day
        if (duration.isNegative()) {
            duration = duration.plusHours(24); // Add 24 hours to handle wrap-around
        }
        
        long hours = duration.toHoursPart();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();
        
        if(((time1.isAfter(LocalTime.MIDNIGHT)||time1.equals(LocalTime.MIDNIGHT))&& time1.isBefore(LocalTime.of(06, 00, 00))) && 
                    ((time2.isAfter(LocalTime.MIDNIGHT)||time2.equals(LocalTime.MIDNIGHT)) && time2.isBefore(LocalTime.of(06, 00, 00))) && 
                    time2.isAfter(time1)){
                sleepNow = true;
        }
        // HH:mm:ss format
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}