
package main.java.com.mycompany.examples.SalesSystem;
import java.util.Scanner;
import java.util.Date;


public class Product {

    
    private Scanner read = new Scanner(System.in);
    
    public String name;
    public int idProduct;
    public double price;
    public static int productCount;
    
    Product(){
        
    }
    Product(String name, double price){
        this.name = read.nextLine();
        this.price = read.nextDouble();
        idProduct = Product.productCount++;
        this.CurrentDate();
        
        
    }

    
    
    public String CurrentDate(){
        Date date = new Date();
        System.out.println(date);
        
        return null;
            
    }

    public Scanner getRead() {
        return read;
    }

    public void setRead(Scanner read) {
        this.read = read;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
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
        sb.append(", toda´s date= ").append(this.CurrentDate()); 
        sb.append('}');
        return sb.toString();
    }
    
     
}
