package DataStructure.Linear.Array;

import java.util.Arrays;

public class ArrayLinearSearch {

    public static int[] findIndex(int[] arr, int t)
    {
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==t){
                return new int[]{i,j};
            }
        }
    }
    return arr;
    }
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 26;
        System.out.println("nums = " + Arrays.toString(nums) + ", " + "target = " + target);
        int[] index=findIndex(nums, target);
        System.out.println(Arrays.toString(index));
    }
}