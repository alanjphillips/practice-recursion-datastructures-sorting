package changepi;

import org.junit.Test;

import static org.junit.Assert.*;


public class ChangePiTest {

    @Test
    public void testChangePi() throws Exception {
        assertEquals("x", ChangePi.changePi("x"));
        assertEquals("3.14", ChangePi.changePi("pi"));
        assertEquals("x3.14x", ChangePi.changePi("xpix"));
        assertEquals("3.14p", ChangePi.changePi("pip"));
        assertEquals("p3.14p", ChangePi.changePi("ppip"));
        assertEquals("3.143.14", ChangePi.changePi("pipi"));
    }
}