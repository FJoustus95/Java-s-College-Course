
package main.java.com.mycompany.examples;

import java.util.*;


public class wordThis {
    

    
    public static void main(String[] args) {
      
        System.out.println("Write your name and surname:");
        
     Person person1 = new Person("","");
     
        System.out.println("The person name is :" + person1.name + " \nand its surname is :" + person1.surname);
        
        
     
     
    }
}

class Person {
    String name;
    String surname;
    
        Scanner read = new Scanner(System.in);
    
    Person (String name, String surname){
        
        this.name = read.nextLine();
        this.surname = read.nextLine();
        
        System.out.println(this.name);
        System.out.println(this.surname);
        
        // does reference from the class Print and its print method
        new Print().Print(this);
        
        //old reference ( istantiation )
        //Print print1 = new Print(Object);
        
        
    }
   
        
        
    }
    class Print{
        public void Print(Person person1){
            
            System.out.println(person1);
            System.out.println(this);
            
            
            
        }
        
        
}