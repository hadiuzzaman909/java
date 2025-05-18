package Algorithms.Basic;

public class ConstantTime {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(arr[2]); // Always takes 1 step
    }
}
//O(1)
//Explanation: Accessing any element by index takes the same amount of time, no matter the array size.