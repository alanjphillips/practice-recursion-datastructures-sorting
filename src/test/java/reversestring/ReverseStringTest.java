package reversestring;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by alan on 06/11/15.
 */
public class ReverseStringTest {

    @Test
    public void testReverseWithStringBuilderInPlace() throws Exception {
        assertEquals("4321", ReverseString.reverseWithStringBuilderInPlace("1234"));
        assertEquals("54321", ReverseString.reverseWithStringBuilderInPlace("12345"));
    }

    @Test
    public void testReverse() throws Exception {
        assertEquals("1", ReverseString.reverse("1"));
        assertEquals("21", ReverseString.reverse("12"));
        assertEquals("54321", ReverseString.reverse("12345"));
    }
}