
package main.java.com.mycompany.examples.SalesSystem.TestSales;
import main.java.com.mycompany.examples.SalesSystem.*;
import java.util.*;



public class GrocesySystem {
    public static void main(String[] args) {
     
       Scanner read = new Scanner(System.in);
       int choice;
      
        
       do{
           System.out.print("----------------------------------\n");
           System.out.println(" Sales System of a grocery store");   
           System.out.print("----------------------------------");
           
           System.out.println();
           
           System.out.println("What do you want to do???");
           
           System.out.println();
           
           System.out.println("1) Add a Product");
           System.out.println("2) Calcule total");
           System.out.println("3) Show Order");
           System.out.println("4) System EXIT");
           
           choice = read.nextInt();
             
       } while (choice < 1 || choice > 4 );
       
         System.out.println("\n");
        
            switch(choice) {
                
                case 1:
                   Order order1 = new Order();
                    order1.addProduct(order1);
                    break;
                    
                case 2:
                    
                    break;
                
                case 3:
                    
                    break;
                    
                default:
                    System.out.println("Thanks for has used the grocery system!");
                    System.exit(0);
                         
            }
       
        
    }
}
