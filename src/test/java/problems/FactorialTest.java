package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FactorialTest {
    @Test
    void testBasicFactorials() {
        assertEquals(1, Factorial.factorial(0));
        assertEquals(1, Factorial.factorial(1));
        assertEquals(2, Factorial.factorial(2));
        assertEquals(6, Factorial.factorial(3));
        assertEquals(24, Factorial.factorial(4));
        assertEquals(120, Factorial.factorial(5));
    }

    @Test
    void testLargerFactorials() {
        assertEquals(3628800, Factorial.factorial(10));
    }

    @Test
    void testRecursiveVersion() {
        assertEquals(120, Factorial.factorialRecursive(5));
        assertEquals(720, Factorial.factorialRecursive(6));
    }

    @Test
    void testNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
}
