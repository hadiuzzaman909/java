package JavaBasic;

public class ForEach {
    public static void MaxMin(int[] num){
        int max=num[0];
        int min=num[0];
        for(int x:num){
            if(x>max){
                max=x;
            }
            if(x<min){
                min=x;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] num={14,256,36,43,35,4};
//        MaxMin(num);

        int smallest=Integer.MAX_VALUE;
        System.out.println("smallest :"+smallest);
    }
}
