package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class VowelConsonantCounterTest {
    @Test
    void testBasicCounting() {
        assertArrayEquals(new int[]{3, 7}, VowelConsonantCounter.countVowelsConsonants("Hello World"));
    }

    @Test
    void testAllVowels() {
        assertArrayEquals(new int[]{5, 0}, VowelConsonantCounter.countVowelsConsonants("aeiou"));
    }

    @Test
    void testAllConsonants() {
        assertArrayEquals(new int[]{0, 3}, VowelConsonantCounter.countVowelsConsonants("xyz"));
    }

    @Test
    void testWithNumbers() {
        assertArrayEquals(new int[]{2, 3}, VowelConsonantCounter.countVowelsConsonants("abc123de"));
    }
}
