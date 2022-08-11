
package main.java.com.mycompany.examples.SalesSystem.TestSales;
import main.java.com.mycompany.examples.SalesSystem.*;
import java.util.*;
import javax.swing.JOptionPane;



public class GrocesySystem {
    
    Scanner read = new Scanner(System.in);
       
      
       
                  
       public void principalMenu(){
       
       boolean leave = false;
       int option;
       
       Order order1 = new Order("", 0 );
       
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
                     
                      order1.addProduct(order1); 
                      
                      break;
                      
                   case 2:
                       
                       break;
                       
                   case 3:
                       
                       
                           
                       for (int i = 0; i < order1.getPerson1().length; i++) {
                           if(order1.getPerson1()[i] != null){
                       
                           
                               System.out.println(order1.getPerson1()[i].toString());
                           
                       }
                               
                              
                               
                           }
                     
                       
                       
                       break;
                       
                   case 4:
                       leave = true;
                       System.out.println("you left");
                       JOptionPane.showMessageDialog(null, "Thank you so much for used the grocery System", "Grocery",1);
                       
                       
                       break;
                       
                   default:
                       System.out.println("the options are between 1 to 4!!!");
                       break;
                       
               }
               //exception funtion of the menu
           
           
           } catch (InputMismatchException e){
               System.out.println("you can only type numbers!!!!");
               leave = !leave;
               
           }
           
         }
       leave = !leave;
       
       
       }
    public static void main(String[] args) {
     
       GrocesySystem grosery1 = new GrocesySystem();
       grosery1.principalMenu();
               
           }
           
         }  
          
    
