/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] operators = {'+','-','*','/'};
        boolean solutionFound = false; // flag to track there's solution or not
        
        // Prompt message
        System.out.print("Enter 3 numbers [1-9] : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        /*
        My apologies!! I hardcode all edgy cases to get the exact output
        */
        for (char op1: operators) {
            for (char op2: operators) {
                // case 1: a op1 b op2 c BUT OP1 first
                if (((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) && (applyOperator(applyOperator(a, b, op1), c, op2) == 18)) {
                    System.out.printf("%d %c %d %c %d = 18\n", a, op1, b, op2, c);
                    solutionFound = true;
                }
                // case 2: a op1 b op2 c BUT OP2 first
                else if (((op1 == '+' || op1 == '-') && (op2 == '*' || op2 == '/')) && applyOperator(a, applyOperator(b, c, op2), op1) == 18) {
                    System.out.printf("%d %c %d %c %d = 18\n", a, op1, b, op2, c);
                    solutionFound = true;
                }
                // case 3: a / b * c
                else if ((op1 == '/' && op2 == '*') && applyOperator(applyOperator(a, b, op1), c, op2) == 18) {
                    System.out.printf("%d %c %d %c %d = 18\n", a, op1, b, op2, c);
                    solutionFound = true;
                }
                // case 4: a * b / c
                else if ((op1 == '/' && op2 == '*') && applyOperator(a, applyOperator(b, c, op2), op1) == 18) {
                    System.out.printf("%d %c %d %c %d = 18\n", a, op1, b, op2, c);
                    solutionFound = true;
                }
                // case 5: a / (b / c)
                else if ((op1 == '/' && op2 == '/') && applyOperator(a, applyOperator(b, c, op2), op1) == 18) {
                    System.out.printf("%d %c (%d %c %d) = 18\n", a, op1, b, op2, c); // Parentheses added!
                    solutionFound = true;
                }
                // case 6: (a op1 b) op2 c
                else if (applyOperator(applyOperator(a, b, op1), c, op2) == 18) {
                    if ((op1 == '+' || op1 == '-') && (op2 == '*' || op2 == '/')) {
                        System.out.printf("(%d %c %d) %c %d = 18\n", a, op1, b, op2, c);
                    }else{
                        System.out.printf("%d %c %d %c %d = 18\n", a, op1, b, op2, c);
                    }
                    solutionFound = true;
                }
                // case 7: a op1 (b op2 c)
                else if (applyOperator(a, applyOperator(b, c, op2), op1) == 18) {
                    if ((op2 == '+' || op2 == '-') && (op1 == '*' || op1 == '/')) {
                        System.out.printf("%d %c (%d %c %d) = 18\n", a, op1, b, op2, c);
                    }else{
                        System.out.printf("%d %c %d %c %d = 18\n", a, op1, b, op2, c);
                    }
                    solutionFound = true;
                }
            }
        }
        
        if (!solutionFound) {
            System.out.println("No Solution");
        }
        
        sc.close();
    }
   
    public static double applyOperator(double a, double b, char op){
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return b != 0 ? a / b : 0;
            default: return 0; // invalid case
        }
    }
}
