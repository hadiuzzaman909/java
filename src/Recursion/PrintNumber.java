package Recursion;

public class PrintNumber {

    public static  void PrintNum(int n){
        if(n<=0){
            return;
        }
        else{
            System.out.println(n);
            PrintNum(n-1);
        }
    }

    public static void main(String[] args) {
        int n=5;
        PrintNumber printNumber=new PrintNumber();
        printNumber.PrintNum(n);
    }
}
