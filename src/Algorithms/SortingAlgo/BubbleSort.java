package Algorithms.SortingAlgo;

public class BubbleSort {

    private int[] Sorting_Method(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    private void Display_Method(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[]={7,8,12,3,9,10};
        BubbleSort obj1=new BubbleSort();
        obj1.Sorting_Method(arr);
        obj1.Display_Method(arr);
    }
}
