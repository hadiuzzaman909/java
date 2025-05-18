package Algorithms.Basic;

public class LogarithmicTime {
    public static void main(String[] args) {
        int n = 16;
        while (n > 1) {
            n = n / 2;
            System.out.println(n);
        }
    }
}
//O(log n)
//Explanation: This loop runs log₂(n) times. It keeps cutting n in half.
