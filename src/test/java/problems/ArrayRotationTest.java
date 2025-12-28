package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayRotationTest {
    @Test
    void testBasicRotation() {
        int[] arr = {1, 2, 3, 4, 5};
        ArrayRotation.rotate(arr, 2);
        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, arr);
    }

    @Test
    void testRotateByLength() {
        int[] arr = {1, 2, 3};
        ArrayRotation.rotate(arr, 3);
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

    @Test
    void testRotateByZero() {
        int[] arr = {1, 2, 3};
        ArrayRotation.rotate(arr, 0);
        assertArrayEquals(new int[]{1, 2, 3}, arr);
    }

    @Test
    void testRotateMoreThanLength() {
        int[] arr = {1, 2, 3};
        ArrayRotation.rotate(arr, 5);
        assertArrayEquals(new int[]{2, 3, 1}, arr);
    }
}
