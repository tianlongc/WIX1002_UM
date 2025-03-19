/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L9Q2Q3;

/**
 *
 * @author tianlongc
 */
public class Tester {
    public static void main(String[] args) {
        
        Student s = new Student("Ali bin Abu", 'M', "01-04-2003","course.txt");
        Lecturer l = new Lecturer("Siti binti Ahmad", 'F', "27-05-1990","lecturer.txt");
        
        s.display();
        l.display();
    }
    
}
