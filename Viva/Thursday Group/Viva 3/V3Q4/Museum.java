/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q4;

/**
 *
 * @author tianlongc
 */
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Museum {
    private List<Exhibit> exhibits;
    
    public Museum(){
        this.exhibits = new ArrayList<>();
    }
    
    public void loadExhibits(String filename){
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader(filename));
            
            String line = "";
            while ((line = inputStream.readLine()) != null) {
                String[] attributes = line.split(",");
                
                String title = attributes[0];
                String artist = attributes[1];
                int year = Integer.parseInt(attributes[2]);
                String type = attributes[3];
                String description = attributes[4];
                
                this.exhibits.add(new Exhibit(title, artist, year, type, description));
            }
            
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    public void searchExhibitsByArtist(String artist){
        boolean found = false;
        for (Exhibit exhibit: exhibits) {
            if (exhibit.getArtist().equalsIgnoreCase(artist)) {
                System.out.println(exhibit.getDetails());
                found = true;
                // No break here since there may be multiple exhibits by the same artist
            }
        }
        if (!found) {
            System.out.println("No exhibit with this artist.");
        }
    }
    
    public void searchExhibitsByType(String type){
        boolean found = false;
        for (Exhibit exhibit: exhibits) {
            if (exhibit.getType().equalsIgnoreCase(type)) {
                System.out.println(exhibit.getDetails());
                found = true;
                // No break here since there may be multiple exhibits by the same type
            }
        }
        if (!found) {
            System.out.println("No exhibit with this type.");
        }
    }
    
    public void searchExhibitsByYear(int year){
        boolean found = false;
        for (Exhibit exhibit: exhibits) {
            if (exhibit.getYear() == year) {
                System.out.println(exhibit.getDetails());
                found = true;
                // No break here since there may be multiple exhibits by the same year
            }
        }
        if (!found) {
            System.out.println("No exhibit with this year.");
        }
    }
    
    public void viewAllExhibits(){
        for (Exhibit exhibit: exhibits) {
            System.out.println(exhibit.getDetails());
        }
    }
}
