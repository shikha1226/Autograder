import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



/**
 * Test class for Fibonacci class.
 */ 
public class Fibonaccitest
{
    /** Initialise test suite - no-op. */
    @Before
    public void setUp()
    {
    }

    /** Clean up test suite - no-op. */
    @After
    public void tearDown()
    {
    }
   
    /** Test fib(1). */
    @Test
    public void testFib1()
    {
        assertEquals(1, Fibonacci.fib(1));
    }

    /** Test fib(2). */
    @Test
    public void testFib2()
    {
        assertEquals(1, Fibonacci.fib(2));
    }

    /** Test fib(3). */
    @Test
    public void testFib3()
    {
        assertEquals(2, Fibonacci.fib(3));
    }

    /** Test fib(30). */
    @Test
    public void testFib30()
    {
        assertEquals(832040, Fibonacci.fib(30));
    }

    
    
    
    
    /** Test fib(-1). */
    @Test
    public void testFibMinusOne()
    {
        boolean caught = false;
        try
        {
            Fibonacci.fib(-1);
        }
        catch (IllegalArgumentException e)
        {
            caught = true;
        }
        assertTrue(caught);
    }
}