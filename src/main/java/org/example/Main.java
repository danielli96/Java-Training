package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// ============================================================================
// 1. REVERSE A STRING
// Problem: Given a string, return the string with characters in reverse order.
// Example: "hello" -> "olleh"
// ============================================================================
class ReverseString {
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

// ============================================================================
// 2. CHECK IF STRING IS PALINDROME
// Problem: Determine if a string reads the same forwards and backwards.
// Example: "racecar" -> true, "hello" -> false
// Advanced: Ignore spaces, punctuation, and case: "A man, a plan, a canal: Panama" -> true
// ============================================================================
class PalindromeChecker {
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

// ============================================================================
// 3. FIND MAXIMUM AND MINIMUM IN ARRAY
// Problem: Given an integer array, find both the maximum and minimum values.
// Example: [3, 5, 1, 9, 2] -> min: 1, max: 9
// ============================================================================
class MinMax {
    // Thought Process:
    // - Initialize min and max with first element
    // - Iterate through array comparing each element
    // - Update min/max as needed

    public static int[] findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[]{};
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        return new int[]{min, max};
    }

    // Time: O(n), Space: O(1)
}

// ============================================================================
// 4. FIBONACCI SEQUENCE
// Problem: Calculate the nth Fibonacci number where F(0)=0, F(1)=1, and F(n)=F(n-1)+F(n-2).
// Example: n=5 -> 5 (sequence: 0, 1, 1, 2, 3, 5)
// ============================================================================
class Fibonacci {
    // Thought Process:
    // - Base cases: fib(0) = 0, fib(1) = 1
    // - Each number is sum of previous two
    // - Can use recursion, iteration, or memoization

    // Iterative (most efficient)
    public static int fib(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // Recursive (simple but inefficient)
    public static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // Time: O(n) iterative, O(2^n) recursive
    // Space: O(1) iterative, O(n) recursive (call stack)
}

// ============================================================================
// 5. CHECK IF ARRAY IS SORTED
// Problem: Determine if an integer array is sorted in ascending order.
// Example: [1, 2, 3, 4] -> true, [1, 3, 2, 4] -> false
// ============================================================================
class SortedCheck {
    // Thought Process:
    // - Compare each element with next element
    // - If any element is greater than next, not sorted

    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Time: O(n), Space: O(1)
}

// ============================================================================
// 6. TWO SUM PROBLEM
// Problem: Given an array of integers and a target, find two numbers that add up to target.
// Return their indices.
// Example: nums=[2,7,11,15], target=9 -> [0,1] (because nums[0]+nums[1]=9)
// ============================================================================
class TwoSum {
    // Thought Process:
    // - Use HashMap to store complement of each number
    // - For each number, check if its complement exists
    // - Complement = target - current number

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    // Time: O(n), Space: O(n)
}

// ============================================================================
// 7. REMOVE DUPLICATES FROM SORTED ARRAY
// Problem: Given a sorted array, remove duplicates in-place and return new length.
// Example: [1,1,2,2,3] -> [1,2,3,_,_], return 3
// ============================================================================
class RemoveDuplicates {
    // Thought Process:
    // - Use two pointers: one for unique position, one for scanning
    // - When find different element, move it to unique position
    // - Return count of unique elements

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniquePos = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniquePos]) {
                uniquePos++;
                nums[uniquePos] = nums[i];
            }
        }

        return uniquePos + 1;
    }

    // Time: O(n), Space: O(1)
}

// ============================================================================
// 8. FIND MISSING NUMBER IN ARRAY
// Problem: Given an array containing n distinct numbers from 0 to n, find the missing one.
// Example: [3,0,1] -> 2 (range is 0-3, missing 2)
// ============================================================================
class MissingNumber {
    // Thought Process:
    // - Array has n numbers from 0 to n with one missing
    // - Calculate expected sum: n*(n+1)/2
    // - Subtract actual sum from expected sum

    public static int findMissing(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    // Alternative: XOR approach (works even with overflow)
    public static int findMissingXOR(int[] nums) {
        int xor = nums.length;
        for (int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i];
        }
        return xor;
    }

    // Time: O(n), Space: O(1)
}

