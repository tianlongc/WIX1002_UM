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
        
        // Sample input
        /*
        TTATGTTTTAAGGATGGGGCGTTAGTT
        GGTATGATGGGTTGA
        ATGTGA
        ATGTTTGTAA
        TGGATGTATATA
        */
        
        while (true) {
            // Prompt message
            System.out.print("Enter genome string [quit to stop] : ");
            String genome = sc.nextLine().toUpperCase();
            
            if (genome.equalsIgnoreCase("quit")) {
                break;
            }
            
            boolean hasGene = false;
            
            String[] temp = genome.split("ATG");
            for (int i = 0; i < temp.length; i++) {

                if (temp[i].contains("TAA") || temp[i].contains("TGA") || temp[i].contains("TAG")) {
                    String[] genelist = temp[i].split("(TAA|TGA|TAG)");
                    
                    if (genelist.length != 0) {
                        String gene = genelist[0];
                        // gene string is a multiple of 3
                        if ((gene.length() % 3 == 0) && (!gene.contains("ATG"))) {
                            System.out.println(gene);
                            hasGene=true;
                        }
                    }
                }
            }
            if (!hasGene) {
                System.out.println("No gene is found.");
            }
        }  
        sc.close();
    }
}
