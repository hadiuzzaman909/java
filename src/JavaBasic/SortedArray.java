package JavaBasic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortedArray {
    public static void main(String[] args) {
        int[] A = {-2, 12, 45, -9, 1, 5, 12, -2};

        // Sort the array
        Arrays.sort(A);

        // Remove duplicates using a set
        Set<Integer> set = new HashSet<>();
        for (int num : A) {
            set.add(num);
        }

        // Convert the set back to an array
        int[] uniqueSortedArray = new int[set.size()];
        int index = 0;
        for (int num : set) {
            uniqueSortedArray[index++] = num;
        }

        // Print the final array
        System.out.println(Arrays.toString(uniqueSortedArray));
    }
}

