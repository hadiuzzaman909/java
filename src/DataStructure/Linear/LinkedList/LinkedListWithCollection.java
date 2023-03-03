package DataStructure.Linear.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListWithCollection {

    public static void main(String args[]){
        LinkedList<String> list= new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addLast("this");
        System.out.println(list);
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");

        list.removeFirst();

        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.addFirst("is");
        list.addFirst("list");
        list.add("d");
        Collections.reverse(list);
        System.out.println(list);
    }
}
