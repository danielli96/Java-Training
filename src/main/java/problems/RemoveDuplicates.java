package problems;

// ============================================================================
// 7. REMOVE DUPLICATES FROM SORTED ARRAY
// Problem: Given a sorted array, remove duplicates in-place and return new length.
// Example: [1,1,2,2,3] -> [1,2,3,_,_], return 3
// ============================================================================
public class RemoveDuplicates {
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
