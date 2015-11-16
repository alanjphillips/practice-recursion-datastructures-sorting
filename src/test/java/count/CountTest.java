package count;

import org.junit.Test;

import static org.junit.Assert.*;


public class CountTest {

    @Test
    public void testCount7() throws Exception {
        assertEquals(0, Count.count7(6));
        assertEquals(1, Count.count7(7));
        assertEquals(2, Count.count7(77));
        assertEquals(2, Count.count7(717));
        assertEquals(0, Count.count7(123));
    }

    @Test
    public void testCountX() throws Exception {
        assertEquals(0, Count.countX("a"));
        assertEquals(1, Count.countX("x"));
        assertEquals(2, Count.countX("xax"));
        assertEquals(2, Count.countX("xaxa"));
        assertEquals(9, Count.countX("xxxaaxxaaxaxaxax"));
    }

    @Test
    public void testCountAbc() throws Exception {
        assertEquals(0, Count.countAbc(""));
        assertEquals(0, Count.countAbc("ab"));
        assertEquals(1, Count.countAbc("abc"));
        assertEquals(2, Count.countAbc("abcxxabc"));
        assertEquals(2, Count.countAbc("abaxxaba"));
        assertEquals(2, Count.countAbc("abcxxabcab"));
        assertEquals(2, Count.countAbc("abcabcab"));
        assertEquals(2, Count.countAbc("ababc"));
        assertEquals(4, Count.countAbc("abcxxabcabaxabc"));
    }

    @Test
    public void testCountHi2() throws Exception {
        assertEquals(0, Count.countHi2(""));
        assertEquals(1, Count.countHi2("hi"));
        assertEquals(1, Count.countHi2("hii"));
        assertEquals(1, Count.countHi2("hhi"));
        assertEquals(0, Count.countHi2("xhi"));

        assertEquals(1, Count.countHi2("ahixhi"));
        assertEquals(2, Count.countHi2("ahibhi"));
        assertEquals(0, Count.countHi2("xhixhi"));
    }

    @Test
    public void testStrCount() throws Exception {
        assertEquals(0, Count.strCount("", "a"));
        assertEquals(1, Count.strCount("cat", "cat"));
        assertEquals(2, Count.strCount("catcowcat", "cat"));
        assertEquals(1, Count.strCount("catcowcat", "cow"));
        assertEquals(0, Count.strCount("catcowcat", "dog"));
    }
}