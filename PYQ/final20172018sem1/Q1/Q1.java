/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Error 1: Random System.out
        Scanner a = new Scanner(System.in);
        int num, sum=0;
        do{
            System.out.print("Enter an integer number, -1 to quit:");
            // use integer data type
            num = a.nextInt();
            // compare using == instead of =
            if (num==-1) {
                break; // exit loop instead skip value
            }
            // condition wrong
            if(num%2==0){
                System.out.println("The number is an even number");
            }else{
                System.out.println("The number is an odd number");
            }
            sum+=num;
        }while(num!=-1);
        // use , for printf
        System.out.printf("The sum of all integer number(s) is : %5d\n", sum);
    }
}
