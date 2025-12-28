package problems;

// ============================================================================
// 2. CHECK IF STRING IS PALINDROME
// Problem: Determine if a string reads the same forwards and backwards.
// Example: "racecar" -> true, "hello" -> false
// Advanced: Ignore spaces, punctuation, and case: "A man, a plan, a canal: Panama" -> true
// ============================================================================
public class PalindromeChecker {
    // Thought Process:
    // - Compare characters from both ends moving toward center
    // - If any mismatch, return false
    // - Can ignore case and non-alphanumeric characters

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // With case-insensitive and alphanumeric only
    public static boolean isPalindromeAdvanced(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Time: O(n), Space: O(1)
}
