
/**
 * The Demon class implements a wrapper for the base Creature class
 *
 * @author Ivana San Pedro 
 * @version 2025-4-8
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    private int str;        // The strength of this creature
    private int max_hp;     // The maximum hit points the creature can have (used if healing enabled)
    private int hp;
    /**
     * Constructor for objects of class Demon
     */
        public Demon(int str, int hp) 
    {
       super(str,hp);
    }


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int attack(Creature creature)
    {
        int damage = super.attack(creature);
        int chance = Randomizer.nextInt(100)+1;
        if ((chance >= 1) && (chance <= 5)){
            return damage + 50;
        }
        else{
            return damage;
        }
        
    }
}
