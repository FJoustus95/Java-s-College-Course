
package main.java.com.mycompany.examples.matrix;

import main.java.com.mycompany.examples.arrays.*;
import main.java.com.mycompany.examples.arrays.PersonArrays;
import java.util.*;


public class ObjectTestMatrix {
    public static void main(String[] args) {
    
    Scanner read = new Scanner(System.in);
    
        
    PersonArrays  person1[] = new PersonArrays[5];
    
        System.out.println("Write five person´s name here");
    
    person1[0] = new PersonArrays(read.nextLine());
    person1[1] = new PersonArrays(read.nextLine());
    person1[2] = new PersonArrays(read.nextLine());
    person1[3] = new PersonArrays(read.nextLine());
    person1[4] = new PersonArrays(read.nextLine());
    
    
        for (int i = 0; i < person1.length ; i++) {
            
            System.out.println("person " + (i + 1) + " : " + person1[i]);
            
        }
    
    
    }
}
