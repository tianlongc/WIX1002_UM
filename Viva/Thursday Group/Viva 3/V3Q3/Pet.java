/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q3;

/**
 *
 * @author tianlongc
 */
public class Pet {
    private String name;
    private String species;
    private String breed;
    private int age;
    private String healthRecord;
    private boolean isAdopted;
    private String adopterName;
    
    public Pet(String name, String species, String breed, int age, String healthRecord){
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.age = age;
        this.healthRecord = healthRecord;
        this.isAdopted = false;
        this.adopterName = null;
    }
    
    public String getName(){
        return name;
    }
    
    public boolean getIsAdopted(){
        return isAdopted;
    }
    
    public String getSpecies(){
        return species;
    }
    
    public int getAge(){
        return age;
    }
    
    public void adopt(String adopterName){
        if (!isAdopted) {
            this.isAdopted = true;
            this.adopterName = adopterName;
            System.out.printf("\n%s adopts %s:\n", this.adopterName, name);
        }else{
            System.out.printf("\n%s has been adopted by %s!\n", name, this.adopterName);
        }
    }
    
    public String getDetails(){
        return String.format("PetName: %s\nSpecies: %s\nBreed: %s\nAge: %d\nHealthRecord: %s\nAdopted: %s\nAdopterName: %s\n"
                , name, species, breed, age, healthRecord, isAdopted ? "adopted" : "not adopted", adopterName);
    }
}
