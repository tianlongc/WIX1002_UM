/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1Q2;

/**
 *
 * @author tianlongc
 */
/*
    Viva 1: Thursday Group
    Question 2: 1st example.
    Incorrect [Input: 10 2 2, Output: 4]
    Correct[Input: 10 2 2, Output:3]
*/
import java.util.Scanner;
public class V1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int step = 0;
        
        System.out.println("Enter the integers for n, a and b:");
        int nnn = sc.nextInt();
        int aaa = sc.nextInt();
        int bbb = sc.nextInt();
                
        if((nnn >= 1) && (nnn <= 1000000000) && (aaa >= 1) && (aaa <= nnn) && (bbb >= 2) && (aaa <= 100000)){
            while(nnn > 1){
                if (nnn % bbb == 0){
                    nnn /= bbb;
                } else if (nnn > aaa){
                    nnn -= aaa;
                } else{
                    nnn = -1;
                }
                step++;
            }
        }else {
            System.out.println("Invalid input! Please try again.");
            return; // ends the program once a invalid input is entered
        }
        
        if (nnn==1){
            System.out.println(step);
        }
        else{
            System.out.println(nnn);      
        }
            
        sc.close();
    }
}
