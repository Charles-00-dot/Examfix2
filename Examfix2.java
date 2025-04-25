import java.util.*;

/**
 * Write a description of class Examfix2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Examfix2
{
    
    
    // #24 
    public void dupes(){
        String myName1 = "Charles";
        String myName2 = "Charles";
        String myName3 = "Oliver";
        
        System.out.println(myName1.equals(myName2));
        System.out.println(myName1.equals(myName3));
    }
    
    
    //25
    public void degress(){
        ArrayList<Double> temperatures = new ArrayList<Double>();
        temperatures.add(38.1);
        temperatures.add(39.2);
        temperatures.add(27.3);
        for(double i : temperatures) {
            if(i> 37.5){
                System.out.println(i);
            }
        }
        
        // 26
        
        System.out.println("Max element is: " + Collections.max(temperatures));
        
        
        //27 
        Collections.sort(temperatures);
        
        for(double i : temperatures){
            System.out.println(i);
        }
        }
    }
    
    

