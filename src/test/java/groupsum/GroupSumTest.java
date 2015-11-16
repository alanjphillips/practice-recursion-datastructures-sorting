package groupsum;

import org.junit.Test;

import static org.junit.Assert.*;


public class GroupSumTest {

    @Test
    public void testGroupSum() throws Exception {
        assertEquals(false, GroupSum.groupSum(0, new int[0], 10));

        assertEquals(true, GroupSum.groupSum(0, new int[]{2,8}, 10));
        assertEquals(true, GroupSum.groupSum(0, new int[]{2,4}, 6));
        assertEquals(false, GroupSum.groupSum(0, new int[]{2,2}, 6));

        assertEquals(true, GroupSum.groupSum(0, new int[]{2,4,8}, 10));
        assertEquals(true, GroupSum.groupSum(0, new int[]{2,4,8}, 14));
        assertEquals(false, GroupSum.groupSum(0, new int[]{2,4,8}, 9));

        assertEquals(true, GroupSum.groupSum(0, new int[]{1,2,3,4,8,9,10}, 6));

        assertEquals(true, GroupSum.groupSum(0, new int[]{1,2,3,4,8,9,10}, 13));
        assertEquals(true, GroupSum.groupSum(0, new int[]{1,2,3,4,8,9,10}, 11));

        assertEquals(false, GroupSum.groupSum(0, new int[]{1,2,3,4,8,9,10}, 39));
    }

    @Test
    public void testGroupSum6() throws Exception {
        assertEquals(true, GroupSum.groupSum6(0, new int[]{5, 6, 2}, 8));
        assertEquals(false, GroupSum.groupSum6(0, new int[]{5, 6, 2}, 9));
        assertEquals(false, GroupSum.groupSum6(0, new int[]{5, 6, 2}, 7));
    }
}