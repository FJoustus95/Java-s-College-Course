
package main.java.com.mycompany.examples.SalesSystem;
import main.java.com.mycompany.examples.SalesSystem.Product;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Date;





public class Order extends Product{
    
        
    Date date = new Date();
    Product person1[];
    protected double total = 0;
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
        
        int size = read.nextInt();
        person1 = new Product[size];
        
        
         if (size <= maxProduct) {
        
        System.out.println("Choose what products would you like to buy !!!!!");
        
        System.out.println();
        
        for (int i = 0; i < size; i++) {
         
            System.out.println(size);
            
            
            System.out.println("Type the products´ name " + (i+1));
            String name = new Scanner(System.in).nextLine();
            
            
            System.out.println("Type the products´ price " + (i+1));
            double price = new Scanner(System.in).nextDouble();
        
            person1[i] = new Product(name,price);
          
               
                
                
          
                  
            }
                // Trying to use a arraylist method to convert the a dynamic variable(int size) 
                
                System.out.println(Arrays.toString(person1));
                //ArrayList<Product> mylist =  new ArrayList <Product>(Arrays.asList(person1));
                
        
            //calculeTotal();
            
             System.out.println("\n");
             
            
             
          } 
           
         else {
                   
        System.out.println("The wrote amount weren´t correct");
        read.nextInt();
         }
        
        }

    public Product[] getPerson1() {
        return person1;
    }

    public void setPerson1(Product[] person1) {
        this.person1 = person1;
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
        sb.append(" idProduct = ").append(super.idProduct);
        sb.append(" name = ").append(super.name);
        sb.append(" price = ").append(super.price); 
        sb.append("total = ").append(total);
        sb.append("date = ").append(date);
        sb.append('}');
        return sb.toString();
    }
    
    
 }
