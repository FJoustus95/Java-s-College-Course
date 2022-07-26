
package main.java.com.mycompany.examples.SalesSystem;
import main.java.com.mycompany.examples.SalesSystem.Product;
import java.util.*;


public class Order extends Product{
    
       Scanner read = new Scanner(System.in);
        
    
    int size;
    String things;
    Product person1 [] = new Product[size];
    int total = 0;
    int idOrder;
    static int ordenCount;
    static int maxProduct = 10;
    
    public Order (String name, double price){
        super (name, price);
         
        
        
    }
    public void addProduct(Product product){
       
        
        System.out.println("Welcome to the grocery store");
        System.out.println();
        
        System.out.println("Choose how many products would you like to buy???");
        System.out.println("with 10th products are the max!!!!!!");
        
        size = read.nextInt();
        
         if (size <= maxProduct) {
        
        System.out.println("Choose what products would you like to buy !!!!!");
        
        System.out.println();
        
        for (int i = 0; i <= size; i++) {
         
          person1[i] = new Product(name,price);
          
        
           
           
              
                  
            }
                 
          } 
           
         else 
                   
        System.out.println("The wrote amount weren´t correct");
        System.exit(0);          
        }
    
        
     
    }
    /*public double calculeTotal(){
        double total;
        
        for (int i = 0; i < person1.length; i++) {
            
        }
      return null;
      
    }
    public void showOrder(){ 
        
        
    }*/

