
package main.java.com.mycompany.examples.staticTest;
import main.java.com.mycompany.examples.test.staticPerson;



public class TestStaticPerson {
    public static void main (String [] args) {
        
        TittleInformation();
        staticPerson person1 = new staticPerson("", " ");
        
        System.out.println(person1.toString());
        
        //creating another person information using the constructor
        System.out.println();
        
        System.out.println("Write the second person´s information\n");
        
        staticPerson person2 = new staticPerson(" "," ");
        SecondInformation();
        
        System.out.println(person2.toString());
        
        //printed all information without void method, it´s other form to print it
        
        System.out.println("Printing information using the void method");
        
        System.out.println();
        
        
        anotherFormToPrintTittle(person1);
        anotherFormToPrintTittle(person2);
        
        
        
        
        
        
        
        
    }
    public static String TittleInformation(){
        System.out.println(" it´s a simple message with a person Information");
        return null;
        
        
        
    }
    public static String SecondInformation(){
        System.out.println("this is the second person´s information that was created recently!!!!!!!");
        return null;
    }
    
    // void method without using return
    
    public static void anotherFormToPrintTittle(staticPerson person){
        System.out.println("person = " + person);
        
        
    }
    // static method to despcribe all customer information
    
    public static String CustomerInformation(){
        System.out.println("This is customer´s information about the inscription!!");
        return null;
        
    }
}
