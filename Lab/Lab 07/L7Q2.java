/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author tianlongc
 */
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.net.URLConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class L7Q2 {
    public static void main(String[] args) {
        
        try {
            URL u = new URL("https://fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            
            PrintWriter outputStream = new PrintWriter (new FileOutputStream("index.htm"));
            
            while (in.hasNextLine()){
                outputStream.println(in.nextLine());
            }
            
            stream.close();
            outputStream.close();
        }
        catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }
    }
}
