/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author tianlongc
 */
interface Playable{
    public void play();
}

class Guitar implements Playable{
    @Override
    public void play(){
        System.out.println("Playing guitar");
    }
}

class Piano implements Playable{
    @Override
    public void play(){
        System.out.println("Playing piano");
    }
}

public class Music {
    public static void main(String[] args) {
        Playable[] p = new Playable[2];
        p[0] = new Guitar();
        p[1] = new Piano();
        
        p[0].play();
        p[1].play();
    }
}
