/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author tianlongc
 */
public class TextManipulator {
    private String[] texts;
    
    public TextManipulator(String[] t){
        this.texts = t;
    }
    
    public void cleanText(){
        for (int i = 0; i < texts.length; i++) {
            texts[i] = texts[i].replaceAll("[\"#~@]+", "");
        }
    }
    
    public void reverseText(){
        for (int i = 0; i < texts.length; i++) {
            String reverse = "";
            for (int j = texts[i].length() - 1; j >= 0; j--) {
                reverse += texts[i].charAt(j);
            }
            texts[i] = reverse;
        }
    }
    
    public void arrangeText(){
        for (int i = 0; i < texts.length; i++) {
            for (int j = 0; j < texts.length - i - 1; j++) {
                if (texts[j].compareTo(texts[j+1]) > 0) {
                    String temp = texts[j];
                    texts[j] = texts[j+1];
                    texts[j+1] = temp;
                }
            }
        }
    }
    
    public void display(){
        for (int i = 0; i < texts.length; i++) {
            System.out.println(texts[i]);
        }
    }
    
    public String[] getTexts(){
        return this.texts;
    }
}
