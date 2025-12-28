package problems;

import java.util.HashMap;
import java.util.Map;

// ============================================================================
// 6. TWO SUM PROBLEM
// Problem: Given an array of integers and a target, find two numbers that add up to target.
// Return their indices.
// Example: nums=[2,7,11,15], target=9 -> [0,1] (because nums[0]+nums[1]=9)
// ============================================================================
public class TwoSum {
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
