
package main.java.com.mycompany.examples.pc_world;
import main.java.com.mycompany.examples.pc_world.*;


public class Mouse extends InputDevice {
    
    private int mouseID;
    private int mouseCount;
    
       public Mouse(){
        super("", "");
           
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mouse{");
        sb.append("mouseID=").append(mouseID);
        sb.append(", mouseCount=").append(mouseCount);
        sb.append('}');
        return sb.toString();
    }
       
       
}

