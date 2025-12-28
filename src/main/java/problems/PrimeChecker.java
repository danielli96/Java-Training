package problems;

// ============================================================================
// 16. PRIME NUMBER CHECK
// Problem: Determine if a given number is prime (only divisible by 1 and itself).
// Example: n=7 -> true, n=8 -> false
// ============================================================================
public class PrimeChecker {
    // Thought Process:
    // - Check divisibility from 2 to sqrt(n)
    // - If divisible by any number, not prime
    // - Optimization: only check up to sqrt(n)

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    // Time: O(sqrt(n)), Space: O(1)
}
