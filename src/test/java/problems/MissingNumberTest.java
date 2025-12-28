package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MissingNumberTest {
    @Test
    void testBasicMissing() {
        assertEquals(2, MissingNumber.findMissing(new int[]{3, 0, 1}));
        assertEquals(8, MissingNumber.findMissing(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    @Test
    void testMissingFirst() {
        assertEquals(0, MissingNumber.findMissing(new int[]{1, 2, 3}));
    }

    @Test
    void testMissingLast() {
        assertEquals(3, MissingNumber.findMissing(new int[]{0, 1, 2}));
    }

    @Test
    void testXORApproach() {
        assertEquals(2, MissingNumber.findMissingXOR(new int[]{3, 0, 1}));
    }
}
