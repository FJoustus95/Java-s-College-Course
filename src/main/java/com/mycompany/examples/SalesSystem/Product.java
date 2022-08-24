
package main.java.com.mycompany.examples.SalesSystem;
import java.util.Scanner;
import java.util.Date;


public class Product {

    
    Scanner read = new Scanner(System.in);
    
    protected String name;
    protected final int idProduct;
    protected double price;
    protected static int productCount;
    
    Product(){
        this.idProduct = Product.productCount++;
        
        
    }
    Product(String name, double price){
        this();
        this.name = name;
        this.price = price;
        
        
        
        
    }

    
    
    public void CurrentDate(){
        Date date = new Date();
        System.out.println(date);
        
        
            
    }

    
  

    public int getIdProduct() {
        return idProduct;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public static int getProductCount() {
        return productCount;
    }

    public static void setProductCount(int aProductCount) {
        productCount = aProductCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(", idProduct=").append(idProduct);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price); 
        sb.append('}');
        return sb.toString();
    }
    
     
}
