
package ujava;
import java.util.*;


public class WeatherSeason {
    public static void main(String[] args) {
       
      Scanner read = new Scanner (System.in);   
      
        System.out.println("Weather Season\n");
        
        System.out.println("Write de number of a month:");
        
        String season = "The number isn´t coincide with a season!";
        
        int numberWeather = read.nextInt();
        
        switch(numberWeather) {
            case 1: case 11: case 12:
                season = "Winter";
                break;
            
            case 2: case 3: case 4:
                season = "Summer";
                break;
            
            case 5: case 6: case 7:
                season = "Winter";
                break;
                
            case 8: case 9: case 10:
                season = "Spring";
                break;
            
            default:
                season = " wrote number isn´t for a month";
        }
        System.out.println("The season is :" + season);
    }
    
    
    
}
