package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesTest {
    @Test
    void testBasicRemoval() {
        int[] arr = {1, 1, 2, 2, 3};
        assertEquals(3, RemoveDuplicates.removeDuplicates(arr));
        assertArrayEquals(new int[]{1, 2, 3, 2, 3}, arr);
    }

    @Test
    void testNoDuplicates() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(5, RemoveDuplicates.removeDuplicates(arr));
    }

    @Test
    void testAllDuplicates() {
        int[] arr = {1, 1, 1, 1};
        assertEquals(1, RemoveDuplicates.removeDuplicates(arr));
    }

    @Test
    void testEmptyArray() {
        assertEquals(0, RemoveDuplicates.removeDuplicates(new int[]{}));
    }
}
