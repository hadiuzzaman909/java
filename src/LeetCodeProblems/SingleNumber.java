package LeetCodeProblems;

public class SingleNumber {

    private int singleNum(int[] nums) {

        int result = 0;
        for(int i=0;i<nums.length;i++){
            result=result^nums[i];
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums=new int[]{2,2,1};
        SingleNumber singleNumber=new SingleNumber();
        singleNumber.singleNum(nums);


        int a=2;
        int b=1;
        int n=a|b;
        System.out.println("test "+n);
    }

}