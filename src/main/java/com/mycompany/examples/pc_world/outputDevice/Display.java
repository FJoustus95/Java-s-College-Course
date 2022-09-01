
package main.java.com.mycompany.examples.pc_world.outputDevice;
import main.java.com.mycompany.examples.pc_world.*;
import java.util.*;


public class Display {
 private int displayID;
 private String trademarkDisplay;
 private double size;
 private int displayCount;
 
    protected Display(){
    this.displayID = displayCount++;      
 }
    public Display(String trademark, double size){
        this();
        
        System.out.println("types the computer´s display");
        System.out.println();
        this.trademarkDisplay = new Scanner(System.in).nextLine();
        
        System.out.println("\n");
        System.out.println("types the display´s size");
        System.out.println();
        this.size = new Scanner(System.in).nextDouble();
        
        
    }

    public int getDisplayID() {
        return displayID;
    }

    public void setDisplayID(int displayID) {
        this.displayID = displayID;
    }

    public String getTrademarkDisplay() {
        return trademarkDisplay;
    }

    public void setTrademarkDisplay(String trademarkDisplay) {
        this.trademarkDisplay = trademarkDisplay;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getDisplayCount() {
        return displayCount;
    }

    public void setDisplayCount(int displayCount) {
        this.displayCount = displayCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nDisplay{");
        sb.append("\ntrademarkDisplay=").append(trademarkDisplay);
        sb.append("\nsize=").append(size);
        return sb.toString();
    }
 
}
