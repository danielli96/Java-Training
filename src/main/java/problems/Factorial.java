package problems;

// ============================================================================
// 15. FACTORIAL
// Problem: Calculate the factorial of a number n (n! = n × (n-1) × ... × 1).
// Example: n=5 -> 120 (5×4×3×2×1)
// ============================================================================
public class Factorial {
    // Thought Process:
    // - n! = n * (n-1) * (n-2) * ... * 1
    // - Base case: 0! = 1, 1! = 1
    // - Can use iteration or recursion

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative number");

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive
    public static long factorialRecursive(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative number");
        if (n <= 1) return 1;
        return n * factorialRecursive(n - 1);
    }

    // Time: O(n), Space: O(1) iterative, O(n) recursive
}
