
/**
 * Abstract class Creature - 
 * The creature is the main class from which all other battling creatures derive.
 * It is the creature's job to maintain current health values in response to 
 * requests to takeDamage. It also must report if
 * the creature is alive or dead. The creature is also responsible for calculating
 * damage delivered based on the creature's strength (1 to str) 
 * 
 * @author Connor Richardson
 * @version 12/13/17
 */
public abstract class Creature
{
    private int str;
    private int max_hp;
    private int hp;
    
    /**
     * default constructor - this should never actually run
     */
    public Creature (){
        str=10;
        hp=10;
        max_hp = hp;
    }
    
    /**
     * Create a creature with a given strength and hit point level. 
     * Store max hitpoints to allow for healing to be implemented later
     * Heals must never allow for more hit points than the creature started
     * with
     * @param str the strength of the creature, used to calculate damage
     * @param hp the health of the creature at the start of the simulation, and the current health levels during battle
     */
    public Creature (int str, int hp) {
       this.str = str;
       this.hp = hp;
    }
    
    
    /**
     * Allows a creature to determine how much damage it is causing in this round of battle
     * @return a value between 1 and str to be used to cause damage to another creature
     */
    public int damage(){
        int damage = Randomizer.nextInt(str)+1;
        return damage;
    }
    
    
    /**
     * Is this creature still capable of fighting?
     * @return true when current hit point level is greater than zero
     */
    public boolean isAlive() {
        //implement this
        if (hp>0)
        {
         return true;   
        }
        else
        return false; //change this
    }
    
    /**
     * Is this creature deceased?
     * @return true when current hit point level is less than or equal to zero
     */
    public boolean isDead() {
        
        if (hp <= 0)
        {
            return true;
        }
        else
        return false;
    }
    
    
    /**
     * takeDamage receives a value for the amount of damage to subtract from 
     * the current total of hit points
     * @param damage value to remove from hit point count
     */
    public void takeDamage(int damage) 
    {
        int damageTaken = damage;
        hp = hp - damageTaken;
    }
    
    /**
     * getHP allows the private hp field to be accessed outside of the creature class
     */
    public int getHP()
    {
     return hp;   
    }
    
    /**
     * getStr allows the private str field to be accessed outside of the creature class
     */
    public int getStr()
    {
        return str;
    }
}
