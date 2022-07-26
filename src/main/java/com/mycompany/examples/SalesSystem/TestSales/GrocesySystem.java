
package main.java.com.mycompany.examples.SalesSystem.TestSales;
import main.java.com.mycompany.examples.SalesSystem.*;
import java.util.*;



public class GrocesySystem {
    
    Scanner read = new Scanner(System.in);
       
      
       boolean leave = false;
                  
       public void principalMenu(){
       
       leave = false;
       int option;
       
       
       while (!leave) {
           System.out.print("----------------------------------\n");
           System.out.println(" Sales System of a grocery store");   
           System.out.print("----------------------------------");
           
           System.out.println();
                
          
           System.out.println("1) Add a Product");
           System.out.println("2) Calcule total");
           System.out.println("3) Show Order");
           System.out.println("4) System EXIT");
           
           try{
               
               System.out.println(); 
               System.out.println("what do you want to do???");
               option = read.nextInt();
               
               System.out.println();
               
               switch(option) {
                   
                   case 1:
                      Order order1 = new Order("", 0 );
                      order1.addProduct(order1); 
                      break;
                      
                   case 2:
                       
                       break;
                       
                   case 3:
                       
                       break;
                       
                   case 4:
                       leave = true;
                       System.out.println("you leave it");
                       
                       break;
                       
                   default:
                       System.out.println("the options are between 1 to 4!!!");
                       break;
                       
               }
               //exception funtion of the menu
           
           
           } catch (InputMismatchException e){
               System.out.println("you can only type numbers!!!!");
               read.nextInt();
               
           }
           
         }
       
       }
    public static void main(String[] args) {
     
       GrocesySystem grosery1 = new GrocesySystem();
       grosery1.principalMenu();
               
           }
           
         }  
          
    
