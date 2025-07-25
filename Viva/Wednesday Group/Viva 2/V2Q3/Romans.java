/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V2Q3;

/**
 *
 * @author tianlongc
 */


/*
Sample Input 1
Wong Yoong Yee
1
II + III = V

Sample Input 2
Lee Kah Sing , Ridwan Faiz bin Mohamad Hassan , Suresh a/l Subramaniam
10
XXIV + MMCD = MMCDXXIV
XXIV - MMCD = XXIVMMCD
MMCD - XXIV = MMCCCLXXVI
XX * iv = lxXX
MM / CD = V
CCcc % CcCcCcCcCcCcCcCcCcCc = CCCC
V ^ V = MMMXXV
MDCLXVI ^ I = MDCLXVI
MDCLXVI - IVXLCDM = MCCCXXXII
MDCLXVI = IVXLCDM + MCCCXXXII
*/
import java.util.Scanner;

public class Romans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        System.out.print("Enter name(s) of the program user(s): ");
        String usernames = sc.nextLine();
//        System.out.print("Enter the number of statements: ");
        int n = sc.nextInt(); // test cases
        sc.nextLine(); // clears input buffer
        
        // Clean usernames
        String cleanedNames = "";
        String[] names = usernames.split("\\s+,\\s+");
        for (int i = 0; i < names.length; i++) {
            String[] parts = names[i].replaceAll("[-'_.,]+", "").split("\\s+");
            for (String part: parts) {
                cleanedNames += part + " ";
            }
            if (i < names.length - 1) {
                cleanedNames += ", ";
            }
        }
        
        String[] statements = new String[n];
        for (int i = 0; i < n; i++) {
            statements[i] = sc.nextLine();
        }
        // trim() to remove last trailing space
        System.out.printf("Statement for the Roman numeral test are sent in by %s (%s).\n\n", generateInitials(usernames), cleanedNames.trim());
        
        int correct = 0;
        for (String statement: statements) {
            String[] parts = statement.split(" ");
            // the format of ‘roman_numeral_1 arithmetic_operand roman_numeral_2 equality_sign roman_numeral_3’, such as ‘I + II = III’
            if (parts.length != 5) {
                System.out.println("Invalid Statement.");
                continue; // skip to the next statement
            }
            
            String roman1 = parts[0];
            String operator = parts[1];
            String roman2 = parts[2]; 
            String roman3 = parts[4]; // parts[3] is equality sign so ignored
            
            int arabic1 = convertArabics(roman1);
            int arabic2 = convertArabics(roman2);
            int arabic3 = convertArabics(roman3);
            
            if (arabic1 == -1 || arabic2 == -1 || arabic3 == -1 || 
                    arabic1 < 1 || arabic1 > 3999 || arabic2 < 1 || arabic2 > 3999 || arabic3 < 1 || arabic3 > 3999)  {
                System.out.println("Invalid Statement.");
                continue; // skip to the next statement
            }
            
            int result = 0;
            switch(operator){
                case "+":
                    result = arabic1 + arabic2;
                    break;
                case "-":
                    result = arabic1 - arabic2;
                    break;
                case "*":
                    result = arabic1 * arabic2;
                    break;
                case "/":
                    result = arabic1 / arabic2;
                    break;
                case "%":
                    result = arabic1 % arabic2;
                    break;
                case "^":
                    result = (int) Math.pow(arabic1, arabic2);
                    break;
                default: // Handles exception
                    System.out.println("Invalid Statement.");
                    continue; // skip to the next statement
            }
            if (result < 1 || result > 3999) {
                System.out.println("Invalid Statement.");
                continue; // skip to the next statement
            }
            
            if (result == arabic3) {
                System.out.printf("%d %s %d = %d is correct.\n", arabic1, operator, arabic2, arabic3);
                correct++;
            }else{
                System.out.printf("%d %s %d = %d is wrong, as the answer should be %s, which is %d in Arabic numeral form.\n", arabic1, operator, arabic2, arabic3, convertRoman(result), result);
            }
        }
        // ensures floating point division
        double percentage = (correct/(double)n) * 100;
        
        System.out.println("\nNumber of Correct Statement = " + correct);
        System.out.printf("Percentage of Correct Statement = %.2f%%\n", percentage);
        
        sc.close();
    }
    
    public static String generateInitials(String usernames){
        String[] names = usernames.split("\\s+,\\s+");
        String initials = "";
        
        for (int i = 0; i < names.length; i++) {
            String[] parts = names[i].replaceAll("[-'_.,]+", "").split("\\s+");
            for (String part: parts) {
                if(!part.matches("bin|binti|a/l|a/p|al|ap|@")){
                    initials += Character.toUpperCase(part.charAt(0));
                }
            }
            if (i < names.length - 1) {
                initials += ", ";
            }
        }
        
        return initials;
    }
    
    public static int convertArabics(String roman) {
        roman = roman.toUpperCase(); // Standardize to handle lowercase letters
        int[] romanValues = new int[roman.length()];

        // Convert each Roman character to its corresponding value
        for (int i = 0; i < roman.length(); i++) {
            switch (roman.charAt(i)) {
                case 'I':
                    romanValues[i] = 1;
                    break;
                case 'V':
                    romanValues[i] = 5;
                    break;
                case 'X':
                    romanValues[i] = 10;
                    break;
                case 'L':
                    romanValues[i] = 50;
                    break;
                case 'C':
                    romanValues[i] = 100;
                    break;
                case 'D':
                    romanValues[i] = 500;
                    break;
                case 'M':
                    romanValues[i] = 1000;
                    break;
                default:
                    return -1; // Invalid Roman numeral
            }
        }

        // Convert Roman to Arabic using subtractive notation
        int arabic = 0;
        for (int i = 0; i < romanValues.length; i++) {
            // If the current value is smaller than the next value, subtract it
            if ((i+1 < romanValues.length) && (romanValues[i] < romanValues[i+1])) {
                arabic -= romanValues[i];
            } else {
                // Otherwise, add it
                arabic += romanValues[i];
            }
        }

        return arabic;
    }
    
    public static String convertRoman(int arabics){
        if (arabics < 1 || arabics > 3999) {
            return "Invalid Statement.";
        }
        String[] romanSymbols = {"M", "CM", "D", "C", "CD", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        
        String romans = "";
        // Greedy algorithm to convert Arabic to Roman numerals
        for (int i = 0; i < arabicValues.length; i++) {
            while (arabics >= arabicValues[i]) {
                romans += romanSymbols[i]; // appends the corresponding Roman symbol
                arabics -= arabicValues[i]; // subtracts the largest possible Arabic value 
            }
        }

        return romans;
    }
}
