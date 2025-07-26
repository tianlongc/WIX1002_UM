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
        final int TARGET = 18;
        boolean solutionFound = false; // flag to track there's solution or not
        
        // Prompt message
        System.out.print("Enter 3 numbers [1-9] : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        for (char op1: operators) {
            for (char op2: operators) {
                // op1 first
                if (compute(compute(a, b, op1), c, op2) == TARGET) {
                    solutionFound = true;
                    if ((op1 == '+' || op1 == '-') && (op2 == '*' || op2 == '/')) {
                        System.out.printf("(%d %c %d) %c %d = %d\n", a, op1, b, op2, c, TARGET);
                    }else{
                        System.out.printf("%d %c %d %c %d = %d\n", a, op1, b, op2, c, TARGET);
                    }
                }
                // op2 first
                if (compute(a, compute(b, c, op2), op1) == TARGET) {
                    solutionFound = true;
                    // `op1 == '/' && op2 == '/'` Handles the edge case where (a / b) / c ≠ a / (b / c)
                    if (((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) || (op1 == '/' && op2 == '/')) {
                        System.out.printf("%d %c (%d %c %d) = %d\n", a, op1, b, op2, c, TARGET);
                    }else{
                        System.out.printf("%d %c %d %c %d = %d\n", a, op1, b, op2, c, TARGET);
                    }
                }
            }
        }
        if (!solutionFound) System.out.println("No Solution");
        
        sc.close();
    }
   
    public static double compute(double a, double b, char op){
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': if (b==0) throw new ArithmeticException("Division by zero");
                            else return a/b;
            default: throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }
}
