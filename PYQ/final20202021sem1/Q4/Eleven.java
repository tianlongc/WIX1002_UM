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

public abstract class Eleven {
    protected int[] array;
    protected String fileName;
    
    public Eleven(String fileName){
        this.fileName = fileName;
        try{
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
            
            int size = 0;
            try{
                // Obtain the size of the array
                while (true) {
                    inputStream.readInt();
                    size++;
                }
            }catch(EOFException e){}
            
            // re-read the file
            inputStream = new ObjectInputStream(new FileInputStream(fileName));
            // initialize array with the size obtained
            this.array = new int[size];
            
            int index = 0;
            try{
                while (true) {
                    array[index] = inputStream.readInt();
                    index++;
                }
            }catch(EOFException e){}
            
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    
    public abstract String divide();
}
