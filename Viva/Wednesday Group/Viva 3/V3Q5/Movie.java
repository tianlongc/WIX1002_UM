/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q5;

/**
 *
 * @author tianlongc
 */
public class Movie {
    private String title;
    private String director;
    private int year;
    private String type;
    
    public Movie(String title, String director, int year, String type){
        this.title = title;
        this.director = director;
        this.year = year;
        this.type = type;
    }
    
    // Accessors
    public String getTitle(){
        return title;
    }
    
    public String getDirector(){
        return director;
    }
    
    public int getYear(){
        return year;
    }
    
    public String getType(){
        return type;
    }
    
    @Override
    public String toString(){
        return String.format("- Title: %s\n  Director: %s\n  Type: %s\n  Year: %d\n", title, director, type, year);
    }
}
