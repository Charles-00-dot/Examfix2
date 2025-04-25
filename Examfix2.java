
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
        ArrayList<int> temperatures = new ArrayList<int>;
        temperatures.add(38);
        temperatures.add(39);
        temperatures.add(27);
        for(int i : temperatures) {
            if(i> 37.5){
                System.out.println(i);
            }
        }
        
        // 26
        
        for (int i : temperatures){
            collection.max(i);
            System.out.println(i.max);
        }
        
        //27 
        
        for(int i ;i < temperatures.size ;i++){
            Collections.sort(i);
            System.out.println(i.sort);
        }
    }
    
    
}
