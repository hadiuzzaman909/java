package Recursion;

public class Factorial {

    public static int factorialNumber(int n){
        if(n==1 || n==0){
            return 1;
        }

        int fact_num=factorialNumber(n-1);
        int fact_ans=n*fact_num;
        return fact_ans;
    }

    public static void main(String[] args) {
        int n=factorialNumber(5);
        System.out.println(n);
    }
}
