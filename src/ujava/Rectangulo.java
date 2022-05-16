
package UJAVA;

import java.util.Scanner;

public class Rectangulo {
    
    static int rectanglesArea(int weight, int height) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Write the weight of the rectangle");
        weight = read.nextInt();
        
        System.out.println();
        
        System.out.println("Write the height of the rectangle");
        height = read.nextInt();
        
        System.out.println();
        
        System.out.println("The area of the rectangle is:\n ");
       
        return (weight * height);
        
        
    }
    static int rectanglesPerimeter(int weight, int height) {
        Scanner read = new Scanner(System.in);
        
        System.out.println("Write the weight of the rectangle");
        weight = read.nextInt();
        
        System.out.println();
        
        System.out.println("Write the height of the rectangle");
        height = read.nextInt();
        
        System.out.println();
    
        return ((weight + height)*2);
        
    }
    
    public static void main (String [] args) {
        
        printTitle("Rectangle´s area and perimeter");
        
        System.out.println();
        
        int int_rectanglesArea = rectanglesArea(0,0);
        System.out.println("The area of the rectangle is: " + int_rectanglesArea);
        
        System.out.println();
        
        int int_rectanglesPerimeter = rectanglesPerimeter(0,0);
        System.out.println("The perimeter of the rectangle is: " + int_rectanglesPerimeter );
    }
    
    static String printSeparator(int n){
        for (int i = 0; i < n ; i++) 
            System.out.print("-");
        
        System.out.println();
        return null;
           
    }
    static String printTitle(String titulo){
        printSeparator(30);
        System.out.println(titulo);
        printSeparator(30);
        return null;
       
    }
}


