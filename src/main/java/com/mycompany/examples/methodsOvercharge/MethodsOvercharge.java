
package main.java.com.mycompany.examples.methodsOvercharge;

import java.lang.Math;
import java.util.*;

public class MethodsOvercharge {
    
   
    
    public static int threeNumbersSum(int a, int b, int c){
       
        
        
        System.out.println("three numbers sum");
        System.out.println();
        
        System.out.println("they´re creating by themselves using a random library");
      
        Random random = new Random();
        a = random.nextInt();
        
        b = random.nextInt();
        
        c = random.nextInt();
        
        StringBuilder sb = new StringBuilder();
        sb.append("\nShowing all the numbers created using random");
        sb.append("\nthe first number is : " ).append(a);
        sb.append("\nthe second number is : " ).append(b);
        sb.append("\nthe third number is : " ).append(c);
        sb.append("\nthe result is : " ).append( a + b + c);
        
                
        sb.toString();
        
        System.out.println(sb.toString());
        
        
        return ( a + b + c );
               
    }
    
    public static Double threeNumbersSum(double a, double b, double c){
        
        System.out.println("three numbers sum");
        System.out.println();
        
        System.out.println("they´re creating by themselves using a random library");
        
        a = Math.random();
        
        b = Math.random();
        
        c = Math.random();
        
        StringBuilder sb = new StringBuilder();
        sb.append("\nShowing all the numbers created using random");
        sb.append("\nthe first number is : " ).append(a);
        sb.append("\nthe second number is : " ).append(b);
        sb.append("\nthe third number is : " ).append(c);
        sb.append("\nthe result is : " ).append( a + b + c);
                
        sb.toString();
        
        System.out.println(sb.toString());
        
        return ( a + b + c );
        
    } 
}
