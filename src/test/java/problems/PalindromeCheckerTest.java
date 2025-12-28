package problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeCheckerTest {
    @Test
    void testSimplePalindrome() {
        Assertions.assertTrue(PalindromeChecker.isPalindrome("racecar"));
        assertTrue(PalindromeChecker.isPalindrome("noon"));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("world"));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(PalindromeChecker.isPalindrome("a"));
    }

    @Test
    void testEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    void testAdvancedPalindrome() {
        assertTrue(PalindromeChecker.isPalindromeAdvanced("A man, a plan, a canal: Panama"));
        assertTrue(PalindromeChecker.isPalindromeAdvanced("racecar"));
        assertFalse(PalindromeChecker.isPalindromeAdvanced("hello world"));
    }
}
