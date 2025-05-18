package LeetCodeProblems.Top_Interview_150;

public class Merge_Sorted_Array {

    public static int[] mergedArray(int[] nums1, int m, int[] nums2, int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;

        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
        return nums1;
    }

    public static void display_element(int[] nums){
        for (int num : nums) {
            System.out.println(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums1= {1, 2, 3, 0, 0, 0};
        int[] nums2={2,5,6};
        int m= nums1.length-nums2.length;
        int n=nums2.length;
        int[] mergedArray=mergedArray(nums1,m,nums2,n);
        display_element(mergedArray);
        System.out.println("Coding Started");
    }
}