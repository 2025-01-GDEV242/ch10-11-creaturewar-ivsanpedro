
/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [18/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/8]
 *
 * @author Ivana San Pedro 
 * @version 2025-4-8
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
    private static final int MAX_ELF_STR = 20;
    private static final int MIN_ELF_STR = 5;
    Integer[] chance;

    /**
     * Constructor for objects of class Elf -
     * Note that the calling class does not need to know anything about the 
     * requirements of elf minimum and maximum values
     * 
     * The instantiating class asks for a elf and the elf class is responsible for
     * return a elf object with values in the appropriate range
     */
    public Elf()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(MAX_ELF_STR - MIN_ELF_STR) + MIN_ELF_STR,
            Randomizer.nextInt(MAX_ELF_HP - MIN_ELF_HP) + MIN_ELF_HP        
        );
    }

    /**
     * 10% chance to allow an elf to do twice the damage as the base damage
     * Takes the base damage and multiplies it by 2
     *
     * @param  none
     * @return the value from base damage multiplied by 2
     */
    public int magAttackElf()
    {
        int damage = super.attack();
        int chance = Randomizer.nextInt(100)+1;
        if ((chance >= 1) && (chance <= 10)){
            return damage*2;
        }
        else{
            return damage;
        }
    }
}
