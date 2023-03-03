package LeetCodeProblems;

public class SearchInsertPosition {

    private int position(int[] nums, int target) {

        if(nums[0]>target){
            int i=0;
            System.out.println(i);
            return i;
        }
        else{
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == target) {
                        System.out.println(i);
                        return i;
                    } else if (count == nums.length - 1) {
                        System.out.println(i + 1);
                        return i + 1;
                    } else if (count != nums.length - 1) {
                        if (nums[i] < target && nums[i + 1] > target) {
                            System.out.println(i + 1);
                            return i + 1;
                        }
                    }
                count++;
                }
            }
        return target;
}
    public static void main(String[] args) {
        int[] nums=new int[]{-1,3,5,6};
        int target=1;
        SearchInsertPosition insert_position=new SearchInsertPosition();
        insert_position.position(nums,target);
    }
}
