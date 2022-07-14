
package main.java.com.mycompany.examples.Inheritance;

import java.util.*;

public class Person {
    
    protected String name;
    protected String surname;
    protected char genre;
    protected int age;
    protected String address;
    
    public Person(){
        
        
    }
    public Person(String name, String surname) {
        this.name = read.nextLine();
        this.surname = read.nextLine();
        
    }
    
    Scanner read = new Scanner(System.in);
    
    
    public Person(String name, String surname, char genre, int age, String address){
       
        this.name = read.nextLine();
        this.surname = read.nextLine();
        this.genre = read.next().charAt(0);
        this.age = read.nextInt();
        this.address = read.nextLine();
        
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

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", surname=" + surname + ", genre=" + genre + ", age=" + age + ", address=" + address + '}';
    }
    
    
}
