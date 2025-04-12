
/**
 * Write a description of class Dwarves here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dwarves extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_DWARF_HP = 30;
    private static final int MIN_DWARF_HP = 10;
    private static final int MAX_DWARF_STR = 25;
    private static final int MIN_DWARF_STR = 8;

    /**
     * Constructor for objects of class Dwarves
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
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
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
