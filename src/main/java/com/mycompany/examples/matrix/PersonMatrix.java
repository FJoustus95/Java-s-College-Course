
package main.java.com.mycompany.examples.matrix;
import java.util.*;


public class PersonMatrix {
    
    Scanner read = new Scanner(System.in);
    
    private String name;
    
     public PersonMatrix(String name) {
        this.name = read.nextLine();
    }

    PersonMatrix() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

   
    
}
