package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    @Test
    void testFoundTarget() {
        assertEquals(2, BinarySearch.search(new int[]{1, 3, 5, 7, 9}, 5));
        assertEquals(0, BinarySearch.search(new int[]{1, 3, 5, 7, 9}, 1));
        assertEquals(4, BinarySearch.search(new int[]{1, 3, 5, 7, 9}, 9));
    }

    @Test
    void testNotFoundTarget() {
        assertEquals(-1, BinarySearch.search(new int[]{1, 3, 5, 7, 9}, 4));
        assertEquals(-1, BinarySearch.search(new int[]{1, 3, 5, 7, 9}, 10));
    }

    @Test
    void testSingleElement() {
        assertEquals(0, BinarySearch.search(new int[]{5}, 5));
        assertEquals(-1, BinarySearch.search(new int[]{5}, 3));
    }

    @Test
    void testEmptyArray() {
        assertEquals(-1, BinarySearch.search(new int[]{}, 5));
    }
}
