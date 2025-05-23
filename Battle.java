import java.util.ArrayList;
/**
 * The Battle class creates an arraylist for two armies that will then battle against each other.
 * 
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Battle
{
    // instance variables - replace the example below with your own
    ArrayList<Creature> army1;
    ArrayList<Creature> army2;

    /**
     * Constructor for objects of class Battle
     */
    public Battle()
    {
        ArrayList<Creature> army1 = new ArrayList<>();
        ArrayList<Creature> army2 = new ArrayList<>();
        //fight();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void fillArmy()
    {
        //fill Army1
        for (int index = 1; index<=100; index++){
            int num = Randomizer.nextInt(10)+1;
            if (num <= 6){
                Human human = new Human();
                army1.add(human);
            }
            if ((num==7) || (num==8)){
                Elf elf = new Elf();
                army1.add(elf);
            }
            if ((num==9) || (num==10)){
                Dwarves dwarf = new Dwarves();
                army1.add(dwarf);
            }
        }
        //System.out.println(army1);
        //fill Army2
        for (int index = 1; index<=50; index++){
            int num = Randomizer.nextInt(25)+1;
            if (num <= 18){
                Human human = new Human();
                army2.add(human);
            }
            if ((num >= 19) && (num<=24)){
                CyberDemon cyberdemon = new CyberDemon();
                army2.add(cyberdemon);
            }
            if (num==25){
                Balrog balrog = new Balrog();
                army2.add(balrog);
            }
        }
        System.out.println(army2);
    }


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void fight()
    {
        fillArmy();
        int index = 0;
        while ((army1.get(index).isAlive()) && (army2.get(index).isAlive())){
            army1.get(index).attack(army2.get(index));
            army2.get(index).takeDamage(army1.get(index).attack(army2.get(index)));
            index++;
        }
    }
}
