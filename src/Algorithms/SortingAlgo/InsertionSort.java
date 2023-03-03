package Algorithms.SortingAlgo;

public class InsertionSort {

    public int[] Insertion_Method(int[] arr) {
        for(int step=1;step<arr.length;step++) {
            for(int j=step;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }

    private void Display_Method(int[] arr) {
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={7,4,1,100,45,12,0,8,6,7};
        InsertionSort obj1=new InsertionSort();
        obj1.Insertion_Method(arr);
        obj1.Display_Method(arr);
    }


}
