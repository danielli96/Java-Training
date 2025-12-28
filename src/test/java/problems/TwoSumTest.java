package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {
    @Test
    void testBasicTwoSum() {
        assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, TwoSum.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void testWithDuplicates() {
        assertArrayEquals(new int[]{0, 1}, TwoSum.twoSum(new int[]{3, 3}, 6));
    }

    @Test
    void testNoSolution() {
        assertArrayEquals(new int[]{}, TwoSum.twoSum(new int[]{1, 2, 3}, 10));
    }

    @Test
    void testNegativeNumbers() {
        assertArrayEquals(new int[]{2, 4}, TwoSum.twoSum(new int[]{-1, -2, -3, -4, -5}, -8));
    }
}
