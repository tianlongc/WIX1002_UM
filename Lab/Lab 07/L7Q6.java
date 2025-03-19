/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author tianlongc
 */
import java.io.*;

public class L7Q6 {
    public static void main(String[] args) {
        try{
            BufferedReader orderFile = new BufferedReader(new FileReader("order.txt"));
            
            // Table header
            System.out.printf("%-17s%-19s%-16s%-20s%s\n","ProductID","ProductName","Quantity","PricePerUnit","Total");            
            
            String productName ="";
            double price = 0.0;
            
            String line = "";
            while ((line = orderFile.readLine()) != null) {
                String order[] = line.split(",");
                String productID = order[1];
                int quantity = Integer.parseInt(order[2]);
                
                /*
                    Why we have to do this? (To reset file input productFile for each order)
                    To start reading from the beginning of the file every time you need to look up a product
                    Reopen productFile for each order lookup.
                    BufferedReader reads sequentially and does not reset automatically.
                    Without reopening, after reading once, the file pointer stays at the end of the text file,
                    making further searches fail.
                */
                BufferedReader productFile = new BufferedReader(new FileReader("product.txt"));
                
                while((line = productFile.readLine()) != null){
                    String product[] = line.split(",");
                        
                    if (order[1].equals(product[0])){
                        productName = product[1];
                        price = Double.parseDouble(product[2]);
                        break; // terminates once the product is found
                    }
                }
                productFile.close();
                System.out.printf("%-10s%-28s%-15s%9s%15.2f\n",productID,productName,quantity,price,(quantity*price));
            }
                
            orderFile.close();
        } catch (FileNotFoundException e){
            System.out.println("File was not found");
        } catch (IOException e){
            System.out.println("Problem with file input");
        }
    }
}
