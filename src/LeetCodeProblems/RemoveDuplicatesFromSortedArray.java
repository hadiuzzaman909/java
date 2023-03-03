package LeetCodeProblems;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    private void remove_duplicate(int[] nums) {

        Arrays.sort(nums);
        int count=0;
        int result=0;

        for(int i=0;i<nums.length;i++){

//            System.out.println("I["+i+"]: "+nums[i]);
            System.out.println("i: "+i);
            System.out.println("count of I: "+count);

            for(int j=count;j<nums.length;j++){

//                System.out.println("J: "+j);
//                System.out.println("J["+j+"]: "+nums[j]);
                System.out.println("j: "+j);
                System.out.println("count of J: "+count);

                if(nums[i]!=nums[j]){
                    nums[i+1]=nums[j];
                    result++;
                    break;
                }
                count++;
            }
        }

//        int newResult=result+1;
//        System.out.println(newResult);
//        System.out.print("nums: ");

        for(int r=0;r<=result;r++){
            System.out.print(nums[r]+" ");
        }

//        return nums[result];
    }

    public static void main(String[] args) {
         int[] nums=new int[]{0,0,1,1,2,2,3,3,4};
         RemoveDuplicatesFromSortedArray remove_duplicates_from_sorted_array=new RemoveDuplicatesFromSortedArray();
         remove_duplicates_from_sorted_array.remove_duplicate(nums);
    }

}
