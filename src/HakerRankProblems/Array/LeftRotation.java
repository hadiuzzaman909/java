package HakerRankProblems.Array;

import java.util.Scanner;

public class LeftRotation {

    public static int[] rotation(int rotation,int[] arr){

        for(int i=0;i<rotation;i++){
            int r=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=r;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int arraySize;
        int rotation;
        arraySize=scanner.nextInt();
        rotation=scanner.nextInt();
        int[] arr=new int[arraySize];
        for(int i=0;i<arraySize;i++){
            arr[i]=scanner.nextInt();
        }
        int[] result=rotation(rotation,arr);
        for(int x:result){
            System.out.print(x+" ");
        }
    }
}
