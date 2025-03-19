/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author tianlongc
 */
public class DVD extends LibraryMaterial{
    private int duration;
    
    public DVD(String t, String a, int d){
        super(t, a);
        this.duration = d;
    }
    
    // Mutator
    public void setDuration(int d){
        this.duration = d;
    }
    
    @Override
    public void borrow(){
        try{            
            if (this.duration > 5) {
                // System.out.println("DVDs can only be borrowed for a maximum of five days");
                // Mutate the duration max to 5 only
                setDuration(5);
            }
            alreadyBorrowed();
            this.available = false;
        }catch(AlreadyBorrowedException e){
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public void alreadyBorrowed() throws AlreadyBorrowedException{
        if (available) {
            System.out.println("DVD borrowed successfully.");
            System.out.printf("Due date for return: [Today's Date + %ddays]\n", this.duration);
            System.out.printf("The DVD \"%s\" by %s is successfully borrowed and should be returned by [Today's Date + %ddays].\n", title, author, this.duration);
        }else{
            throw new AlreadyBorrowedException(String.format("\nThe DVD \"%s\" by %s is currently unavailable and should be available after [Today's Date + %ddays].\n", title, author, returnDate));
        }
    }
}
