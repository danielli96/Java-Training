package problems;

// ============================================================================
// 10. ROTATE ARRAY
// Problem: Rotate an array to the right by k steps.
// Example: nums=[1,2,3,4,5], k=2 -> [4,5,1,2,3]
// ============================================================================
public class ArrayRotation {
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
