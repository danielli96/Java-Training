package problems;

// ============================================================================
// 17. REVERSE WORDS IN STRING
// Problem: Reverse the order of words in a string (trim extra spaces).
// Example: "the sky is blue" -> "blue is sky the"
// ============================================================================
public class ReverseWords {
    // Thought Process:
    // - Split string by spaces to get words
    // - Reverse the array of words
    // - Join back with spaces

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) result.append(" ");
        }

        return result.toString();
    }

    // Time: O(n), Space: O(n)
}
