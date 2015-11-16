package fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class FizzBuzzTest {

    @Test
    public void testCreateFizzBuzzSimple() throws Exception {
        List<String> actual = FizzBuzz.createFizzBuzzSimple(16);

        assertEquals(actual.get(2), "Fizz");
        assertEquals(actual.get(3), "4");
        assertEquals(actual.get(4), "Buzz");
        assertEquals(actual.get(5), "Fizz");
        assertEquals(actual.get(14), "FizzBuzz");
    }

    @Test
    public void testCreateFizzBuzzAlternative() throws Exception {
        List<String> actual = FizzBuzz.createFizzBuzzAlternative(16);

        assertEquals(actual.get(2), "Fizz");
        assertEquals(actual.get(3), "4");
        assertEquals(actual.get(4), "Buzz");
        assertEquals(actual.get(5), "Fizz");
        assertEquals(actual.get(14), "FizzBuzz");
    }
}