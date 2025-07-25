/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1Q5;

/**
 *
 * @author tianlongc
 */

/*
REMIXREMIXABCREMIX
REMIXHELLOREMIXWORLDREMIXISREMIXBEAUTIFUL
*/

import java.util.Scanner;
public class V1Q5ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter song: ");
        String remix_song = sc.nextLine();
        
        if (remix_song.length() > 200) {
            System.out.println("The song name does not exceed 200 words! Please try again.");
        } else if (remix_song.equals(remix_song.toUpperCase())){
            // Remove REMIX (treat them as delimiters)
            // trim() is remove unnecessary spacing in front and behind the text
            String song = remix_song.replaceAll("REMIX", " ").trim();
            
            if (song.isEmpty()){
                System.out.println("The remix song do not have the original song");
            }else{
                System.out.println("The original song is: " + song);
            }
        } else {
            System.out.println("Please enter the song in uppercase English letters!");
        }
        
        sc.close();
    }
}
