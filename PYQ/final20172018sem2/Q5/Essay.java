/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
public class Essay extends GradedActivity{
    private int grammar;
    private int spelling;
    private int length;
    private int content;
    
    public Essay(int grammar, int spelling, int length, int content){
        this.grammar = grammar;
        this.spelling = spelling;
        this.length = length;
        this.content = content;
        
        super.setScore(this.grammar + this.spelling + this.length + this.content);
    }
    
    @Override
    public String toString(){
        return String.format("\nEssay score:\nGrammar: %d\nSpelling: %d\nLength: %d\nContent: %d\n\n%s", 
                this.grammar, this.spelling, this.length, this.content, super.toString());
    }
}
