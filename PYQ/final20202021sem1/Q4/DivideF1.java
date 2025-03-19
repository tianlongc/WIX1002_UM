/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author tianlongc
 */
/*
    You are not allowed to convert the integer into String, you need to use formula to get each
    odd and even digit.
*/
public class DivideF1 extends Eleven{
    
    public DivideF1(String fileName){
        super(fileName);
    }
    
    @Override
    public String divide(){
        String output = "Divisibilty Rule (Formula 1)\n";
        
        // I dont use StringBuilder so it looks quite messy because sometimes the exam forbids us from
        // using external API library so I usually just hardcode them yeah. I apologise :(
        for (int number: array) {
            String oddDigits = "";
            String evenDigits = "";
            int temp = number;
            int sumOdd = 0, sumEven = 0;
            int position = 1;
            
            // Calculate x: Difference of the sum of all odd and even digits
            while (temp > 0) {
                int digit = temp % 10;
                if (position % 2 == 1) {
                    sumOdd += digit;
                    oddDigits += String.format("%d%s", digit, (((temp/10) != 0 && (temp/100) != 0) ? " + ":""));
                }else{
                    sumEven += digit;
                    evenDigits += String.format("%d%s", digit, (((temp/10) != 0 && (temp/100) != 0) ? " + ":""));
                }
                temp /= 10;
                position++;
            }
            
            // Reverse the numbers to process digits from left to right
            String reversedOdd = "";
            for (int i = oddDigits.length()-1; i >= 0 ; i--) {
                reversedOdd += oddDigits.charAt(i);
            }
            
            String reversedEven = "";
            for (int i = evenDigits.length()-1; i >= 0 ; i--) {
                reversedEven += evenDigits.charAt(i);
            }
            
            int x = Math.abs(sumOdd - sumEven);
            output += String.format("%d : |x| = | (%s) - (%s) | = %d\n", number, reversedOdd, reversedEven, x);
            if ((x % 11) == 0) {
                output += String.format("%d modulus 11 = 0, %d is divisible by 11\n\n", x, number);
            }else{
                output += String.format("%d modulus 11 is not equal to 0, %d is not divisible by 11\n\n", x, number);
            }
        }
        return output;
    }
}
