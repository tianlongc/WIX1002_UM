/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package L10Q2ex;

/**
 *
 * @author tianlongc
 */
public class Tester {

    public static void main(String[] args) {

        SubstitutionCipher plainText = new SubstitutionCipher("plain_text.txt","encode_output.txt",3);
        SubstitutionCipher cipherText = new SubstitutionCipher("cipher_text.txt","decode_output.txt",3);
        
        plainText.convert("plain");
        cipherText.convert("cipher");
        
    }    
}
