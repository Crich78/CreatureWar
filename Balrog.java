/**
 * A demonic creature with high stats that attacks twice each round. Subclass of Demon.
 * 
 * @author Connor Richardson 
 * @version 12/13/17
 */
public class Balrog extends Demon
{
    // instance variables
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_BALROG_HP-MIN_BALROG_HP)+MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR-MIN_BALROG_STR)+MIN_BALROG_STR
        );
    }
           /**
     * This overrides the creature class's damage() method and uses this one. This method gives the Balrog the ability to
     * attack twice every round.
     */
        public int damage()
        {
            int damage;
            damage = (Randomizer.nextInt(super.getStr())+1) + (Randomizer.nextInt(super.getStr())+1) ;
            return damage;
        }
          
    

}
