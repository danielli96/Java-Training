package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// ============================================================================
// 20. VALID PARENTHESES
// Problem: Determine if a string of brackets is valid (properly opened and closed in correct order).
// Example: "()[]{}"-true, "([)]"-false, "{[()]}"-true
// ============================================================================
public class ValidParentheses {
    // Thought Process:
    // - Use stack to track opening brackets
    // - For closing bracket, check if it matches top of stack
    // - Stack should be empty at end

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> pairs = new HashMap<>();
        pairs.put(')', '(');
        pairs.put('}', '{');
        pairs.put(']', '[');

        for (char c : s.toCharArray()) {
            if (pairs.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != pairs.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    // Time: O(n), Space: O(n)
}
