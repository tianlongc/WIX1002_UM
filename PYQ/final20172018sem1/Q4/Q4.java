/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author tianlongc
 */
import java.io.*;

public class Q4 {
    public static void main(String[] args) {
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader("Q4.txt"));
            
            double highestScore = 0;
            String winner = "";
            String line ="";
            while ((line = inputStream.readLine()) != null) {
                String[] parts = line.split(",");
                double[] scores = new double[parts.length-2];
                double sum = 0;
                String name = parts[0];
                for (int i = 0; i < scores.length; i++) {
                    scores[i] = Double.parseDouble(parts[i+1]);
                    sum += scores[i];
                }
                
                int degreeOfDifficulty = Integer.parseInt(parts[6]);
                
                // Find min and max values
                double min = scores[0];
                double max = scores[0];
                for (int i = 0; i < scores.length; i++) {
                    min = Math.min(min, scores[i]);
                    max = Math.max(max, scores[i]);
                }
                sum -= (max + min);
                double finalScore = sum * degreeOfDifficulty;
                
                // find winner by highest score
                if (finalScore > highestScore) {
                    highestScore = finalScore;
                    winner = parts[0];
                }
                System.out.println(name + " score " + finalScore);
            }
            System.out.println(winner + " is the winner");
            
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
