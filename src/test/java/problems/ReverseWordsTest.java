package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseWordsTest {
    @Test
    void testBasicReversal() {
        assertEquals("blue is sky the", ReverseWords.reverseWords("the sky is blue"));
        assertEquals("world hello", ReverseWords.reverseWords("hello world"));
    }

    @Test
    void testExtraSpaces() {
        assertEquals("example good a", ReverseWords.reverseWords("  a good   example  "));
    }

    @Test
    void testSingleWord() {
        assertEquals("hello", ReverseWords.reverseWords("hello"));
    }

    @Test
    void testTwoWords() {
        assertEquals("world hello", ReverseWords.reverseWords("hello world"));
    }
}
