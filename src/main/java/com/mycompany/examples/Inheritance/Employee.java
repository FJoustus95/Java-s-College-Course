
package main.java.com.mycompany.examples.Inheritance;

import java.util.*;


public class Employee extends Person {
    
    private int employeeID;
    private double salary;
    private static int employeeCount;
    
    Scanner read = new Scanner(System.in);
    

    public Employee(String name, String surname, double salary) {
        super(name, surname);
        this.employeeID = Employee.employeeCount++;
        this.salary = read.nextDouble();
        
    }

    public int getEmployeeID() {
        return employeeID;
        
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("{ Employee´s number : " ).append(this.employeeID);
        sb.append("\nEmployees´s salary : " ).append(this.salary);
        sb.append("\nEmployee´s name : ").append(this.name);
        sb.append("\nEmployee´s surname : ").append(this.surname);
        sb.append(" } ");
        return sb.toString();
        
        
        
        
        
        
        
        
    }
    
}
