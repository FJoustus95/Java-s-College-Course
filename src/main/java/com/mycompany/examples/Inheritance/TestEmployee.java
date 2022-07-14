
package main.java.com.mycompany.examples.Inheritance;

import java.util.*;


public class TestEmployee {
    public static void main(String[] args) {
        
        Date date = new Date();
        
        EmployeeTittle();
        Employee emp1 = new Employee(""," ", 0);
        System.out.println(emp1.toString());
        
        
        System.out.println();
        
        //creating another employee with different information
        
        EmployeeTittle();
        Employee emp2 = new Employee("", " ", 0);
        System.out.println(emp2.toString());
        
        //testing the date library
        
        System.out.println(date);
        
        System.out.println();
        
        CustomerTittle();
        Customer cus1 = new Customer(" ", " ",' ', 0," ",0, true);
        System.out.println(cus1.toString());
        
    }
        
        
        
    
    //Creting a static method to initialize each constructor
    
    public static String EmployeeTittle(){
        System.out.println("Write your employee´s information");
         return null;     
    }
    
    public static String CustomerTittle(){
        System.out.println("Write customer´s information");
        return null;
    }
}
