package pairstar;

import org.junit.Test;

import static org.junit.Assert.*;


public class PairStarTest {

    @Test
    public void testPairStar() throws Exception {
        assertEquals("", PairStar.pairStar(""));
        assertEquals("h", PairStar.pairStar("h"));
        assertEquals("h*h", PairStar.pairStar("hh"));
        assertEquals("h*h*h", PairStar.pairStar("hhh"));
        assertEquals("hel*lo", PairStar.pairStar("hello"));
        assertEquals("x*xy*y", PairStar.pairStar("xxyy"));
    }

}