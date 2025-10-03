import java.util.HashMap;

/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private int x;
    private HashMap<String, String> map = new HashMap<>();
    
    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        // initialise instance variables
        x = 0;
    }

    public void enterNumber(String name, String number)
    {
        map.put(name, number);
    }
    
    public String lookupNumber(String name)
    {
        return map.get(name);
    }
    
    public boolean detectKey()
    {
        if (map.containsKey("Heh")) {
            System.out.println("Key exists");
            return true;
        }else{
            System.out.println("Key does not exist");
            return false;
        }
    }
}