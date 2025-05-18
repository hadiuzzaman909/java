package Algorithms.SortingAlgo;

public class SelectionSort {

    private int[] Selection_Method(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }

    private void Display_Method(int[] arr) {
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={10,20,100,5,80,6,1,0};
        SelectionSort obj1=new SelectionSort();
        obj1.Selection_Method(arr);
        obj1.Display_Method(arr);
    }

}