package Algorithms.SortingAlgo;

public class QuickSort {
    public static int partition(int arr[],int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //temp
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
    }
    private static void Quick_Method(int[] arr, int low, int high) {

        if(low<high){
            int pidx=partition(arr,low,high);
            Quick_Method(arr,low,pidx-1);
            Quick_Method(arr,pidx+1,high);
        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2};
        int n=arr.length-1;
        Quick_Method(arr,0,n);
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
