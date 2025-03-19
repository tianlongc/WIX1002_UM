/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author tianlongc
 */
//class AlreadyBorrowedException extends Exception{
//    public AlreadyBorrowedException(String message){
//        super(message);
//    }
//}

public class LibraryMaterial {
    protected String title;
    protected String author;
    protected boolean available;
    protected int returnDate;
    
    public LibraryMaterial(String t, String a){
        this.title = t;
        this.author = a;
        this.available = true;
        this.returnDate = 14;
    }
    
    public void borrow(){
        try{
            alreadyBorrowed();
            this.available = false;
        }catch(AlreadyBorrowedException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void alreadyBorrowed() throws AlreadyBorrowedException{
        if (available) {
            System.out.println("Material borrowed successfully.");
            System.out.printf("Due date for return: [Today's Date + %ddays]\n", returnDate);
            System.out.printf("The item \"%s\" by %s is successfully borrowed and should be returned by [Today's Date + %ddays].\n", title, author, returnDate);
        }else{
            throw new AlreadyBorrowedException(String.format("\nThe item \"%s\" by %s is currently unavailable and should be available after [Today's Date + %ddays].\n", title, author, returnDate));
        }
    }
}

