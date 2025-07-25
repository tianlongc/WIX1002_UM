/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q4;

/**
 *
 * @author tianlongc
 */
public class Item {
    private String name;
    private int effect;
    private String log;
    
    public Item(String name, int effect){
        this.name = name;
        this.effect = effect;
        this.log = "";
    }
    
    public int use(Player player){
        if (name.equals("Health Potion")) {
            player.setHealth(player.getHealth() + effect);
            log = String.format("%s used %s and healed for %d health!", player.getName(), name, effect);
        }else if (name.equals("Sword")){
            log = String.format("%s used %s and gained +%d attack power for the next turn!", player.getName(), name, effect);
        }
        return effect;
    }
    
    @Override
    public String toString(){
        return log;
    }
}
