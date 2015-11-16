package array11;

import org.junit.Test;

import static org.junit.Assert.*;


public class Array11Test {

    @Test
    public void testArray11() throws Exception {
        assertEquals(0, Array11.array11(new int[0], 0));
        assertEquals(1, Array11.array11(new int[]{11}, 0));
        assertEquals(2, Array11.array11(new int[]{11, 11}, 0));
        assertEquals(1, Array11.array11(new int[]{3, 11}, 0));
        assertEquals(1, Array11.array11(new int[]{11, 3}, 0));
        assertEquals(4, Array11.array11(new int[]{3, 11, 3, 11, 11, 3, 11, 3}, 0));

    }
}