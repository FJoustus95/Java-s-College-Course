
package main.java.com.mycompany.examples;
import java.util.*;


public class NotesSystem {
    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Notes System");
        
        System.out.println();
        
        System.out.println("Write a number for a note");
        
        int notes = read.nextInt();
        String score = "The note does´t exist";
        
        switch(notes) {
            case 1: case 2: case 3: case 4: case 5:
                score = "The note is zero, reprobate!";
                break;
                
            case 6:    
                score = "the note is E, is not good";
                break;
            
            case 7:
                score = "the note is D, a little good  but ins´t bad";
                break;
            
            case 8:    
                score = "the note is C, better than before";
                break;
                
            case 9:
                score = "the note is B, very good four you!";
                break;
                
            case 10:
                score ="the note is A, you´re very incredible!!!!!!";
                break;
            
            default:
                score = "the note isn´t exist, bad news I know xd";
                break;
                    
                    
                    }
    
        System.out.println(score);
    }
}
