package problems;

// ============================================================================
// 4. FIBONACCI SEQUENCE
// Problem: Calculate the nth Fibonacci number where F(0)=0, F(1)=1, and F(n)=F(n-1)+F(n-2).
// Example: n=5 -> 5 (sequence: 0, 1, 1, 2, 3, 5)
// ============================================================================
public class Fibonacci {
    // Thought Process:
    // - Base cases: fib(0) = 0, fib(1) = 1
    // - Each number is sum of previous two
    // - Can use recursion, iteration, or memoization

    // Iterative (most efficient)
    public static int fib(int n) {
        if (n <= 1) return n;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // Recursive (simple but inefficient)
    public static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // Time: O(n) iterative, O(2^n) recursive
    // Space: O(1) iterative, O(n) recursive (call stack)
}
