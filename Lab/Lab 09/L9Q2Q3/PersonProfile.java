/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L9Q2Q3;

/**
 *
 * @author tianlongc
 */
public class PersonProfile {
    protected String name;
    protected char gender;
    protected String dateOfBirth;
    
    public PersonProfile(String name, char gender, String dob){
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dob;
    }
    
    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Date of Birth: " + this.dateOfBirth);
    }
}
