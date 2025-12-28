package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeCheckerTest {
    @Test
    void testPrimeNumbers() {
        assertTrue(PrimeChecker.isPrime(2));
        assertTrue(PrimeChecker.isPrime(3));
        assertTrue(PrimeChecker.isPrime(5));
        assertTrue(PrimeChecker.isPrime(7));
        assertTrue(PrimeChecker.isPrime(11));
        assertTrue(PrimeChecker.isPrime(13));
    }

    @Test
    void testNonPrimeNumbers() {
        assertFalse(PrimeChecker.isPrime(1));
        assertFalse(PrimeChecker.isPrime(4));
        assertFalse(PrimeChecker.isPrime(6));
        assertFalse(PrimeChecker.isPrime(8));
        assertFalse(PrimeChecker.isPrime(9));
        assertFalse(PrimeChecker.isPrime(10));
    }

    @Test
    void testLargePrime() {
        assertTrue(PrimeChecker.isPrime(97));
        assertFalse(PrimeChecker.isPrime(100));
    }

    @Test
    void testNegativeAndZero() {
        assertFalse(PrimeChecker.isPrime(0));
        assertFalse(PrimeChecker.isPrime(-5));
    }
}
