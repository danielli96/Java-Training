package problems;

// ============================================================================
// 8. FIND MISSING NUMBER IN ARRAY
// Problem: Given an array containing n distinct numbers from 0 to n, find the missing one.
// Example: [3,0,1] -> 2 (range is 0-3, missing 2)
// ============================================================================
public class MissingNumber {
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
