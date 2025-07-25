/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q2;

/**
 *
 * @author tianlongc
 */
public class ZooTest {
    public static void main(String[] args) {
        // Create a new zoo with space for 3 creatures
        Zoo myZoo = new Zoo(3);
        
        // Add creatures to the zoo
        myZoo.addCreature("Panda", 150.0, "Mountains");
        myZoo.addCreature("Dragon", 300.0, "Cave");
        myZoo.addCreature("Master Oogway", 200.0, "Forest");
        
        // Try adding one more creature to the full zoo
        myZoo.addCreature("Patrick Star", 250.0, "Rock");
        // Should print "Zoo is full!"
        
        // Display all creatures in the zoo
        myZoo.displayAllCreatures();
        
        // Feed the Dragon
        myZoo.feedCreature("Dragon", 50.0);
        
        // Display updated creature details
        myZoo.displayAllCreatures();
    }
}
