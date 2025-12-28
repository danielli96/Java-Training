package problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidParenthesesTest {
    @Test
    void testValidParentheses() {
        assertTrue(ValidParentheses.isValid("()"));
        assertTrue(ValidParentheses.isValid("()[]{}"));
        assertTrue(ValidParentheses.isValid("{[()]}"));
        assertTrue(ValidParentheses.isValid("((()))"));
    }

    @Test
    void testInvalidParentheses() {
        assertFalse(ValidParentheses.isValid("(]"));
        assertFalse(ValidParentheses.isValid("([)]"));
        assertFalse(ValidParentheses.isValid("{[}"));
        assertFalse(ValidParentheses.isValid("((()"));
    }

    @Test
    void testEmptyString() {
        assertTrue(ValidParentheses.isValid(""));
    }

    @Test
    void testSingleBracket() {
        assertFalse(ValidParentheses.isValid("("));
        assertFalse(ValidParentheses.isValid(")"));
    }
}
