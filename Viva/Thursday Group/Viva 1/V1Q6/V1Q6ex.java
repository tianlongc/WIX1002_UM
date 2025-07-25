/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V1Q6;

/**
 *
 * @author tianlongc
 */
import java.util.*;
public class V1Q6ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        boolean negative = false;
        boolean secondMaxExist = false;
        
        System.out.print("Enter numbers: ");
        
        while (true) {
            int number = sc.nextInt();
            
            if (number != 0) {
                numbers.add(number);
                sum += number;
            }else{
                break;
            }
            if (number < 0){
                negative = true;
            }
        }
        
        Collections.sort(numbers, Collections.reverseOrder());
        int max = numbers.get(0);
        int fmax = Collections.frequency(numbers, max);
                
        int secondMax = -99;
        
        for(int i = 0; i < numbers.size(); i++){
            int second = numbers.get(i);
            if (second != max){
                secondMax = second;
                secondMaxExist = true;
                break;
            }
        }

        
        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + fmax);
        
        // Check if second highest score exists
        if (secondMaxExist) {
            int fsecondMax = Collections.frequency(numbers, secondMax);
            System.out.println("The second-largest number is " + secondMax);
            System.out.println("The occurrence count of the second-largest number is "+ fsecondMax);
        } else {
            System.out.println("The second-largest number does not exist.");
        }
       
        System.out.println("The total sum of all numbers is " + sum);
        if (negative){
            System.out.println("Negative numbers were entered.");
        } else {
            System.out.println("No negative numbers were entered.");
        }
        
        sc.close();
    }
}
