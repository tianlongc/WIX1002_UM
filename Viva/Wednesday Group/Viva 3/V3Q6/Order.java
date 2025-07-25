/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q6;

/**
 *
 * @author tianlongc
 */
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;
    
    public Order(){
        this.products = new ArrayList<>();
    }
    
    public List<Product> getProducts(){
        return products;
    }
    
    public void addProduct(Product product){
        products.add(product);
    }
    
    public void removeProduct(Product product){
        products.remove(product);
    }
    
    public double calculateTotal(){
        double total = 0.0;
        for (Product product: products) {
            total += product.getPrice();
        }
        return total;
    }
}
