
package main.java.com.mycompany.examples.arrays;

import java.util.*;
import javax.swing.*;

public class ArraysTest {
    public static void main (String [] args) {
        
        Scanner read = new Scanner(System.in);
        
        int age[] = new int[5];
        
        System.out.println(age);
        
        JOptionPane.showMessageDialog(null, "Write a number", "Do you want to write a number??",1);
        
        
        age[0] = read.nextInt();
        
        System.out.println();
        System.out.println(age[0]);
        
        //Using a for cycle to print all values for the array age
        
        for (int i = 0; i < age.length; i++) {
            System.out.println("elements ages " + i + " : " + age[i]);
            
             }
          
        //another form to write an array with several values
        
        JOptionPane.showMessageDialog(null, "write 5 types of fruits", "fruits,",1);
        
        
        String fruit[] = {read.nextLine(), read.nextLine(),read.nextLine(),
            read.nextLine(), read.nextLine()};
        
            for (int j = 0; j <= fruit.length ; j++) {
               
                System.out.println("word " + (j+1) + " : " + fruit[j] );    
            }
        
    }
}
