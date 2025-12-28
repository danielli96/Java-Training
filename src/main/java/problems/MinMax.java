package problems;

// ============================================================================
// 3. FIND MAXIMUM AND MINIMUM IN ARRAY
// Problem: Given an integer array, find both the maximum and minimum values.
// Example: [3, 5, 1, 9, 2] -> min: 1, max: 9
// ============================================================================
public class MinMax {
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
