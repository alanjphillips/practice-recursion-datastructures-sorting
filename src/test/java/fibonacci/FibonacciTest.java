package fibonacci;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class FibonacciTest {

    @Test
    public void testCreateFibList() throws Exception {
        assertEquals(0, Fibonacci.createFibList(0).size());
        assertEquals(Arrays.asList(0L), Fibonacci.createFibList(1));
        assertEquals(Arrays.asList(0L, 1L), Fibonacci.createFibList(2));
        assertEquals(Arrays.asList(0L, 1L, 1L), Fibonacci.createFibList(3));
        assertEquals(Arrays.asList(0L, 1L, 1L, 2L), Fibonacci.createFibList(4));
        assertEquals(Arrays.asList(0L, 1L, 1L, 2L, 3L), Fibonacci.createFibList(5));
        assertEquals(Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L), Fibonacci.createFibList(6));
        assertEquals(Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L, 8L), Fibonacci.createFibList(7));
        assertEquals(Arrays.asList(0L, 1L, 1L, 2L, 3L, 5L, 8L, 13L), Fibonacci.createFibList(8));
    }

    @Test
    public void testFibNIterative() throws Exception {
        assertEquals(2L, Fibonacci.fibNIterative(3));
        assertEquals(13L, Fibonacci.fibNIterative(7));
        assertEquals(21L, Fibonacci.fibNIterative(8));
        assertEquals(6765L, Fibonacci.fibNIterative(20));
        assertEquals(832040L, Fibonacci.fibNIterative(30));
        assertEquals(102334155L, Fibonacci.fibNIterative(40));
        assertEquals(12586269025L, Fibonacci.fibNIterative(50));
    }

    @Test
    public void testFibNRecursive() throws Exception {
        assertEquals(0L, Fibonacci.fibN(0));
        assertEquals(1L, Fibonacci.fibN(1));
        assertEquals(1L, Fibonacci.fibN(2));
        assertEquals(2L, Fibonacci.fibN(3));
        assertEquals(13L, Fibonacci.fibN(7));
        assertEquals(21L, Fibonacci.fibN(8));
        assertEquals(6765L, Fibonacci.fibN(20));
        assertEquals(832040L, Fibonacci.fibN(30));
        assertEquals(102334155L, Fibonacci.fibN(40));
    }

    @Test
    public void testFibNRecursiveMemozied() throws Exception {
        Fibonacci fibonacci = new Fibonacci();

        assertEquals(0L, fibonacci.memoizedfibN(0));
        assertEquals(1L, fibonacci.memoizedfibN(1));
        assertEquals(1L, fibonacci.memoizedfibN(2));
        assertEquals(2L, fibonacci.memoizedfibN(3));
        assertEquals(13L, fibonacci.memoizedfibN(7));
        assertEquals(21L, fibonacci.memoizedfibN(8));
        assertEquals(6765L, fibonacci.memoizedfibN(20));
        assertEquals(832040L, fibonacci.memoizedfibN(30));
        assertEquals(102334155L, fibonacci.memoizedfibN(40));
        assertEquals(3736710778780434371L, fibonacci.memoizedfibN(100));
        assertEquals(6792540214324356296L, fibonacci.memoizedfibN(150));
    }
}