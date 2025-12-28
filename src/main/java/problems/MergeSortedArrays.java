package problems;

// ============================================================================
// 13. MERGE TWO SORTED ARRAYS
// Problem: Given two sorted arrays, merge them into one sorted array.
// Example: arr1=[1,3,5], arr2=[2,4,6] -> [1,2,3,4,5,6]
// ============================================================================
public class MergeSortedArrays {
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
