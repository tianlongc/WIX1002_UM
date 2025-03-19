/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author tianlongc
 */
public class Diving {
    private String name;
    private String country;
    private double[][] scores;
    private double[] difficulty;
    
    public Diving(String name, String country, double[][] scores, double[] difficulty){
        this.name = name;
        this.country = country; 
        this.scores = scores; // use multidimensional array to store 3 attempts and 7 judges scores
        this.difficulty = difficulty;
    }
    
    // Accessor method
    public String getName(){
        return name;
    }
    
    public String getCountry(){
        return country;
    }
    // There are 2 methods:
    // > Direct comparison - Find the values by comparing
    // > Sort - ascending/descending order CAUTIOUS: Handle with care, Array is mutable!!!
    public double getFinalScore(){
        double[] sum = new double[3];
        // Sort the array 
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                // Bubble sort
                for (int k = 0; k < scores[i].length-j-1; k++) {
                    if (scores[i][k] < scores[i][k+1]) {
                        double temp = scores[i][k];
                        scores[i][k] = scores[i][k+1];
                        scores[i][k+1] = temp;
                    }
                }
            }
        }
        double[] max1 = new double[3];
        double[] max2 = new double[3];
        double[] min1 = new double[3];
        double[] min2 = new double[3];
        
        // Initializing the values and sum up the values
        for (int i = 0; i < scores.length; i++) {
            max1[i] = scores[i][0]; // first element
            max2[i] = scores[i][1]; // second element
            min1[i] = scores[i][6]; // last element
            min2[i] = scores[i][5]; // second last element
            for (int j = 0; j < scores[i].length; j++) {
                sum[i] += scores[i][j];
            }
        }
        
        double finalScore = 0;
        for (int i = 0; i < scores.length; i++) {
            sum[i] = (sum[i] - (max1[i] + max2[i] + min1[i] + min2[i])) * difficulty[i];
            finalScore += sum[i];
        }
        
        return finalScore;
    }
    
    @Override
    public String toString(){
        String judgeScoresRating = "";
        for (int i = 0; i < scores.length; i++) {
            judgeScoresRating += "Judges Scores : ";
            for (int j = 0; j < scores[i].length; j++) {
                judgeScoresRating += scores[i][j] + " ";
            }
            judgeScoresRating += "\nDifficulty Rating : " + difficulty[i] + "\n";
        }
        
        return ("Diver : " + name + " (" + country + ")\n" + judgeScoresRating + "Final Score : " + getFinalScore() + "\n");
    }
}
