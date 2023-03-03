package LeetCodeProblems;

public class MajorityElement {

    private int majorityElement(int[] nums) {
        float value1=nums.length;
        float value2=2;
        float major = value1 / value2;


        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            System.out.println(count);
            if(count>=major){
                System.out.println(nums[i]);
            }
        }
        return (int) major;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{6,5,5};
        MajorityElement majority_Element=new MajorityElement();
        majority_Element.majorityElement(nums);
    }
}
