
/**
 * Class Balrog extends class Demon. 
 * Implements a maximum/minimum strength for the creature type [50/100]
 * Implements a maximum/minimum hitpoint total for the creature type [80/200]
 *
 * @author Ivana San Pedro 
 * @version 2025-4-8
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BAL_HP = 200;
    private static final int MIN_BAL_HP = 80;
    private static final int MAX_BAL_STR = 100;
    private static final int MIN_BAL_STR = 50;

    /**
     * Constructor for objects of class Balrog
     */
        public Balrog()
    {
        super(
            Randomizer.nextInt(MAX_BAL_STR - MIN_BAL_STR) + MIN_BAL_STR,
            Randomizer.nextInt(MAX_BAL_HP - MIN_BAL_HP) + MIN_BAL_HP        
        );
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
        int doubleDamage = damage + super.attack(creature);
        return doubleDamage;
    }
}
