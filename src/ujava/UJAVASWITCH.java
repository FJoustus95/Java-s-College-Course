
package ujava;

import java.util.*;

public class UJAVASWITCH {
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        
        System.out.println("Write the number between 1-4 ");
        int number = read.nextInt();
        
       
        System.out.println();
        
        
        String textNumber = "Unknown Number";
        switch(number){
            case 1:
                textNumber = "Number one";
                break;
              
            case 2:
                textNumber = "Number two";
                break;
            
            case 3:  
                textNumber = "Number three";
                break;
                
            case 4:
                textNumber = "Number four";
                break;
                
            default:
                textNumber = "unknown Number";
                break;
                
                
        }
              System.out.println("The number wrote was: " +  textNumber);  
    }
}
