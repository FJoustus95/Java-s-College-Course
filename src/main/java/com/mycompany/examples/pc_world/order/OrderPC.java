
package main.java.com.mycompany.examples.pc_world.order;
import main.java.com.mycompany.examples.pc_world.outputDevice.Display;
import main.java.com.mycompany.examples.pc_world.salesSystemPC.Computers;
import main.java.com.mycompany.examples.pc_world.*;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Date;



public class OrderPC extends Computers{
    
    Scanner read = new Scanner(System.in);
    Date date = new Date();
    
    protected int idOrder;
    private Computers  computer1[];
    protected static int ordersCount;
    protected int computersCount;
    protected int max_computers = 4;
    
    public OrderPC(){
    this.idOrder = OrderPC.ordersCount++;
          
    }
    // with this method you can add a whole computer to our system
    
    public void addComputer(Computers computers){
        
        System.out.println("Welcome to the computer store");
        System.out.println();
        
        System.out.println("Choose how many computers would you like to buy!!!");
        JOptionPane.showMessageDialog(null, "With fourth computers are the max","WARNING",1);
        
        System.out.println();
        
        
        int computerSize= new Scanner(System.in).nextInt();
        computer1 = new Computers[computerSize];
        
            
        if( computerSize <= max_computers ) {
            
            System.out.println("Choose what computers would you like to bring!!!!");    
            System.out.println();
            
            for (int i = 0; i < computerSize; i++) {
                
                System.out.println(computerSize);
                
                System.out.println("types the computer´s name" + (i+1));
                String name = new Scanner(System.in).nextLine();
                
                System.out.println();
                
                Display display = new Display(" " + (i+1), 0 + (i+1));
                
             
                System.out.println();
                
                Keyboard keyboard = new Keyboard(" ", " ");
                
                System.out.println();
                
                Mouse mouse = new Mouse(""," ");
                
                
                computer1[i] = new Computers(name, display, keyboard, mouse);
            }
            
         
            
            
           
            
        }
        else {
            System.out.println("the amount weren´t correct");
            read.nextInt();
            
            
        }
        
    }

    public Computers[] getComputer1() {
        return computer1;
    }

    public void setComputer1(Computers[] computer1) {
        this.computer1 = computer1;
    }
    
    public void showOrder(){
        System.out.println(this.toString());
        
        JOptionPane.showMessageDialog(null, "Type anything to leave!!!","ORDER INFORMATION",1);
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OrderPC{");
        sb.append("\nidOrder=").append(idOrder);
        sb.append("\ncomputerID=").append(computerID);
        sb.append("\nname=").append(super.name);
        sb.append("\ndisplay=").append(super.display);
        sb.append("\nkeyboard=").append(super.keyboard);
        sb.append("\nmouse=").append(super.mouse);
        sb.append("\ndate=").append(date); 
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
