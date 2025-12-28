package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramCheckerTest {
    @Test
    void testValidAnagrams() {
        assertTrue(AnagramChecker.isAnagram("listen", "silent"));
        assertTrue(AnagramChecker.isAnagram("anagram", "nagaram"));
    }

    @Test
    void testInvalidAnagrams() {
        assertFalse(AnagramChecker.isAnagram("hello", "world"));
        assertFalse(AnagramChecker.isAnagram("rat", "car"));
    }

    @Test
    void testDifferentLengths() {
        assertFalse(AnagramChecker.isAnagram("a", "ab"));
    }

    @Test
    void testEmptyStrings() {
        assertTrue(AnagramChecker.isAnagram("", ""));
    }
}
