
package main.java.com.mycompany.examples.pc_world;
import java.util.*;


public class InputDevice {
    
    protected String inputType;
    protected String trademark;
    
    public InputDevice(String inputTYpe, String trademark){
        System.out.println();
        System.out.println("types the computer´s input device");
        this.inputType = new Scanner(System.in).nextLine();
        
        System.out.println("\n");
        System.out.println("types de input device´s trademark");
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
        sb.append("\ninputType =").append(inputType);
        sb.append("\ntrademark =").append(trademark);
        return sb.toString();
    }
    
    
    
}
