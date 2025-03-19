/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class GradedActivity {
    protected int score;
    
//    public GradedActivity(){
//        this.score = 0;
//    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    public int getScore(){
        return this.score;
    }
    
    public char getGrade(){
        if (score >= 90) {
            return 'A';
        }else if (score >= 80){
            return 'B';
        }else if (score >= 70){
            return 'C';
        }else if (score >= 60){
            return 'D';
        }else{
            return 'F';
        }
    }
    
    @Override
    public String toString(){
        return "Total score: " + this.score + "\n" +
                "Essay grade: " + getGrade();
    }
}
