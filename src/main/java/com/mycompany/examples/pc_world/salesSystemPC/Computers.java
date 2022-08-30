
package main.java.com.mycompany.examples.pc_world.salesSystemPC;
import main.java.com.mycompany.examples.pc_world.*;
import main.java.com.mycompany.examples.pc_world.outputDevice.Display;
import java.util.Scanner;


public class Computers {
    protected int computerID;
    protected String name;
    protected Display display;
    protected Keyboard keyboard;
    protected Mouse mouse;
    
    public Computers(){
    
    
  
    }
    public Computers(String name, Display display, Keyboard keyboard, Mouse mouse ){
        this.name = name;
        this.display = display;
        this.keyboard = keyboard;
        this.mouse = mouse;
        
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computers{");
        sb.append("computerID=").append(computerID);
        sb.append(", name=").append(name);
        sb.append(", display=").append(display);
        sb.append(", keyboard=").append(keyboard);
        sb.append(", mouse=").append(mouse);
        sb.append('}');
        return sb.toString();
    }
    
}