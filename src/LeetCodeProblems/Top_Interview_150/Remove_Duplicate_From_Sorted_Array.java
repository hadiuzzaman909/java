package LeetCodeProblems.Top_Interview_150;

public class Remove_Duplicate_From_Sorted_Array {

    private int[] remove_element(int[] nums){
        int count=0;
        for(int i=count+1;i<nums.length;i++){
            if(nums[count]!=nums[i]){
                count++;
                nums[count] = nums[i];
            }
        }
        return nums;
    }

    private void display_element(int[] nums){
        for (int num : nums) {
            System.out.println(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        Remove_Duplicate_From_Sorted_Array obj=new Remove_Duplicate_From_Sorted_Array();
        obj.remove_element(nums);
        obj.display_element(nums);
    }
}
