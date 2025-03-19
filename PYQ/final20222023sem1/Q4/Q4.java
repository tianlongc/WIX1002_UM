/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author tianlongc
 */
import java.io.*;

public class Q4 {
    public static void main(String[] args) {
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader("nodelist.txt"));
            
            int numNode = 0;
            // Capture the length of the array
            String line="";
            while ((line = inputStream.readLine()) != null){
                if (!line.startsWith("NodeName")) {
                    continue;
                }
                numNode++;
            }

            Node[] node = new Node[numNode];
            // re-read the file
            inputStream = new BufferedReader(new FileReader("nodelist.txt"));
            /*
            Use split(" ") if you specifically want to split on single spaces and handle multiple spaces as separate delimiters.
            Use split("\\s+") if you want to split on any whitespace and ignore multiple spaces.
            */
            int i = 0;
            while ((line = inputStream.readLine()) != null) {
                if (!line.startsWith("NodeName")) {
                    continue;
                }
                
                String[] input = line.split("[=\\s]+");
                String NodeName = input[1];
                
                // Use trim() to cut down unnecessary spacing in front of text starting in 2nd line
                line = inputStream.readLine().trim();
                input = line.split("[=\\s]+");
                
                int CPUAlloc = Integer.parseInt(input[1]);
                int CPUTot = Integer.parseInt(input[3]);
                
                // Skipping useless and unwanted data
                inputStream.readLine();
                inputStream.readLine();
                inputStream.readLine();
                inputStream.readLine();
                inputStream.readLine();
                
                line = inputStream.readLine().trim();
                input = line.split("[=\\s]+");
                int RealMemory = Integer.parseInt(input[1]);
                int AllocMem = Integer.parseInt(input[3]);
                
                inputStream.readLine();
                
                line = inputStream.readLine().trim();
                input = line.split("[=\\s]+");
                String Partitions = input[1];
                
                // Debug purpose
//                System.out.println(NodeName);
//                System.out.println(CPUAlloc);
//                System.out.println(CPUTot);
//                System.out.println(RealMemory);
//                System.out.println(AllocMem);
//                System.out.println(Partitions);
                
                // Create a Node class
                node[i] = new Node(NodeName, CPUTot, CPUAlloc, RealMemory, AllocMem, Partitions);
                i++;
            }
  
            // Table Header (Output formatting)
            System.out.println("+----------------------------------------------------+");
            System.out.printf("| %-8s%-16s%-10s%-11s%s |\n","Node","Partitions","CPU","MEMORY","RATIO");
            System.out.println("+----------------------------------------------------+");
            // Table content
            for (int j = 0; j < node.length; j++) {
                System.out.println(node[j]);
            }
            System.out.println("+----------------------------------------------------+");
            
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
