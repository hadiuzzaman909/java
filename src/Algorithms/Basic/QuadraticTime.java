package Algorithms.Basic;

public class QuadraticTime {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("i=" + i + ", j=" + j);
            }
        }
    }
}

// O(n²)
//Explanation: Two nested loops — each runs n times. So total operations = n × n.