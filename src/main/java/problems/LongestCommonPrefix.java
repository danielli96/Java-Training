package problems;

// ============================================================================
// 19. LONGEST COMMON PREFIX
// Problem: Find the longest common prefix string among an array of strings.
// Example: ["flower","flow","flight"] -> "fl"
// ============================================================================
public class LongestCommonPrefix {
    // Thought Process:
    // - Compare characters at same position across all strings
    // - Stop when mismatch found or end of shortest string

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0];
    }

    // Time: O(S) where S is sum of all characters, Space: O(1)
}
