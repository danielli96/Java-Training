package problems;

// ============================================================================
// 14. BINARY SEARCH
// Problem: Given a sorted array and target value, return the index of target (or -1 if not found).
// Example: arr=[1,3,5,7,9], target=5 -> 2
// ============================================================================
public class BinarySearch {
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
