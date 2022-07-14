
package main.java.com.mycompany.examples;


public class contadorBreakAndContinue {
    public static void main(String[] args) {
        
        
        
        /*for (  var contador = 0; contador < 10; contador++) {
          if (contador % 2 == 0) {
            
            System.out.println(contador);
             
        }
        
        }/*/
       
       
        for (int contador = 0; contador < 10; contador++) {
            if (contador % 2 != 0){
            continue; // go to next iteration
            
        }
            System.out.println(contador);
        }
        
    }
}
