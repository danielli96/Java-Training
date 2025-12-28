package problems;

// ============================================================================
// 18. FIND SECOND LARGEST ELEMENT
// Problem: Find the second largest element in an array (handle duplicates properly).
// Example: [3,5,1,9,9,2] -> 5 (not 9, which is the largest)
// ============================================================================
public class SecondLargest {
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
