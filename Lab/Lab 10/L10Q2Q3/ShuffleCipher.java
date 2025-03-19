/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10Q2Q3;

/**
 *
 * @author tianlongc
 */
import java.io.*;

public class ShuffleCipher implements MessageEncoder{
    protected String inputFileName;
    protected String outputFileName;
    protected int N;
    
    public ShuffleCipher(String inputFileName, String outputFileName, int N){
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.N = N;
    }
    
    @Override
    public String encode(String plainText){
        // Capture who the exact behind kacau my string length which is Line Feed
//        System.out.println((int)cipherText.charAt(5));
        // Combine character alternately from each half
            int half = plainText.length() / 2;
            String shuffledText = "";
            
            // take the first half and the pair after half
            for (int i = 0; i < half; i++){
                // "" to force + operator treat as String concatenation
                // A case where two char performs numeric addition fails the whole program
//                shuffledText += "" + plainText.charAt(i) + plainText.charAt(i + half);   // first + second half
                shuffledText += plainText.charAt(i); // First half
                shuffledText += plainText.charAt(i + half); // Second half
            }
            
            // If the length is odd, append the last character
            if (plainText.length() % 2 != 0){
                // minus 1 for array index
                shuffledText += plainText.charAt(plainText.length() - 1);
            }
            
        return shuffledText;
    }
    
    @Override
    public String decode(String cipherText) {
            String left = "", right = "";
            
            // Process the string in pairs or divide it into two equal halves
            // Calculates the largest even number ≤ length
            int alternateLength = cipherText.length() / 2 * 2;
            String unshuffledText = "";
            
            // take the first half and the pair after half
            for (int i = 0; i < alternateLength; i += 2){
                left += cipherText.charAt(i); // First half
                right += cipherText.charAt(i + 1); // Second half
            }
            
            // If the length is odd, append the last character
            if (cipherText.length() % 2 != 0){
                // minus 1 for array index
                unshuffledText += left + right + cipherText.charAt(cipherText.length() - 1);
            } else {
                unshuffledText += left + right;
            }
                
        return unshuffledText;
    }


    // Modularize the Encoding and Decoding File format
    public void shuffle(String type){
        try{
            BufferedReader inputFile = new BufferedReader(new FileReader(inputFileName));
            PrintWriter outputFile = new PrintWriter(new FileOutputStream(outputFileName));
            
            String line = "", content = "", converted = "";
            
            while ((line = inputFile.readLine()) != null) {
                content += line + "\n";
            }
            
            // Remove the last LF character 
            if (content.length() > 0) {
                content = content.substring(0, content.length() - 1);
            }
            
            for (int shuffle = 0; shuffle < N ; shuffle++) {
                if (type.equalsIgnoreCase("normal")) {
                    converted = this.encode(content);
                } else if (type.equalsIgnoreCase("shuffle")){
                    converted = this.decode(content);
                }
            }
            
            outputFile.write(converted);
            
            inputFile.close();
            outputFile.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found!");
        }catch(IOException e){
            System.out.println("Error input and output file");
        }
    }
}
