package JavaBasic;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the total names:");
        int total=scanner.nextInt();
        String[] arr=new String[total];
        System.out.println("Enter the names:");

        for(int i=0;i<total;i++){
            arr[i]=scanner.nextLine();
        }

        System.out.println("The result is :");
        for(String x:arr){
            System.out.println(x);
        }
    }
}
