package LeetCodeProblems.Top_Interview_150;

public class Remove_Element {

    private int[] remove_element(int[] nums, int val){
        int count=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!= val){
                nums[count]=nums[i];
                count++;
            }
        }
        return nums;
    }
    
    private void display_element(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int[] nums={2,3,2,3,1};
        int val=3;
        Remove_Element obj=new Remove_Element();
        obj.remove_element(nums,val);
        obj.display_element(nums);
    }
}
