
/**
 * The Elf class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [8/25]
 * Implements a maximum/minimum hitpoint total for the creature type [10/30]
 *
 * @author Ivana San Pedro 
 * @version 2025-4-8
 */
public class Dwarves extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_DWARF_HP = 30;
    private static final int MIN_DWARF_HP = 10;
    private static final int MAX_DWARF_STR = 25;
    private static final int MIN_DWARF_STR = 8;

    /**
     * Constructor for objects of class Dwarves -
     * Note that the calling class does not need to know anything about the 
     * requirements of Dwarves minimum and maximum values
     * 
     * The instantiating class asks for a Dwarf and the Dwarf class is responsible for
     * return a Dwarf object with values in the appropriate range
     */
        public Dwarves()
    {
        super(
            Randomizer.nextInt(MAX_DWARF_STR-MIN_DWARF_STR)+MIN_DWARF_STR,
            Randomizer.nextInt(MAX_DWARF_HP-MIN_DWARF_HP)+MIN_DWARF_HP        
        );
    }

    /**
     * 50% chance to apply 10 more damage than base damage
     * Elf will return base damage for other 50%
     *
     * @param  creature
     * @return   damage
     */
    public int attack(Creature creature)
    {
        int damage = super.attack(creature);
        int chance = Randomizer.nextInt(100)+1;
        if ((chance >= 50) && (chance <= 100)){
            return damage + 10;
        }
        else{
            return damage;
        }
    }
}
