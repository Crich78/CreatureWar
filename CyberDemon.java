/**
 * A demonic creture type that has better stats than regular demons.
 * 
 * @author Connor Richardson 
 * @version 12/13/17
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 20;

    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_CYBERDEMON_HP-MIN_CYBERDEMON_HP)+MIN_CYBERDEMON_HP,    
            Randomizer.nextInt(MAX_CYBERDEMON_STR-MIN_CYBERDEMON_STR)+MIN_CYBERDEMON_STR
        );
          
    }

}
