
package main.java.com.mycompany.examples.arrays;


public class PersonArrays {
    
    private String name;

    public PersonArrays(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
