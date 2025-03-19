/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author tianlongc
 */
public class Book {
    private String title;
    private String author;
    private int yearPublished;
    
    public Book(String t, String a, int y){
        this.title = t;
        this.author = a;
        this.yearPublished = y;
    }
    
    // Getter Methods
    public String getTitle(){
        return this.title;
    }
    
    public String getAuthor(){
        return this.author;
    }
    
    public int getYearPublished(){
        return this.yearPublished;
    }
    
    // Main method
    public static void main(String[] args) {
        Book b = new Book("Harry Potter", "J. K. Rowling", 2001);
        
        // display details
        System.out.println("Book Details: ");
        System.out.println("Title: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Year Published: " + b.getYearPublished());
    }
    
}
