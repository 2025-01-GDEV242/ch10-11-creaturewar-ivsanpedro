
/**
 * Class CyberDemon extends class Demon. 
 * A CyberDemon also has the same chance to apply 50 more hitpoints than 
 * base damage
 * Implements a maximum/minimum strength for the creature type [25/40]
 * Implements a maximum/minimum hitpoint total for the creature type [25/100]
 *
 * @author Ivana San Pedro 
 * @version 2025-4-8
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_CYB_HP = 100;
    private static final int MIN_CYB_HP = 25;
    private static final int MAX_CYB_STR = 40;
    private static final int MIN_CYB_STR = 25;

    /**
     * Constructor for objects of class CyberDemon -
     * Note that the calling class does not need to know anything about the 
     * requirements of CyberDemon minimum and maximum values
     * 
     * The instantiating class asks for a CyberDemon and the CyberDemon class is responsible for
     * return a CyberDemon object with values in the appropriate range
     */
        public CyberDemon()
    {
        super(
            Randomizer.nextInt(MAX_CYB_STR - MIN_CYB_STR) + MIN_CYB_STR,
            Randomizer.nextInt(MAX_CYB_HP - MIN_CYB_HP) + MIN_CYB_HP        
        );
    }

    /**
     * 5% chance to allow a CyberDemon to apply 50 more hitpoints
     * than base damage
     * Same attack method as class Demon
     *
     * @param  creature
     * @return the value from base damage multiplied by 2 or value from base damage
     *
     * @param  creature
     * @return    damage
     */
    public int attack(Creature creature)
    {
        int damage = super.attack(creature);
        return damage;
    }
}
