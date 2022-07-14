
package main.java.com.mycompany.examples.test;
import java.util.*;


public class staticPerson {

    
    //staticPerson´s variables
            
    private int personID;
    private static int count;
    private String name;
    public String surname;
    
    Scanner read = new Scanner(System.in);
    
    // staticPerson´s contrustor
    
    public staticPerson(String name, String surname){
        this.name = read.nextLine();
        this.surname = read.nextLine();
        
        
        //let´s to increase static variable, doing reference with the class
        
        staticPerson.count++;
        
        //assigning the new value of the static variable
        
        this.personID = staticPerson.count;
          
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
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
    
     public static int getCount() {
        return count;
    }

    public static void setCount(int aCount) {
        count = aCount;
    }

    @Override
    public String toString() {
        return "staticPerson{" + "personID=" + personID + ", name=" + name + ", surname=" + surname + '}';
    }
    
    
}
