/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10Q2Q3;

/**
 *
 * @author tianlongc
 */
// refer https://theasciicode.com.ar/ for ASCII table
/*
    Limitation
    1. ASCII based shifting - The code shifts characters based on their ASCII values. 
        This can lead to issues if the shift causes characters to go outside the printable ASCII range 
        (e.g., shifting 'z' by 1 might result in a non-alphabetic character).
    2. Case sensitivity - Does not distinguish between uppercase and lowercase letters
    3. Non-Alphabetic Characters - shifts all characters
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
            int ascii = (int)letter + this.shift;
            encodedMessage += (char)ascii;
        }
        return encodedMessage;
    }
    
    @Override
    public String decode(String cipherText){
        String decodedMessage = "";
        for (int i = 0; i < cipherText.length(); i++) {
            char letter = cipherText.charAt(i);
            int ascii = (int)letter - this.shift;
            decodedMessage += (char)ascii;
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
