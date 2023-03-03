package DataStructure.Linear.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int size=scanner.nextInt();
        int[] grades=new int[size];

        for(int i=0;i<size;i++){
            int x=scanner.nextInt();
            grades[i]=x;
        }
        System.out.println(Arrays.toString(grades));


//                Scanner scanner = new Scanner(System.in);
//
//                System.out.println("Enter numbers, with 0 to end");
//                List<Integer> list = new ArrayList<>();
//                while (true) {
//                    int input = scanner.nextInt();
//                    if (input == 0) {
//                        break;
//                    }
//                    list.add(input);
//                }
//                System.out.println("You entered: " + list);



    }

}


