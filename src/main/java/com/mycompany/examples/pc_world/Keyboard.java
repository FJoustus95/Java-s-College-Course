
package main.java.com.mycompany.examples.pc_world;
import main.java.com.mycompany.examples.pc_world.*;


public class Keyboard extends InputDevice {
    
    protected int keyboard;
    protected int keyboardCount;
    
     public Keyboard(){
        super(" ", " ");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Keyboard{");
        sb.append("keyboard=").append(keyboard);
        sb.append(", keyboardCount=").append(keyboardCount);
        sb.append('}');
        return sb.toString();
    }
    
    
}
