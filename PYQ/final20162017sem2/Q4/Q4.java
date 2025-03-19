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
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Q4.dat"));
            
            try{
                while (true) {
                    // Each record contains q m y in order so,
                    int q = inputStream.readInt();
                    int m = inputStream.readInt();
                    int y = inputStream.readInt();
                    
                    DayOfTheWeek dow = new DayOfTheWeek(q,m,y);
                    dow.displayDayOfTheWeek();
                }
            }catch(EOFException e){}
            
            inputStream.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found: " + e.getMessage());
        }catch(IOException e){
            System.out.println("Problem with file input: " + e.getMessage());
        }
    }
}
