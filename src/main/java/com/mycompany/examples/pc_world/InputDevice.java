
package main.java.com.mycompany.examples.pc_world;
import java.util.*;


public class InputDevice {
    
    protected String inputType;
    protected String trademark;
    
    public InputDevice(String inputTYpe, String trademark){
        this.inputType = new Scanner(System.in).nextLine();
        this.trademark = new Scanner(System.in).nextLine();
        
      }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InputDevice{");
        sb.append("inputType=").append(inputType);
        sb.append(", trademark=").append(trademark);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
