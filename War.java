import java.util.ArrayList;

/**
 * This program creates two armies and then battles them. It populates the two armies with different types of units and prints out info during and after the battle.
 * 
 * @author Connor Richardson
 * @version 12/14/17
 */
public class War
{
    private ArrayList <Creature> army1 = new ArrayList<Creature>();
    private ArrayList <Creature> army2 = new ArrayList<Creature>();
    
    /**
     * Creates two armies and populates them. Army 1 gets elves and humans, but army 2 gets demons, balrogs, and cyberdemons. Randomly assigns unit types to armies.
     */
    
    public War()
    {
         /**
         * Add units to army 1
         */
        for (int i = 0; i < 100; i++) 
        {
            int random = Randomizer.nextInt(10);
            if (random > 6) 
            {
                army1.add(new Elf());
            } 
            else 
            {
                army1.add(new Human());
            }

        }   
           
        
        
        /**
         * Add units to army 2
         */
        for (int i = 0; i < 60; i++) 
        {
            int random = Randomizer.nextInt(20);
            
            if (random == 10)
            {
                army2.add(new CyberDemon());
            } 
            else if (random == 19) 
            {
                army2.add(new Balrog());
            }
            else
            {
                army2.add(new Demon());
            } 
          
        }
        }
    

    /**
     * This is the actual battle between the two armies. It prints every time a unit dies, with a flavor specific to that army. In the end, it prints a rundown of the battle deaths and declares
     * one of the armies as the victor!
     * 
     */
    
    public void battle()
    {
        Creature a1 = null;
        Creature a2 = null;
        int a1Dead = 0;
        int a2Dead = 0;
        
        /**
         * Main game loop
         */
        do
        {
            if(a1 == null)
            {
                a1 = army1.remove(0);
            }
            
            if(a2 == null)
            {
                a2 = army2.remove(0);
            }
            
            while(a1.isAlive() && a2.isAlive())
            {
                a1.takeDamage(a2.damage());
                a2.takeDamage(a1.damage());
            }
            
            if(a1.isDead())
            {
                a1 = null;
                System.out.println("A brave solider dies in the fighting.");
                a1Dead++;
            }   

            if(a2.isDead())
            {
                a2 = null;
                System.out.println("The demon explodes and it's embers scatter in the wind.");
                a2Dead++;
            }
            
        } 
         while (army1.size() != 0 && army2.size() != 0);
        /**
         * Prints final results
         */
        System.out.println("");
        System.out.println("The battle is finally over...");
        System.out.println("~~~~~~~~~~RESULTS~~~~~~~~~~");
        System.out.println("Army 1 Forces Remaining: " + army1.size());
        System.out.println("Army 1 Losses: " + a1Dead); 
        System.out.println("");
        System.out.println("Army 2 Forces Remaining: " + army2.size());
        System.out.println("Army 2 Losses: " + a2Dead); 
        System.out.println("");
        
        if (army1.size() > 0) 
        {
              System.out.println ("The forces of good have triumphed!");   
        } 
        else if (army2.size() > 0) 
        {
            System.out.println ("A new age of darkness rules the land!");
        } 
    }
}