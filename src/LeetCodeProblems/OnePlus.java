package LeetCodeProblems;

public class OnePlus {

    public int[] plusOne(int[] digits) {

        //solve-1
//        int sum=0;
//        for(int i=0;i<digits.length;i++){
//            sum=sum*10+digits[i];
//        }
//
//        int newSum=sum+1;
//        String temp = Integer.toString(newSum);
//
//        int[] result=new int[temp.length()];
//        for(int i=0;i<result.length;i++){
//            result[i]=newSum%10;
//            newSum=newSum/10;
//        }
//        int[] result2=new int[temp.length()];
//        int resultLength=result.length;
//        for (int j = 0; j < result.length; j++)
//        {
//            result2[j]=result[resultLength-1];
//            resultLength--;
//        }
//
//        for (int i = 0; i < result2.length; i++)
//        {
//            System.out.print(result2[i] + " ");
//        }
//        return result2;


        //solve-2
        int digits_length=digits.length;
        for(int i=digits_length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]=digits[i]+1;
                break;
            }
            else{
                digits[i]=0;
            }
        }

        for (int i = 0; i < digits.length; i++)
        {
            System.out.print(digits[i] + " ");
        }
        System.out.println();
        if(digits[0]==0){
            int[] newDigits=new int[digits_length+1];
            newDigits[0]=1;
            for (int i = 0; i < newDigits.length; i++)
            {
                System.out.print(newDigits[i] + " ");
            }
            return newDigits;
        }

        return digits;
    }

    public static void main(String[] args) {

        int[] arr = {9,9,9,9,9};
        OnePlus obj1 = new OnePlus();
        obj1.plusOne(arr);

    }
}
