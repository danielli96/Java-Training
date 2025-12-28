package problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {
    @Test
    void testBasicFibonacci() {
        Assertions.assertEquals(0, Fibonacci.fib(0));
        assertEquals(1, Fibonacci.fib(1));
        assertEquals(1, Fibonacci.fib(2));
        assertEquals(2, Fibonacci.fib(3));
        assertEquals(3, Fibonacci.fib(4));
        assertEquals(5, Fibonacci.fib(5));
        assertEquals(8, Fibonacci.fib(6));
    }

    @Test
    void testLargerFibonacci() {
        assertEquals(55, Fibonacci.fib(10));
        assertEquals(6765, Fibonacci.fib(20));
    }

    @Test
    void testRecursiveVersion() {
        assertEquals(5, Fibonacci.fibRecursive(5));
        assertEquals(8, Fibonacci.fibRecursive(6));
    }
}
