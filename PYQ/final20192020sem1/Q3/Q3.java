/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author tianlongc
 */
import java.io.*;

public class Q3 {
    public static void main(String[] args) {
        try{
            BufferedReader inputStream = new BufferedReader(new FileReader("raw.txt"));
            
            int[] numbers;
            int[] count = new int[5]; // 0 is 2, 1 is 4, 2 is 6....
            String line = "";
            while ((line = inputStream.readLine()) != null) {
                String[] lineNumbers = line.split("\\s");
                numbers = new int[lineNumbers.length];
                
                for (int i = 0; i < lineNumbers.length; i++) {
                    numbers[i] = Integer.parseInt(lineNumbers[i]);
                    // e.g. 2 / 2 = 1 then -1 = 0
                    count[numbers[i]/2-1]++;
//                    if (numbers[i] == 2) {
//                        count[0]++;
//                    }else if (numbers[i] == 4){
//                        count[1]++;
//                    }else if (numbers[i] == 6){
//                        count[2]++;
//                    }else if (numbers[i] == 8){
//                        count[3]++;
//                    }else if (numbers[i] == 10){
//                        count[4]++;
//                    }
                }
            }
            
            System.out.println("Frequency Distribution Table");
            int max = 0, mode = 0;
            for (int i = 0; i < count.length; i++) {
                if (count[i] > max) {
                    max = count[i];
                    mode = 2*(i+1);
                }
                System.out.printf("%d : %d\n", 2*(i+1) , count[i]);
            }
            
            System.out.println("The mode of the dataset is : " + mode);
            
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
