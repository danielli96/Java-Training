package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedArraysTest {
    @Test
    void testBasicMerge() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6},
                MergeSortedArrays.merge(new int[]{1, 3, 5}, new int[]{2, 4, 6}));
    }

    @Test
    void testOneEmptyArray() {
        assertArrayEquals(new int[]{1, 2, 3},
                MergeSortedArrays.merge(new int[]{1, 2, 3}, new int[]{}));
        assertArrayEquals(new int[]{1, 2, 3},
                MergeSortedArrays.merge(new int[]{}, new int[]{1, 2, 3}));
    }

    @Test
    void testNoOverlap() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6},
                MergeSortedArrays.merge(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
    }

    @Test
    void testDuplicates() {
        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3},
                MergeSortedArrays.merge(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
    }
}
