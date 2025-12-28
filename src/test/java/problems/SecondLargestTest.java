package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SecondLargestTest {
    @Test
    void testBasicSecondLargest() {
        assertEquals(5, SecondLargest.findSecondLargest(new int[]{3, 5, 1, 9, 2}));
        assertEquals(8, SecondLargest.findSecondLargest(new int[]{10, 8, 6, 4, 2}));
    }

    @Test
    void testWithDuplicates() {
        assertEquals(5, SecondLargest.findSecondLargest(new int[]{3, 5, 1, 9, 9, 2}));
        assertEquals(8, SecondLargest.findSecondLargest(new int[]{10, 10, 8, 8}));
    }

    @Test
    void testTwoElements() {
        assertEquals(1, SecondLargest.findSecondLargest(new int[]{1, 2}));
    }

    @Test
    void testSmallArray() {
        assertThrows(IllegalArgumentException.class,
                () -> SecondLargest.findSecondLargest(new int[]{1}));
    }
}
