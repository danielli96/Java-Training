package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {
    @Test
    void testBasicPrefix() {
        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(
                new String[]{"flower", "flow", "flight"}));
    }

    @Test
    void testNoCommonPrefix() {
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(
                new String[]{"dog", "racecar", "car"}));
    }

    @Test
    void testAllSame() {
        assertEquals("test", LongestCommonPrefix.longestCommonPrefix(
                new String[]{"test", "test", "test"}));
    }

    @Test
    void testSingleString() {
        assertEquals("hello", LongestCommonPrefix.longestCommonPrefix(
                new String[]{"hello"}));
    }

    @Test
    void testEmptyArray() {
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{}));
    }
}
