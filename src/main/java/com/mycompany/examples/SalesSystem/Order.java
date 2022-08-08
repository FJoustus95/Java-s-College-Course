
package main.java.com.mycompany.examples.SalesSystem;
import main.java.com.mycompany.examples.SalesSystem.Product;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Date;





public class Order extends Product{
    
      Date date;
        
    
     int size = 10;
    Product person1[];
    protected double total = 0;
    int idOrder;
    static int ordenCount;
    static int maxProduct = 10;
    
    public Order (String name, double price){
        super (name, price);
        person1 = new Product[size];
        date = new Date();
                
        
    }
    public void addProduct(Product product){
       
        
        System.out.println("Welcome to the grocery store");
        System.out.println();
        
        System.out.println("Choose how many products would you like to buy???");
        System.out.println("with 10th products are the max!!!!!!");
        
        
        
        
         if (size <= maxProduct) {
        
        System.out.println("Choose what products would you like to buy !!!!!");
        
        System.out.println();
        
        for (int i = 0; i < person1.length; i++) {
         
            System.out.println(person1.length);
            
            
            System.out.println("Type the products´ name " + (i));
            String name = new Scanner(System.in).nextLine();
            
            
            System.out.println("Type the products´ price " + (i));
            double price = new Scanner(System.in).nextDouble();
        
          person1[i] = new Product(name,price);
          
          
          
        
           // se mira? 
           // va mira el clavo aqui son 2 cosas
           // ahorita lo ejecuto y te muestro
           
           
              
                  
            }
            calculeTotal();
            
             System.out.println("\n");
             
            
             
          } 
           
         else 
                   
        System.out.println("The wrote amount weren´t correct");
        System.exit(0);          
        }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    
    public void calculeTotal(){
        double total = 0.0;
        
        for (int i  = 0; i < person1.length; i++) {
            total+= person1[i].getPrice();
            
           System.out.println(person1[i].toString());
           
           
        }
        setTotal(total);
        System.out.println("total of the products are = " + this.getTotal());
        
        
        
    }
    
    public void showOrder(){ 
        System.out.println(this.toString());
       
        System.out.println("write any things to leave");
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("total= ").append(total);
        sb.append("date= ").append(date);
        sb.append('}');
        return sb.toString();
    }
    
    
 }
