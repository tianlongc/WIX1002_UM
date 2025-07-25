/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1Q5;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
public class V1Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter song: ");
        String remix_song = sc.nextLine();
        
        if (remix_song.length() > 200) {
            System.out.println("The song name does not exceed 200 words! Please try again.");
        } else if (remix_song.equals(remix_song.toUpperCase())){
            // Used to break down the REMIX
            String[] songParts = remix_song.split("REMIX");
            String song = "";
        
            for(String part: songParts){
                if(!part.trim().isEmpty()){
                song += part.trim() + " ";
                }
            }
            if (song.trim().isEmpty()){
                System.out.println("The remix song do not have the original song");
            }else{
                System.out.println("The original song is: " + song.trim());
            }
        } else {
            System.out.println("Please enter the song in uppercase English letters!");
        }
        sc.close();
    }
}
