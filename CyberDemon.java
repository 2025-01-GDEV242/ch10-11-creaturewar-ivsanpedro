
/**
 * Write a description of class CyberDemon here.
 *
 * @author Ivana San Pedro 
 * @version 2025-4-8
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_CYB_HP = 200;
    private static final int MIN_CYB_HP = 80;
    private static final int MAX_CYB_STR = 100;
    private static final int MIN_CYB_STR = 50;

    /**
     * Constructor for objects of class CyberDemon
     */
        public CyberDemon()
    {
        super(
            Randomizer.nextInt(MAX_CYB_STR - MIN_CYB_STR) + MIN_CYB_STR,
            Randomizer.nextInt(MAX_CYB_HP - MIN_CYB_HP) + MIN_CYB_HP        
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
        return damage;
    }
}
