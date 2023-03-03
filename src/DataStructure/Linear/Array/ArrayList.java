package DataStructure.Linear.Array;

import java.util.Collections;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<Integer> number=new java.util.ArrayList<>();
        System.out.println("Initial Size: "+ number.size());

        number.add(10);
        number.add(0,20);
        number.add(30);
        System.out.println("Numbers are:"+number);
        System.out.println("Size of Numbers: "+ number.size());
        number.remove(2);
        System.out.println("Numbers are:"+number);
        number.removeAll(number);
        System.out.println("Numbers are:"+number);
        number.add(50);
        System.out.println("Numbers are:"+number);
        number.clear();
        //isEmpty()
        //contains()
        //indexOf()
        //set
        //get
        //addAll
        //equals
        //sort
        //
        System.out.println("Numbers are:"+number);
        number.add(10);
        number.add(20);
        number.add(30);
        System.out.println("Numbers are:"+number);
        number.set(0,100);
        System.out.println("Numbers are:"+number);
        int x=number.get(1);
        System.out.println("the number is:"+x);

        Collections.sort(number);
        System.out.println("Sorted Numbers are in ascending :"+number);

        Collections.sort(number,Collections.reverseOrder());
        System.out.println("Sorted Numbers are in descending :"+number);
    }
}
