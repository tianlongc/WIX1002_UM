/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V2Q3;

/**
 *
 * @author tianlongc
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class V2Q3 {
    // Use global variables to ensures the data is accessible across all methods
    // Can actually create a multidimensional ArrayList to store book details
    // Each book is represented as the same index containing title and author
    private static List<String> bookTitle = new ArrayList<>();
    private static List<String> bookAuthor = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        while (true) {
            System.out.println("Choose an action:\n1. Add a book\n2. View book details\n3. View all books\n4. Exit\nChoice of action:");
            
            int action = sc.nextInt();
            sc.nextLine(); // Clear input buffer

            if (action >= 1 && action <= 4) {
                if (action == 1) {
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter book author: ");
                    String author = sc.nextLine();
                    addBook(title, author);
                }else if (action == 2) {
                    System.out.println("Enter book title: ");
                    String title = sc.nextLine();
                    viewBook(title);
                }else if (action == 3) {
                    displayAllBooks();
                }else if (action == 4) {
                    System.out.println("Program ending...");
                    break;
                }
            } else {
                System.out.println("Invalid input! Please enter from 1 to 4 only.");
            }
            System.out.println("");
        }
        sc.close();
    }
    
    public static void addBook(String title, String author){
        bookTitle.add(title);
        bookAuthor.add(author);
    }
    
    public static void viewBook(String title){
        boolean found = false;
        
        for (int i = 0; i < bookTitle.size() ; i++) {
            if(bookTitle.get(i).equalsIgnoreCase(title)){
                System.out.printf("Book Details: %s by %s\n", bookTitle.get(i), bookAuthor.get(i));
                found = true;
                break; // break once found the item
            }
        }
        
        if (!found) {
            System.out.println("The book is not found.");
        }
    }
    
    public static void displayAllBooks(){
        for (int i = 0; i < bookTitle.size() ; i++) {
            System.out.printf("%s by %s\n", bookTitle.get(i), bookAuthor.get(i));
        }
    }
    
    
}
