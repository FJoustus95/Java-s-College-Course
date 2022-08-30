
package main.java.com.mycompany.examples.pc_world.principalMethod;
import java.util.*;
import main.java.com.mycompany.examples.pc_world.order.OrderPC;
import javax.swing.JOptionPane;

public class ComputerSystem {
    
    Scanner read = new Scanner(System.in);
    
    
    public void principalMenu(){
        boolean leave = false;
        int option;
        
        OrderPC order1 = new OrderPC();
        
        while(!leave){
            
            System.out.print("-------------------------------------\n");
            System.out.println("Sales system of a computer store");
            System.out.print("-------------------------------------");
            
            System.out.println();
            
            System.out.println("1) Add new computers");
            System.out.println("2) Show order");
            System.out.println("3) System EXIT");
            
            try{
                System.out.println();
                System.out.println("What do you want to do???");
                option = read.nextInt();
                
                System.out.println();
                
                switch(option) {
                    
                    case 1:
                        order1.addComputer(order1);
                        break;
                        
                    case 2:
                        
                        break;
                        
                    case 3:
                        leave = true;
                        System.out.println("you left");
                        JOptionPane.showMessageDialog(null, " Thank you very much for used the computer system", "EXIT",1);
                        
                        break;
                    
                    default:
                        System.out.println("the options are between 1 and 3");
                        break;
                        
                }
               //exception of the principal menu
               
                
            } catch(InputMismatchException e) {
                System.out.println("you can only type numbers");
                leave = !leave;
                
                
                
            }
        }
        leave = !leave;
        
        
    }
    public static void main(String[] args) {
        
        ComputerSystem menu1 = new ComputerSystem();
        menu1.principalMenu();
        
        
    }
}
