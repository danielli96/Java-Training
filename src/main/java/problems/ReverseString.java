package problems;

/**
 * COMPREHENSIVE JAVA 11 EXERCISES WITH JUNIT 5 TESTS
 * Complete with solutions, thought process, and complexity analysis
 * <p>
 * To run tests, add to your pom.xml:
 * <dependency>
 * <groupId>org.junit.jupiter</groupId>
 * <artifactId>junit-jupiter</artifactId>
 * <version>5.9.2</version>
 * <scope>test</scope>
 * </dependency>
 */

// ============================================================================
// 1. REVERSE A STRING
// Problem: Given a string, return the string with characters in reverse order.
// Example: "hello" -> "olleh"
// ============================================================================
public class ReverseString {
    // Thought Process:
    // - Use two pointers: one at start, one at end
    // - Swap characters and move pointers toward center
    // - OR use StringBuilder's built-in reverse (simpler)

    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    // Alternative: Using StringBuilder
    public static String reverseSimple(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    // Time: O(n), Space: O(n) for char array
}
