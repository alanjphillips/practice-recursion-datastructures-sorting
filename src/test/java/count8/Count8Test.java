package count8;

import org.junit.Test;

import static org.junit.Assert.*;


public class Count8Test {

    @Test
    public void testCount8() throws Exception {
        assertEquals(0, Count8.count8(0));
        assertEquals(2, Count8.count8(818));
        assertEquals(3, Count8.count8(88));
        assertEquals(4, Count8.count8(8818));
        assertEquals(8, Count8.count8(888188));
    }

}