
package main.java.com.mycompany.examples.test;

import main.java.com.mycompany.examples.Encapsulation.*;
import java.util.*;

public class TestPerson {
    public static void main(String[] args) {
      
        Scanner read = new Scanner(System.in);
        
        
        //show the original information about a person
        
        System.out.println("This is your personal information using a constructor \n, packages and another clases");
        
        System.out.println();
        
        Encapsulation encap1 = new Encapsulation("Carlos", "Santiago", 12000,false);
        
        System.out.println("The person name is: " + encap1.getName() + "\nsurname is :" + encap1.getSurname() +
                "\nthe salary is " + encap1.getSalary() + "\nis eliminated???: "+ encap1.isEliminated());
        
        System.out.println();
        
        
        //let´s going to modify all information using Scanner library
        
        System.out.println("Let´s going to override the current personal information");
        System.out.println("Write a name");
        encap1.setName(read.nextLine());
        
        System.out.println("Write a surname");
        encap1.setSurname(read.nextLine());
        
        System.out.println("Write the person´s salary");
        encap1.setSalary(read.nextDouble());
        
        System.out.println("Is the person fired off???");
        encap1.setEliminated(true);
        
        //now it´ll show the current  personal information
        
        System.out.println();
        
        System.out.println("The person name is: " + encap1.getName() + "\nsurname is :" + encap1.getSurname() +
                "\nthe salary is " + encap1.getSalary() + "\nis the person fired off???: "+ encap1.isEliminated());
        
        
        //calling toString method( it´s other form to show it)
        
        System.out.println();
        
        System.out.println("Using the toString method to show all current personal information\n");
        
        System.out.println(encap1.toString());
        
        
    }
}
