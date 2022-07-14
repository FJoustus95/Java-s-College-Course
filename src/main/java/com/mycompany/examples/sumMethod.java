
package main.java.com.mycompany.examples;

import java.util.*;
import javax.swing.*;


public class sumMethod {
    int x;
    int y;
    int z;
    int result;
    int sumresult;
    int sumWithArguments;
    
   //a symple method of two sum numbers 
    
   public void sumMethod() {
       x = Integer.parseInt(JOptionPane.showInputDialog(null, "Write the first number", "Sum", 3));
       y = Integer.parseInt(JOptionPane.showInputDialog(null, "Write the second number", "Sum", 3));
       
       result = (x + y);
       
       JOptionPane.showMessageDialog(null, "The sum is: " + result,"results",1);
       
       
       
   }
   // a method with return values
   
   public int returnSumMethod(){
       x = Integer.parseInt(JOptionPane.showInputDialog(null, "Write the first number with return", "Sum", 3));
       y = Integer.parseInt(JOptionPane.showInputDialog(null, "Write the secod number with return", "Sum", 3));
       z = Integer.parseInt(JOptionPane.showInputDialog(null, "Write the third number with return", "Sum", 3));
  
       
       return sumresult = (x + y+ z);
       
       
       
   }
   //a method with return values and parameters
   
   public int returnSumMethodWithArguments(int x, int y, int z){
       x = Integer.parseInt(JOptionPane.showInputDialog(null, "Write the first number with return", "Sum with arguments", 3));
       y = Integer.parseInt(JOptionPane.showInputDialog(null, "Write the secod number with return", "Sum with arguments", 3));
       z = Integer.parseInt(JOptionPane.showInputDialog(null, "Write the third number with return", "Sum with arguments", 3));
  
       return sumWithArguments = (x + y + z);
       
       
   }
    //main method
    
    public static void main(String[] args) {
        
         //Instance of a java class
         
         sumMethod method1 = new sumMethod();
         
         //call the symple method in its original form
         
         method1.sumMethod();
         
         JOptionPane.showMessageDialog(null, "Changing x and y numbers");
         
         //changing the entrance values since the main method
         
         method1.x = Integer.parseInt(JOptionPane.showInputDialog(null, "Write the new first number", "Sum again",1));
         method1.y = Integer.parseInt(JOptionPane.showInputDialog(null, "write the new second number", "Sum again", 1));
         
         int newResult = method1.x + method1.y;
         
         JOptionPane.showMessageDialog(null, "The new result is: " + newResult );
         
         //calling the method with return values
         
         JOptionPane.showMessageDialog(null, "it has created a return sum method");
         
         int returnresult = method1.returnSumMethod();
         JOptionPane.showMessageDialog(null, "the result of three numbers is :" + returnresult);
         
         //calling the method with return values and parameters
         
         JOptionPane.showMessageDialog(null, "Changing x, y Y z with arguments");
         int resultwithParameters = method1.returnSumMethodWithArguments(0, 0, 0);
         
         JOptionPane.showMessageDialog(null, "the result with parameters is : " + resultwithParameters);
                 
         
    }
   
   
}
