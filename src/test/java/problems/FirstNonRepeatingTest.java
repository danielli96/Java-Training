package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstNonRepeatingTest {
    @Test
    void testBasicNonRepeating() {
        assertEquals('l', FirstNonRepeating.firstNonRepeating("leetcode"));
        assertEquals('v', FirstNonRepeating.firstNonRepeating("loveleetcode"));
    }

    @Test
    void testAllRepeating() {
        assertEquals('\0', FirstNonRepeating.firstNonRepeating("aabbcc"));
    }

    @Test
    void testSingleCharacter() {
        assertEquals('a', FirstNonRepeating.firstNonRepeating("a"));
    }

    @Test
    void testFirstCharNonRepeating() {
        assertEquals('c', FirstNonRepeating.firstNonRepeating("abcab"));
    }
}
