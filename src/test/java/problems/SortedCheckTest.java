package problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SortedCheckTest {
    @Test
    void testSortedArray() {
        Assertions.assertTrue(SortedCheck.isSorted(new int[]{1, 2, 3, 4, 5}));
        assertTrue(SortedCheck.isSorted(new int[]{1, 1, 2, 3})); // duplicates allowed
    }

    @Test
    void testUnsortedArray() {
        assertFalse(SortedCheck.isSorted(new int[]{1, 3, 2, 4}));
        assertFalse(SortedCheck.isSorted(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    void testSingleElement() {
        assertTrue(SortedCheck.isSorted(new int[]{1}));
    }

    @Test
    void testEmptyArray() {
        assertTrue(SortedCheck.isSorted(new int[]{}));
    }
}
