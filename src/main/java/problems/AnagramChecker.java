package problems;

// ============================================================================
// 11. ANAGRAM CHECK
// Problem: Determine if two strings are anagrams (contain same characters with same frequency).
// Example: "listen" and "silent" -> true, "hello" and "world" -> false
// ============================================================================
public class AnagramChecker {
    // Thought Process:
    // - Two strings are anagrams if they have same characters with same frequency
    // - Sort both strings and compare OR use frequency map

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }

    // Time: O(n), Space: O(1) - fixed size array
}
