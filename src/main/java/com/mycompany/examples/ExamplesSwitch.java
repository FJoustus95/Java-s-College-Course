
package main.java.com.mycompany.examples;

import java.util.*;

public class ExamplesSwitch {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("System weather");
        System.out.println();
        
        System.out.println("Write a number of a month");
        
        
        int numberMonth = read.nextInt();
        String month = " The wrote number isn´t a month";
        
        
        switch(numberMonth) {
            case 1: case 2: case 12:
                month = "The weather is winter";
                break;
                
            case 3: case 4: case 5:
                month = " the weather is spring";
                break;
            
            case 6: case 7: case 8:
                month = " the weather is fall";
                break;
                
            case 9: case 10: case 11:
                month = "the weather is summer";
                break;
                
            default:
                month = "the weather does´t exist ";
                break;
                
            
        }
        
        System.out.println(month);
    }
}
