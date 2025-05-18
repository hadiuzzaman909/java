package Algorithms.Basic;

public class LinearTime {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}
//O(n)
//Explanation: The loop runs exactly n times — the time grows linearly with input size.