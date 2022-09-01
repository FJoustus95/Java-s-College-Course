
package main.java.com.mycompany.examples.pc_world;
import main.java.com.mycompany.examples.pc_world.*;


public class Keyboard extends InputDevice {
    
    protected final int keyboardID;
    protected static int keyboardCount;
    
     public Keyboard(String inputType, String trademark){
        super(" ", " ");
        this.keyboardID = Keyboard.keyboardCount++;
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nKeyboard{");
        sb.append("\nkeyboard =").append(this.keyboardID);
        sb.append("\n"+super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
