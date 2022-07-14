
package methodsAndAttributes;

import java.util.*;
import javax.swing.*;

public class attributesAndMethods {
    
    Scanner read = new Scanner(System.in);
   
    String name;
    String surname;
    
    public void PersonalInformation(){
    
         name = JOptionPane.showInputDialog(null, "write your name", "Personal Information", 1);
         surname = JOptionPane.showInputDialog(null, "Write your surname", "Personal Information", 1);
         
         JOptionPane.showMessageDialog(null,"your name is: " + name + "\nyour surname is: " + surname,"Personal Information",3);
        
    }        
            
   }
