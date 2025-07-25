/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q3;

/**
 *
 * @author tianlongc
 */
import java.util.List;
import java.util.ArrayList;

public class PetAdoptionCentre {
    private List<Pet> pets;
    
    public PetAdoptionCentre(){
        this.pets = new ArrayList<>();
    }
    
    public void addPet(Pet pet){
        pets.add(pet);
    }
    
    public void adoptPet(Pet pet, Adopter adopter){
        pet.adopt(adopter.getName());
    }
    
    public void viewAvailablePets(){
        for (Pet pet: pets) {
            if (!pet.getIsAdopted()) {
                System.out.println(pet.getDetails());
            }
        }
    }
    
    public Pet getPetByName(String petName){
        for (Pet pet: pets) {
            if (pet.getName().equalsIgnoreCase(petName)) {
                return pet;
            }
        }
        return null; // If not found
    }
    
    public List<Pet> getPets(){
        return pets;
    }
}
