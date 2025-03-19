/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L10Q2Q3;

/**
 *
 * @author tianlongc
 */
public class Tester {

    public static void main(String[] args) {

        // L10Q2
        SubstitutionCipher plainText = new SubstitutionCipher("plain.txt","encode.txt",5);
        SubstitutionCipher cipherText = new SubstitutionCipher("cipher.txt","decode.txt",5);
        
        plainText.convert("plain");
        cipherText.convert("cipher");
        
        // L10Q3
        ShuffleCipher normalText = new ShuffleCipher("inputNormal.txt","outputShuffled.txt",5);
        ShuffleCipher shuffledText = new ShuffleCipher("inputShuffled.txt","outputNormal.txt",5);
        
        normalText.shuffle("normal");
        shuffledText.shuffle("shuffle");
    }
    
}
