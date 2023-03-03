package HakerRankProblems.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SparseArrays {
    public static List<Integer> result(List<String> stringList, List<String> queries){

        List<Integer> output=new ArrayList<>();
        int count=0;
        for(int i=0;i<queries.size();i++){
            for(int j=0;j< stringList.size();j++){
                if(queries.get(i).equals(stringList.get(j))){
                    count++;
                }
            }
            output.add(count);
            count=0;
        }
        for(int x: output){
            System.out.print(x+" ");
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int stringSize=3;
//        System.out.print("Enter the Strings Size:");
//        stringSize=scanner.nextInt();

        List<String> arr = new ArrayList<>();
        System.out.println(stringSize);


        for(int i=0;i<stringSize;i++){
            arr.add(scanner.nextLine());
        }
        for(String x: arr){
            System.out.print(x);
        }

        int querySize=3;
//        System.out.print("Enter the Query Size:");
//        querySize=scanner.nextInt();
        List<String> queries = new ArrayList<>();
        System.out.println("Enter the Strings: ");
        for(int i=0;i<querySize;i++){
            queries.add(scanner.nextLine());
        }
        result(arr,queries);
    }
}
