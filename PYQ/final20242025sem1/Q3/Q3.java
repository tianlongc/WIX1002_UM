/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author tianlongc
 */
public class Q3 {
    public static void main(String[] args) {
        LibraryMaterial l = new LibraryMaterial("The Great Gatsby", "F. Scott Fitzgerald");
        DVD d = new DVD("Inception", "Christopher Nolan", 148);
        Magazine m = new Magazine("National Geographic", "Various authors");
        
        l.borrow();
        l.borrow();
        d.borrow();
        m.borrow();
    }
}
