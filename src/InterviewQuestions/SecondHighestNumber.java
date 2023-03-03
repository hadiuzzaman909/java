package InterviewQuestions;

public class SecondHighestNumber {

    private static int resultMethod(int[] arr) {

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        int count=0;
        int result=0;
        for(int i=0;i<arr.length;i++){
            System.out.println(count);
            for(int j=count;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    arr[i+1]=arr[j];
                    result++;
                    break;
                }
                count++;
            }
        }

        for(int x=0;x<=result;x++){
            System.out.println("x: "+arr[x]);
        }
        return arr[1];
    }

    public static void main(String[] args) {
        int[] arr={-1, 3, 4,4,0};
        int result=resultMethod(arr);
        System.out.println("result: "+result);
    }

}
