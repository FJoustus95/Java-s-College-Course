
package main.java.com.mycompany.examples.methodsOvercharge;

import javax.swing.*;


public class TestOperations {
    
    
    public static void main(String[] args) {
        
        
        // It´s possible initialize each method using Instantation but in this case
        // all the methods are statics so we can call them at once
        
        MethodsOvercharge method1 = new MethodsOvercharge();
        
        int result = MethodsOvercharge.threeNumbersSum(0, 0, 0);
        JOptionPane.showMessageDialog(null, "the result is : " + result, "three numbers sum ", 1);
        
        //calling the other method named with the same name xd
        
        double result2 = MethodsOvercharge.threeNumbersSum(0, 0, 0);
        JOptionPane.showMessageDialog(null, "the result is : " + result2, "three numbers sum " ,1);
             
        // this is well-known as methods Overcharge
        
        
    }
}
