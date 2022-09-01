
package main.java.com.mycompany.examples.pc_world;
import main.java.com.mycompany.examples.pc_world.*;


public class Mouse extends InputDevice {
    
    private  int mouseID;
    private  static int mouseCount;
    
       
           
       public Mouse(String inputType, String trademark){
        super("", "");
        this.mouseID = Mouse.mouseCount++;
        
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nMouse{");
        sb.append("\nmouseID =").append(this.mouseID);
        sb.append("\n"+super.toString());
        sb.append('}');
        return sb.toString();
    }
       
       
}

