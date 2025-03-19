/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10Q2ex;

/**
 *
 * @author tianlongc
 */
// refer https://theasciicode.com.ar/ for ASCII table
/*
    Key fixes:
    1. Restrict the shift to alphabetic characters only. 
        -Non-alphabetic characters (e.g., spaces, numbers, symbols) remain unchanged
    2. Handle wrapping around the alphabet (e.g., 'z' shifted by 1 becomes 'a').
    3. Add support for case sensitivity.
*/
import java.io.*;

public class SubstitutionCipher implements MessageEncoder{
    protected String inputFileName;
    protected String outputFileName;
    protected int shift;
    
    public SubstitutionCipher(String inputFileName, String outputFileName, int shift){
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shift = shift;
    }
    
    @Override
    public String encode(String plainText){
        String encodedMessage = "";
        for (int i = 0; i < plainText.length(); i++) {
            char letter = plainText.charAt(i);
            if (Character.isLetter(letter)) {
                // Handles case sensitivity (A-Z) and (a-z) separately to 
                // avoid wrapping into uppercase or lowercase ASCII range
                char base = Character.isLowerCase(letter) ? 'a' : 'A';
                // Wrap around the alphabets
                // -Shift within uppercase range (65-90) using modulo 26 to wrap around 'Z' to 'A'
                // -Shift within lowercase range (97-122) using modulo 26 to wrap around 'z' to 'a'
                letter = (char)(base + (letter - base + shift + 26) % 26); 
            }
            encodedMessage += letter;
        }
        return encodedMessage;
    }
    
    @Override
    public String decode(String cipherText){
        String decodedMessage = "";
        for (int i = 0; i < cipherText.length(); i++) {
            char letter = cipherText.charAt(i);
            if (Character.isLetter(letter)) {
                // Handles case sensitivity (A-Z) and (a-z)
                char base = Character.isLowerCase(letter) ? 'a' : 'A';
                // Wrap around the alphabets
                letter = (char)(base + (letter - base - shift + 26) % 26); 
            }
            decodedMessage += letter;
        }
        return decodedMessage;
    }
    
    // Modularize the Encoding and Decoding File format
    public void convert(String type){
        try{
            BufferedReader inputFile = new BufferedReader(new FileReader(inputFileName));
            PrintWriter outputFile = new PrintWriter(new FileOutputStream(outputFileName));
            
            String line = "", content = "", converted = "";
            
            while ((line = inputFile.readLine()) != null) {
                content += line + "\n";
            }
            
            if (type.equalsIgnoreCase("plain")) {
                converted = this.encode(content);
            } else if (type.equalsIgnoreCase("cipher")){
                converted = this.decode(content);
            }
            
            outputFile.write(converted);
            
            inputFile.close();
            outputFile.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error input and output file: " + e.getMessage());
        }
    }
    
}
