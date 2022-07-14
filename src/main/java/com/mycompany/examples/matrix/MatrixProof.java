
package main.java.com.mycompany.examples.matrix;
import java.util.*;
import javax.swing.*;
import main.java.com.mycompany.examples.matrix.PersonMatrix;

        
public class MatrixProof {
    public static void main(String [] args) {
        Scanner read = new Scanner(System.in);
        
            
         int ages[][] = new int [2][2];
         
         ages[0][0] = read.nextInt();
         ages[0][1] = read.nextInt();
         ages[1][0] = read.nextInt();
         ages[1][1] = read.nextInt();
        
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < ages.length; j++) {
                
                System.out.println("ages : " + i + " - " + j + " = " +  ages[i][j]);
            }
        }
 
        //another form to write the matrix but with fruits using Scanner Library
        
        JOptionPane.showMessageDialog(null, "Write 6 kinds of fruits","fruits",1);
        System.out.println();
        
        String fruits[][] = {{read.nextLine(),read.nextLine()},
                             {read.nextLine(),read.nextLine()},
                             {read.nextLine(),read.nextLine()}};
        
        
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < fruits[i].length; j++) {
                
                System.out.println("fruits : " + i + " - " + j + " = " +  fruits[i][j]);
                
            }
            
        }
        
        //matrix using instantation of another class (Person) 
        
        PersonMatrix person1[][] = new PersonMatrix[1][1];
        
        System.out.println("Write four person´s  name of friends");
        
        person1 [0][0] = new PersonMatrix (read.nextLine());
        person1 [0][1] = new PersonMatrix (read.nextLine());
        person1 [1][0] = new PersonMatrix (read.nextLine());
        person1 [1][1] = new PersonMatrix (read.nextLine());
        
        for (int i = 0; i < person1.length; i++) {
            for (int j = 0; j < person1[i].length; j++) {
                
                System.out.println("person´s name: " + i + " - " + j + " = " +  person1[i][j]);
              
        //printing with another form but using a static method special for matrix        
                
                printValues(person1);
                
                
                
            
                }
           }
        
      }    
    
     public static void printValues(Object matrix[][]){
         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix[i].length; j++) {
                 
                 JOptionPane.showMessageDialog(null, "matrix: " + i + " - " + j + " = " + matrix[i][j]);
                 
             }
         }
    }
    
}
    


