/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter font size: ");
        int size = sc.nextInt();
        
        System.out.print("Enter font type: ");
        char type = sc.next().charAt(0);
        
        System.out.print("Enter format [1 - Vertical, 2 - Horizontal]: ");
        int format = sc.nextInt();
        
        displayNumber(size, type, format);
        
        sc.close();
    }
    
    public static void displayNumber(int size, char type, int format){
        if (format == 1) {
            int sizeVertical = size * 2 + 3;
            int sizeHorizontal = size + 2;            
            for(int i = 1; i <= sizeVertical; i++){
                if (i == 1 || i == size + 2 || i == sizeVertical){
                    for(int j = 1; j <= sizeHorizontal; j++){
                        System.out.print(type);
                    }
                    System.out.println("");
                }else{
                    for (int j = 1; j <= sizeHorizontal; j++){
                        if(j == 1 || j == sizeHorizontal){
                            System.out.print(type);
                        }else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
            }
        }else if(format == 2){
            int sizeVertical = size + 2;
            int sizeHorizontal = size * 2 + 3;
            for(int i = 1; i <= sizeVertical; i++){
                if (i == 1 || i == sizeVertical){
                    for(int j = 1; j <= sizeHorizontal; j++){
                        System.out.print(type);
                    }
                    System.out.println("");
                }else{
                    for(int j = 1; j <= sizeHorizontal; j++){
                        if (j == 1 || j == size + 2 || j == sizeHorizontal)
                            System.out.print(type);
                        else
                            System.out.print(" ");
                    }
                    System.out.println("");                    
                }
            }
        }else{
            System.out.println("Invalid format!");
        }
    }
}