// ============================================================================
// 9. COUNT VOWELS AND CONSONANTS
// Problem: Given a string, count the number of vowels and consonants (ignore non-letters).
// Example: "Hello World!" -> vowels: 3, consonants: 7
// ============================================================================
class VowelConsonantCounter {
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

// ============================================================================
// 10. ROTATE ARRAY
// Problem: Rotate an array to the right by k steps.
// Example: nums=[1,2,3,4,5], k=2 -> [4,5,1,2,3]
// ============================================================================
class ArrayRotation {
    // Thought Process:
    // - Rotate k steps = reverse approach
    // - Reverse entire array, then reverse first k, then reverse rest
    // - Handle k > n by using k % n

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Time: O(n), Space: O(1)
}

// ============================================================================
// 11. ANAGRAM CHECK
// Problem: Determine if two strings are anagrams (contain same characters with same frequency).
// Example: "listen" and "silent" -> true, "hello" and "world" -> false
// ============================================================================
class AnagramChecker {
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

// ============================================================================
// 12. FIND FIRST NON-REPEATING CHARACTER
// Problem: Given a string, find the first character that appears only once.
// Example: "leetcode" -> 'l', "loveleetcode" -> 'v'
// ============================================================================
class FirstNonRepeating {
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

// ============================================================================
// 13. MERGE TWO SORTED ARRAYS
// Problem: Given two sorted arrays, merge them into one sorted array.
// Example: arr1=[1,3,5], arr2=[2,4,6] -> [1,2,3,4,5,6]
// ============================================================================
class MergeSortedArrays {
    // Thought Process:
    // - Use two pointers, one for each array
    // - Compare elements and add smaller to result
    // - Handle remaining elements from either array

    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    // Time: O(n + m), Space: O(n + m)
}

// ============================================================================
// 14. BINARY SEARCH
// Problem: Given a sorted array and target value, return the index of target (or -1 if not found).
// Example: arr=[1,3,5,7,9], target=5 -> 2
// ============================================================================
class BinarySearch {
    // Thought Process:
    // - Array must be sorted
    // - Compare target with middle element
    // - If target < mid, search left half; if target > mid, search right half
    // - Repeat until found or range exhausted

    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Avoid overflow

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Not found
    }

    // Time: O(log n), Space: O(1)
}

// ============================================================================
// 15. FACTORIAL
// Problem: Calculate the factorial of a number n (n! = n × (n-1) × ... × 1).
// Example: n=5 -> 120 (5×4×3×2×1)
// ============================================================================
class Factorial {
    // Thought Process:
    // - n! = n * (n-1) * (n-2) * ... * 1
    // - Base case: 0! = 1, 1! = 1
    // - Can use iteration or recursion

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException();

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive
    public static long factorialRecursive(int n) {
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    // Time: O(n), Space: O(1) iterative, O(n) recursive
}

// ============================================================================
// 16. PRIME NUMBER CHECK
// Problem: Determine if a given number is prime (only divisible by 1 and itself).
// Example: n=7 -> true, n=8 -> false
// ============================================================================
class PrimeChecker {
    // Thought Process:
    // - Check divisibility from 2 to sqrt(n)
    // - If divisible by any number, not prime
    // - Optimization: only check up to sqrt(n)

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    // Time: O(sqrt(n)), Space: O(1)
}

// ============================================================================
// 17. REVERSE WORDS IN STRING
// Problem: Reverse the order of words in a string (trim extra spaces).
// Example: "the sky is blue" -> "blue is sky the"
// ============================================================================
class ReverseWords {
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

// ============================================================================
// 18. FIND SECOND LARGEST ELEMENT
// Problem: Find the second largest element in an array (handle duplicates properly).
// Example: [3,5,1,9,9,2] -> 5 (not 9, which is the largest)
// ============================================================================
class SecondLargest {
    // Thought Process:
    // - Keep track of largest and second largest
    // - Update them as we iterate through array
    // - Handle edge cases (duplicates, small arrays)

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least 2 elements");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return second;
    }

    // Time: O(n), Space: O(1)
}

// ============================================================================
// 19. LONGEST COMMON PREFIX
// Problem: Find the longest common prefix string among an array of strings.
// Example: ["flower","flow","flight"] -> "fl"
// ============================================================================
class LongestCommonPrefix {
    // Thought Process:
    // - Compare characters at same position across all strings
    // - Stop when mismatch found or end of shortest string
    /**
     *
     *
     * */
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

// ============================================================================
// 20. VALID PARENTHESES
// Problem: Determine if a string of brackets is valid (properly opened and closed in correct order).
// Example: "()[]{}"-true, "([)]"-false, "{[()]}"-true
// ============================================================================
class ValidParentheses {
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