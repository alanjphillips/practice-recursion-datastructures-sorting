package factorial;

import org.junit.Test;

import static org.junit.Assert.*;


public class FactorialTest {

    @Test
    public void testFactorialIterative() throws Exception {
        assertEquals(1L, Factorial.factorialIterative(1));
        assertEquals(2L, Factorial.factorialIterative(2));
        assertEquals(6L, Factorial.factorialIterative(3));
        assertEquals(24L, Factorial.factorialIterative(4));
    }

    @Test
    public void testFactorial() throws Exception {
        assertEquals(1L, Factorial.factorial(1));
        assertEquals(2L, Factorial.factorial(2));
        assertEquals(6L, Factorial.factorial(3));
        assertEquals(24L, Factorial.factorial(4));
    }
}