package problems;

// ============================================================================
// 9. COUNT VOWELS AND CONSONANTS
// Problem: Given a string, count the number of vowels and consonants (ignore non-letters).
// Example: "Hello World!" -> vowels: 3, consonants: 7
// ============================================================================
public class VowelConsonantCounter {
    // Thought Process:
    // - Iterate through string
    // - Check if each character is vowel or consonant
    // - Use Set or simple if-else for vowel check

    public static int[] countVowelsConsonants(String s) {
        int vowels = 0, consonants = 0;
        String vowelSet = "aeiouAEIOU";

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowelSet.indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }

    // Time: O(n), Space: O(1)
}
