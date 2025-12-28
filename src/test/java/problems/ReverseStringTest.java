package problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringTest {
    @Test
    void testBasicReverse() {
        Assertions.assertEquals("olleh", ReverseString.reverse("hello"));
        assertEquals("dcba", ReverseString.reverse("abcd"));
    }

    @Test
    void testSingleCharacter() {
        assertEquals("a", ReverseString.reverse("a"));
    }

    @Test
    void testEmptyString() {
        assertEquals("", ReverseString.reverse(""));
    }

    @Test
    void testPalindrome() {
        assertEquals("racecar", ReverseString.reverse("racecar"));
    }

    @Test
    void testReverseSimple() {
        assertEquals("olleh", ReverseString.reverseSimple("hello"));
    }
}
