/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package V3Q6;

/**
 *
 * @author tianlongc
 */
import java.util.List;
import java.util.ArrayList;

public class Inventory {
    private List<Product> productStock;
    
    public Inventory(){
        this.productStock = new ArrayList<>();
    }
    
    public void addProduct(Product product, int qty){
        productStock.add(product);
        product.setStock(qty);
    }
    
    public boolean isAvailable(Product product, int qty){
        return product.getStock() >= qty;
    }
    
    public void updateStock(Product product, int qty){
        product.reduceStock(qty);
    }
}
