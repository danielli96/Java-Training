package problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MinMaxTest {
    @Test
    void testBasicArray() {
        Assertions.assertArrayEquals(new int[]{1, 9}, MinMax.findMinMax(new int[]{3, 5, 1, 9, 2}));
    }

    @Test
    void testSingleElement() {
        assertArrayEquals(new int[]{5, 5}, MinMax.findMinMax(new int[]{5}));
    }

    @Test
    void testNegativeNumbers() {
        assertArrayEquals(new int[]{-10, 5}, MinMax.findMinMax(new int[]{-5, -10, 0, 5}));
    }

    @Test
    void testEmptyArray() {
        assertArrayEquals(new int[]{}, MinMax.findMinMax(new int[]{}));
    }

    @Test
    void testAllSameElements() {
        assertArrayEquals(new int[]{7, 7}, MinMax.findMinMax(new int[]{7, 7, 7, 7}));
    }
}
