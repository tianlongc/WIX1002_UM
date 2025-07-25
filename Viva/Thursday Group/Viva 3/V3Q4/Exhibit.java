/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q4;

/**
 *
 * @author tianlongc
 */
public class Exhibit {
    private String title;
    private String artist;
    private int year;
    private String type;
    private String description;
    
    public Exhibit(String title, String artist, int year, String type, String description){
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.type = type;
        this.description = description;
    }
    
    public String getArtist(){
        return artist;
    }
    
    public int getYear(){
        return year;
    }
    
    public String getType(){
        return type;
    }
    
    public String getDetails(){
        return String.format("Title: %s\nArtist: %s\nYear: %d\nType: %s\nDescription: %s\n"
                , title, artist, year, type, description);
    }
}
