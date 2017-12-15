/**
 * The elf is a magical creature type that has a 10% chance to deal double damage on an attack.
 * 
 * @author Connor Richardson 
 * @version 12/13/17
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_ELF_HP-MIN_ELF_HP)+MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR-MIN_ELF_STR)+MIN_ELF_STR
        );
          
    }
    /**
     * This overrides the creature class's damage() method and uses this one. This method gives the elf a 1 in 10 chance
     * to deal double damage on an attack.
     */
    public int damage()
    {
        int damage;
        int rand = Randomizer.nextInt(10);
        
        if (rand==7)
        {
            damage = super.damage();
            damage = damage*2;
        }
        else
        {
            damage = super.damage();
        }
        
        return damage;
    }
       
}
