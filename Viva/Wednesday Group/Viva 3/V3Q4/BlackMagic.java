/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q4;

/**
 *
 * @author tianlongc
 */
public class BlackMagic {
    private String name;
    private int effect;
    private String log;
    
    public BlackMagic(String name, int effect){
        this.name = name;
        this.effect = effect;
    }
    
    public int effect(Player player, Enemy enemy){
        if (name.equals("Poison")) {
            player.setAttackPower((int)(player.getAttackPower() * 0.9));
            player.takeDamage(effect);
            log = String.format("%s used %s on %s for %d damage and reduced the next attack power by 10%%!", enemy.getType(), name, player.getName(), effect);
        }else if (name.equals("Magic Orb")){
            log = String.format("%s used %s and increased the next attack power by 200%% for the next turn!", enemy.getType(), name);
        }
        return effect;
    }
    
    @Override
    public String toString(){
        return log;
    }
}
