package main.java.com.mycompany.examples.enum1.test;

import javax.swing.JOptionPane;
import main.java.com.mycompany.examples.enum1.Days;

public class TestEnum {
    public static void main (String[] args){
    indicateTheDayOfTheWeek(Days.MONDAY); 
        
    }
    public  static void indicateTheDayOfTheWeek(Days days){
        JOptionPane.showMessageDialog(null, "What day is it???", "Days System using enums",1);
        int option = Integer.parseInt(JOptionPane.showInputDialog
        ("type a number", "Days System using enums"),1);
        
        switch(days){
            case MONDAY:
                JOptionPane.showMessageDialog(null, "This is the first day of the week","Days System",1);
                break;
                
            
        }
        
    }
}
