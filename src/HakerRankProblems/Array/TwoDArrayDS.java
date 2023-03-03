package HakerRankProblems.Array;

import java.util.Scanner;

public class TwoDArrayDS {

    public static int sumOfMaxSunGlass(int[][] arr){
        int row=arr.length;
        int col=arr[0].length;
        int max_hourglass_sum=Integer.MIN_VALUE;

        for(int i=0;i<row-2;i++){
            for(int j=0;j<col-2;j++){
                int current_sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                if(max_hourglass_sum<current_sum){
                    max_hourglass_sum=current_sum;
                }
            }
        }
        return max_hourglass_sum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] arr=new int[6][6];
        System.out.println("Enter the elements:");
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
                System.out.print("A["+i+"]"+"["+j+"]= ");
                arr[i][j]=scanner.nextInt();
            }
        }
        int sum=sumOfMaxSunGlass(arr);
        System.out.println(sum);


    }
}
