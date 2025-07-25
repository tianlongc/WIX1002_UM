/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q3;

/**
 *
 * @author tianlongc
 */
public class Adopter {
    private String name;
    private String preferredSpecies;
    private String preferredAgeRange;
    
    public Adopter(String name, String preferredSpecies, String preferredAgeRange){
        this.name = name;
        this.preferredSpecies = preferredSpecies;
        this.preferredAgeRange = preferredAgeRange;
    }
    
    public String getName(){
        return name;
    }
    
    public void viewMatchingPets(PetAdoptionCentre centre){
        String[] range = preferredAgeRange.split("-");
        int minAge = Integer.parseInt(range[0]);
        int maxAge = Integer.parseInt(range[1]);
        boolean found = false;
        
        for (Pet pet: centre.getPets()) {
            if (pet.getSpecies().equalsIgnoreCase(preferredSpecies) && 
                (pet.getAge() >= minAge && pet.getAge() <= maxAge) && !pet.getIsAdopted()){    
                System.out.println(pet.getDetails());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No matching pets found.");
        }
    }
}
