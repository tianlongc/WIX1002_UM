/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10Q4;

/**
 *
 * @author tianlongc
 */
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
        
public class Appointment implements Searchable{
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    
    public void book(String dateStartTime, String dateEndTime){
        try{
            String appointment = String.format("%s,%s\n", dateStartTime, dateEndTime);

            // Make sure to mark the file as true to continously update
            PrintWriter outputStream = new PrintWriter(new FileOutputStream("appointment.txt", true));
            
            if(this.search(dateStartTime, dateEndTime)){
                outputStream.write(appointment);
                System.out.println("Appointment booked successfully.");
            }else{
                System.out.println("There are other appointments booked already!");
            }
            
            outputStream.close();
        }catch(IOException e){
            System.out.println("Error output file: " + e.getMessage());
        }
    }
    
    @Override
    public boolean search(String dateStartTime, String dateEndTime){
        
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader("appointment.txt"));
            
            String line = "";
            while ((line = inputStream.readLine()) != null) {
                if(hasClash(dateStartTime, dateEndTime, line)){
                    return false; // Time slot is not available
                }
            }
            
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error input file: " + e.getMessage());
        }
        return true;
    }
    
    // Function to check if the new appointment clashes with an existing one
    private boolean hasClash(String dateStartTime, String dateEndTime, String line){

        try{
            String[] parts = line.split(",");
            
            // Read from file content
            LocalDateTime line_dateStartTime = LocalDateTime.parse(parts[0], DATE_FORMAT);
            LocalDateTime line_dateEndTime = LocalDateTime.parse(parts[1], DATE_FORMAT);
            
            // Parse current date start and end time
            LocalDateTime date_startTime = LocalDateTime.parse(dateStartTime, DATE_FORMAT);
            LocalDateTime date_endTime = LocalDateTime.parse(dateEndTime, DATE_FORMAT);
            
            return !(date_endTime.isBefore(line_dateStartTime) || date_startTime.isAfter(line_dateEndTime));
            
        }catch(DateTimeParseException e){
            System.out.println("Error parsing date-time string: " + e.getMessage());
            // Assume no clash if parsing fails ah yes im lazy and cringe
            return false; 
        }
    }
}
