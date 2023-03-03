package LeetCodeProblems;

public class RemoveElement {

    private int removeNums(int[] nums, int val) {

        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        for (int i = 0; i < j; i++)
        {
            System.out.print(nums[i] + " ");
        }
        return j;


//        for(int k=j;k< nums.length;k++){
//            nums[k]=0;
//        }

//        for (int i = 0; i < nums.length; i++)
//        {
//            System.out.print(nums[i] + " ");
//        }
    }

    public static void main(String[] args) {
        int[] nums=new int[]{0,1,2,2,3,0,4,2};
        int val=2;
        RemoveElement obj1=new RemoveElement();
        obj1.removeNums(nums,val);
    }

}
