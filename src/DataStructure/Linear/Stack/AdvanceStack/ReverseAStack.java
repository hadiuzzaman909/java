package DataStructure.Linear.Stack.AdvanceStack;

import java.util.Stack;

public class ReverseAStack {
    private static void pushAtBottom(int data, Stack<Integer> s) {
        //3//2//1
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();//1//2
        pushAtBottom(data,s);//1
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top=s.pop();
        System.out.println("stack Length: "+s.toArray().length);
        reverse(s);
        pushAtBottom(top,s);
    }

    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("stack  main: "+s.toArray().length);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
