
package main.java.com.mycompany.examples.Encapsulation;

import java.util.*;


public class Encapsulation {
    
    Scanner read = new Scanner(System.in);
    
    private String name;
    private String surname;
    private double salary;
    private boolean eliminated;
        
    public Encapsulation(String name, String surname,double salary, boolean eliminated){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.eliminated = eliminated;
        
      }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isEliminated() {
        return eliminated;
    }

    public void setEliminated(boolean eliminated) {
        this.eliminated = eliminated;
    }
    
    //this method is well-known for overwrite all information in once , without write a each get anything etc
    
    @Override
    public String toString(){
        return "person name is :" + this.name + "\nsurname is :" + this.surname +
                "\nsalary is : " + this.salary + "\nis the person fired off???? : " + this.eliminated;
        
        
        
    }
} 
