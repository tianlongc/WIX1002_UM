/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author tianlongc
 */
public class DivideF2 extends Eleven{
    
    public DivideF2(String fileName){
        super(fileName);
    }
    
    @Override
    public String divide(){
        String output = "Divisibilty Rule (Formula 2)\n";
        int x = 0;
        
        for (int number: array) {
            int temp = number;
            output += number + ", : ";
            while (temp >= 100) {
                int tempInteger = temp/10;
                int lastDigit = temp % 10;
                x = tempInteger - lastDigit;
                output += String.format("%d - %d * 1 = %d, ", tempInteger, lastDigit, x);
                temp = x;
            }
            output += "x = " + x + "\n";
            if ((x % 11) == 0) {
                output += String.format("%d modulus 11 = 0, %d is divisible by 11\n\n", x, number);
            }else{
                output += String.format("%d modulus 11 is not equal to 0, %d is not divisible by 11\n\n", x, number);
            }
        }
        
        return output;
    }
}
