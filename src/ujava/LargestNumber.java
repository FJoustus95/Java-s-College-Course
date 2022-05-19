
package ujava;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {
    
    Scanner read = new Scanner(System.in);
    int [] arrayNumbers = new int [4];
    
    public  int  mayorNumber(int number1, int number2, int number3, int number4) {
         
        
        System.out.println("The largest number");
        
        System.out.println();
        
        
        System.out.println("Write the first number");
         int num1 = read.nextInt();
         
        System.out.println(); 
         
        System.out.println("Write the second number");
         int num2 = read.nextInt();
         
        System.out.println(); 
         
        System.out.println("Write the third number");
         int num3 = read.nextInt();
         
        System.out.println(); 
        
        System.out.println("Write the fourth number");
         int num4 = read.nextInt();
    
         int [] array = {num1, num2, num3, num4};
    
            for (int i = 0; i < array[4]; i++) {
                System.out.println("The numbers typed are" + array[i+1]);
        }
         return array[4];
        }
    
    public static void main(String [] args) {
        //it follows pending this exercise xD
         int arrayNumber = mayorNumber[arrayNumbers];
        
    }
}
