
package main.java.com.mycompany.examples;

import java.util.Scanner;


public class PassByReference {
    public static void main(String[] args) {
        
         Scanner read = new Scanner(System.in);
    
        Person person1 = new Person();
        
        System.out.println("Write your name");
        person1.name = read.nextLine();
        
        System.out.println("write your surname");
        person1.surname = read.nextLine();
        
        
        System.out.println("The person information updated is: ");
         person1 = changeValue(person1);
        
        System.out.println(person1);
        
        
   
        
        System.out.println("Write one number");
        
    
  
           
        }
        public static Person changeValue(Person person1) {
            person1.name = "flasjdflk";
            person1.surname = "fdsjakflasj";
            
            
            
            return person1;
            
            
            
            
            
            
            
        
    }
        
            
   }
