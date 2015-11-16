package sort;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by alan on 16/11/15.
 */
public class SortTest {

    List<Integer> unorderedList;
    List<Integer> orderedList;

    @Before
    public void setUp() throws Exception {
        unorderedList = Arrays.asList(32,8,34,67,88,2,6,3,54,4,6,77,9,22,2,97,9,1,43);

        orderedList = new ArrayList<>(unorderedList.size());
        orderedList.addAll(unorderedList);
        Collections.sort(orderedList);
    }

    @Test
    public void testBinarySearch() throws Exception {
        assertTrue(Sort.binarySearch((orderedList), 67));
        assertTrue(Sort.binarySearch(orderedList, 22));
        assertFalse(Sort.binarySearch(orderedList, 21));
        assertFalse(Sort.binarySearch(orderedList, 5));
    }

    @Test
    public void testQuicksort() throws Exception {
        List<Integer> sortedQuickSort = Sort.quicksort(unorderedList);

        assertEquals(orderedList, sortedQuickSort);
    }

    @Test
    public void testInsertSort() throws Exception {
        List<Integer> sortedInsertSort = Sort.quicksort(unorderedList);

        assertEquals(orderedList, sortedInsertSort);
    }

    @Test
    public void testBubbleSort() throws Exception {
        int[] intArrayUnordered = new int[unorderedList.size()];
        int[] intArrayOrdered = new int[orderedList.size()];
        for (int i = 0; i < unorderedList.size(); i++) {
            intArrayUnordered[i] = unorderedList.get(i);
            intArrayOrdered[i] = orderedList.get(i);
        }

        Sort.bubbleSort(intArrayUnordered);

        assertTrue(Arrays.equals(intArrayOrdered, intArrayUnordered));
    }

    @Test
    public void testMergesort() throws Exception {
        List<Integer> sortedMergeSort = Sort.quicksort(unorderedList);

        assertEquals(orderedList, sortedMergeSort);
    }
}