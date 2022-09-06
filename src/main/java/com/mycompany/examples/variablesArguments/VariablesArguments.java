package main.java.com.mycompany.examples.variablesArguments;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class VariablesArguments {
    public static void main(String[] args) {
        
        //Instanciacing the class and initializing
        VariablesArguments argument1 = new VariablesArguments();
        
        //calling argument varible simple method
        printNumbers(1,2,3,3,3,3,3);
        
        //calling the another simple method with two Arguments
        
        severalParameters("sfadjlkas", 1,1,3,4,5,6,67,98);
        
        
        //calling the other varArgs sum example
        
        System.out.println("Write the sum of two numbers");
        int sum2 = argument1.varArgsSum(new Scanner(System.in).nextInt(), new Scanner(
        System.in).nextInt());
        
        System.out.println("sum2 = " + sum2);
        
        //creating other sum using the same sum method but with different values
        
        System.out.println("Write three numbers");
        int sum3 = argument1.varArgsSum(new Scanner(System.in).nextInt(),new Scanner(System.in).nextInt(),
        new Scanner(System.in).nextInt());
        
        System.out.println("sum3 = " + sum3);
        
        
        
        //calling argument variable using scanner library
        printNumbersUsingScanner(0);
        
        
    }
    
    //simple method defined
    private static void printNumbers(int... numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            
        }  
        
    }
    //simple method using several parameters
    private static void severalParameters(String name, int ... numbers2){
        System.out.println("name = " + name);
        printNumbers(numbers2);
        
    }
    
    
     //Creating another method using Scanner
     // is not working for any reason:c
    private static void printNumbersUsingScanner(int... numbers1){
        
        System.out.println("how many numbers are you writing??");
        JOptionPane.showMessageDialog(null, "10 numbers are the max");
        
        int size = new Scanner(System.in).nextInt();
        int numbers = numbers1[size];
        if(size <= 10){
            
            System.out.println("type your " + size + " numbers" );
           
            for (int i = 0; i < size; i++) {
               
            numbers= new Scanner(System.in).nextInt();
            
            System.out.println("The numbers are: " + numbers);
            
        } 
            
        }
        else{
            System.out.println("the wrote amount weren´t correct");
            System.exit(0);
            

    }
       

}
    //another example using (varargs) sum method....
    public int varArgsSum(int... arguments){
        
        System.out.println("argument length :" + arguments.length);
        int sum = 0;
        for (int x: arguments){
            sum += x;
            
        }
        return sum;
    }
    

}