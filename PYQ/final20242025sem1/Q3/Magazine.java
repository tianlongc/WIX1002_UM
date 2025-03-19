/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author tianlongc
 */
public class Magazine extends LibraryMaterial{
    
    public Magazine(String t, String a){
        super(t,a);
    }
    
    @Override
    public void borrow(){
        System.out.println("\nMagazines cannot be borrowed.");
    }
}
