

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ElfTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ElfTest
{
    /**
     * Default constructor for test class ElfTest
     */
    public ElfTest()
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
    public void TestElf()
    {
        Elf elf1 = new Elf();
        assertEquals(10, elf1.getHP());
        assertEquals(16, elf1.getStr());
        assertEquals(true, elf1.isAlive());
        assertEquals(false, elf1.isKnockedOut());
        assertEquals(13, elf1.getHP());
        elf1.takeDamage(12);
        assertEquals(true, elf1.isKnockedOut());
    }

    @Test
    public void test2()
    {
        Elf elf1 = new Elf();
        assertEquals(20, elf1.getHP());
        elf1.takeDamage(10);
        assertEquals(true, elf1.isKnockedOut());
    }
}


