/**
 * The demon is a basic demonic creature that has a 5% chance to deal an additional 50 damage on an attack. Superclass of
 * Balrogs and CyberDemons
 * 
 * @author Connor Richardson 
 * @version 12/13/17
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_DEMON_HP = 30;
    private static final int MIN_DEMON_HP = 10;
    private static final int MAX_DEMON_STR = 18;
    private static final int MIN_DEMON_STR = 5;

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_DEMON_HP-MIN_DEMON_HP)+MIN_DEMON_HP,    
            Randomizer.nextInt(MAX_DEMON_STR-MIN_DEMON_STR)+MIN_DEMON_STR
        );
          
    }
    /**
     * Default Constructor for the Demon subclasses to utilize
     */
    public Demon(int hp, int str)
    {
        super(hp, str);       
    }
       /**
     * This overrides the creature class's damage() method and uses this one. This method gives the demon a 1 in 20 chance
     * to deal an additional 50 damage.
     */
        public int damage()
    {
        int damage;
        int rand = Randomizer.nextInt(20);
        
        if (rand==7)
        {
            damage = super.damage();
            damage = damage+50;
        }
        else
        {
            damage = super.damage();
        }
        
        return damage;
    }
}
