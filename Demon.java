
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
     * A demon has a 5% chance to apply 50 more hitpoints 
     * Demon will return base damage for the other 95%
     *
     * @param  creature
     * @return    damage
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
