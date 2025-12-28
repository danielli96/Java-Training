package problems;

import java.util.HashMap;
import java.util.Map;

// ============================================================================
// 12. FIND FIRST NON-REPEATING CHARACTER
// Problem: Given a string, find the first character that appears only once.
// Example: "leetcode" -> 'l', "loveleetcode" -> 'v'
// ============================================================================
public class FirstNonRepeating {
    // Thought Process:
    // - Use HashMap to count frequency of each character
    // - Iterate again to find first with frequency 1

    public static char firstNonRepeating(String s) {
        Map<Character, Integer> count = new HashMap<>();

        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if (count.get(c) == 1) {
                return c;
            }
        }

        return '\0'; // null character if none found
    }

    // Time: O(n), Space: O(n)
}
