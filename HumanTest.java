

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class HumanTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HumanTest
{
    /**
     * Default constructor for test class HumanTest
     */
    public HumanTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void TestHuman()
    {
        Human human1 = new Human();
        assertEquals(15, human1.attack());
        assertEquals(25, human1.getHP());
        assertEquals(20, human1.getStr());
        assertEquals(true, human1.isAlive());
        assertEquals(false, human1.isKnockedOut());
        human1.takeDamage(5);
        assertEquals(18, human1.getHP());
    }

    @Test
    public void TestHumanhp()
    {
        Human human1 = new Human();
        assertEquals(7, human1.attack());
        assertEquals(25, human1.getHP());
        human1.takeDamage(5);
        assertEquals(8, human1.getHP());
    }
}


