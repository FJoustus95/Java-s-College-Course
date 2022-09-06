
package main.java.com.mycompany.examples.pc_world.salesSystemPC;
import main.java.com.mycompany.examples.pc_world.*;
import main.java.com.mycompany.examples.pc_world.outputDevice.Display;
import java.util.Scanner;


public class Computers {
   
    
    protected final int computerID;
    protected String name;
    protected Display display;
    protected Keyboard keyboard;
    protected Mouse mouse;
    protected static int computerCount;
    
    public Computers(){
        this.computerID = Computers.computerCount++;
    
  
    }
    public Computers(String name, Display display, Keyboard keyboard, Mouse mouse ){
        this();
        this.name = name;
        this.display = display;
        this.keyboard = keyboard;
        this.mouse = mouse;
        
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nComputers{");
        sb.append("\ncomputerID =").append(computerID);
        sb.append("\nname =").append(name);
        sb.append("\ndisplay =").append(display);
        sb.append("\nkeyboard =").append(keyboard);
        sb.append("\nmouse =").append(mouse);
        sb.append('}');
        return sb.toString();
    }
    
}