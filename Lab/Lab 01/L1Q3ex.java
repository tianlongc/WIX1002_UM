/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package l1q3;

/**
 *
 * @author tianlongc
 */
public class L1Q3ex {
    public static void main(String[] args) {
        // Calling methods to print each shape
        printSquare(); // Prints a square shape made of asterisks
        System.out.println(""); // Adds a blank line for better spacing between shapes
        printOval();
        System.out.println(""); // Adds a blank line for better spacing between shapes
        printArrow();
        System.out.println(""); // Adds a blank line for better spacing between shapes
        printDiamond();
    }
    
    // Method to print a square pattern of asterisks
    private static void printSquare() {
        // Question: Why are we using two loops here?
        // Answer: The outer loop controls the rows and the inner loop controls the column
        // Together, they create a 7x7 grid, where we can decide where to place '*'.
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                // Question: What does the condition (i == 0)
                // Answer: It checks if the current position
                // - 'i == 0' means the top row
                // - 'i == 6' means the bottom row
                // - 'j == 0' means the leftmost column
                // - 'j == 6' means the rightmost cloumn
                if (i == 0 || i == 6 || j == 0 || j == 6) {
                    System.out.print("*");    
                }else{
                    // Question: Why do we print a space here?
                    // Answer: If the position is not on the border, we print a space to make the center hollow.
                    System.out.print(" ");

                }
            }
            // Move to the next line after printing each row
            System.out.println("");
        }
    }
    
    // Method to print an oval shape using asterisks
    private static void printOval(){
        // Loop to iterate through 7 rows (height of the oval)
        for (int i = 0; i < 7; i++) {
            // Loop to iterate through 7 columns (width of the oval)
            for (int j = 0; j < 7; j++) {
                // Question: How does this condition create an oval shape?
                // Answer: We print '*' only at certain positions to create a rounded look:
                // - Top and bottom rows (i == 0, i == 6) print '*' only between columns 2 and 4.
                // - Rows just below/above the top/bottom (i == 1, i == 5) print '*' at columns 1 and 5
                // - Middle rows (i from 2 to 4) print '*' at columns 0 and 6.
                if ((i == 0 || i == 6) && (j > 1 && j < 5) ||
                    (i == 1 || i == 5) && (j == 1 || j == 5) ||
                    (i > 1 && i < 5) && (j == 0 || j == 6)){
                    System.out.print("*");
                }else{
                    // Question: Why print spaces instead of asterisks here?
                    // Answer: By printing spaces at position where '*' is not needed, we create the hollow parts
                    // of the oval, giving it a rounded appearance.
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing each row to align the next row properly.
            System.out.println("");
        }
    }
    
    // Method to print an arrow shape using asterisks
    private static void printArrow(){
        // Loop to iterate through 7 rows (height of the arrow)
        for (int i = 0; i < 7; i++) {
            // Loop to iterate through 7 columns (width of the arrow)
            for (int j = 0; j < 7; j++) {
                // Question: How do we decide where to place the asterisks for the arrow?
                // Answer: The conditions place '*' at specific positions:
                // - The tip of the arrow is at the center of the first row (i == 0. j == 3).
                // - The next row has two '*' on either side of the tip (i == 1, j == 2 and j == 4).
                // - The third row has '*' even wider (i == 2, j == 1 and j == 5).
                // - The vertical line of the arrow is drawn from the fourth row onwards (i > 2, j ==3).
                if ((i == 0 && j == 3) ||
                        (i == 1 && (j == 2 || j == 3 || j == 4)) ||
                        (i == 2 && (j == 1 || j == 2 || j == 3 || j == 4 || j == 5)) ||
                        (i > 2 && j == 3)) {
                    System.out.print("*");
                } else {
                    // Question: Why do we print spaces here?
                    // Answer: Spaces are used to fill in the areas around the arrow, so that only the shape of the
                    // arrow is visible against a blank background.
                    System.out.print(" ");
                }
            } 
            // Move to the next line after printing each row to align the next row properly.
            System.out.println("");
        }
    }
    
    // Method to print a diamond shape using asterisks
    private static void printDiamond(){
        // Loop to iterate through 7 rows (height of the diamond)
        for (int i = 0; i < 7; i++) {
            // Loop to iterate through 7 columns (width of the arrow)
            for (int j = 0; j < 7; j++) {
                // Question: How do these conditions form a diamond shape?
                // Answer: The conditions determine where to place '*' so that the shape looks like a diamond:
                // - Top-left diagonal (i + j == 3) and top-right diagonal (j - i == 3) form the top half.
                // - Bottom-left diagonal (i - j == 3) and bottom-right diagonal (i + j == 9) form the bottom half
                // Together, they create the shape of a diamond.
                if ((i + j == 3) || 
                        (j - i == 3) ||
                        (i - j == 3) ||
                        (i + j == 9)){
                    System.out.print("*");
                }else{
                    // Question: Why do we need spaces here?
                    // Answer: By printing spaces where '*' is not placed, the shape of the diamond becomes visisble.
                    // The spaces create the empty areas, making the diamond shape stand out.
                    System.out.print(" ");
                }
                
            }
            // Move to the next line after printing each row, so the next row is aligned properly.
            System.out.println("");
            
        }
        
    }
}

