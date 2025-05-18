package Algorithms.Basic;

public class LinearithmicTime {
    public static void main(String[] args) {
        int n = 8;
        for (int i = 0; i < n; i++) {
            int j = n;
            while (j > 1) {
                j = j / 2;
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}

//O(n log n)
// Explanation: Outer loop runs n times, and inner loop runs log(n) times → total ≈ n * log(n) operations.