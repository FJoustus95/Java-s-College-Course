
package main.java.com.mycompany.examples;


public class contadorDoWhile {
    public static void main(String[] args) {
        
        int contador = 0;
        do{
            System.out.println("contador " + (contador+1) );
            contador++;
            
        }while(contador < 3);
    }
}

//Note: if the do while cycle isn´t true, the cycle will only
//run once otherwise it´ll work normally