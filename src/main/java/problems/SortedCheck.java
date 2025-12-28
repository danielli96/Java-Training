package problems;

// ============================================================================
// 5. CHECK IF ARRAY IS SORTED
// Problem: Determine if an integer array is sorted in ascending order.
// Example: [1, 2, 3, 4] -> true, [1, 3, 2, 4] -> false
// ============================================================================
public class SortedCheck {
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
