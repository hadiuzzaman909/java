package DataStructure.Linear.Stack.DynamicStack;
public class StackMethod {

    int stack[]=new int[5];
    int top=0;
    int pushFlag=0;
    int popFlag=0;

    public void push(int data) {

        if(top==5){
            if( pushFlag==0){
                System.out.println("Stack is Full");
                pushFlag++;
            }

        }
        else{
            stack[top]=data;
            top++;
        }

    }

    public void show() {
        for(int i:stack){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public int pop() {
        int data = 0;

        if(isEmpty()){
            if(popFlag==0){
                System.out.println("Stack is empty");
                popFlag++;
            }

        }
        else{
            top--;
            data=stack[top];
            stack[top]=0;

        }
        return data;
    }

    public int peek() {
        int data;
        data=stack[top-1];
        return data;
    }

    public int size() {
        return top;
    }

    public boolean  isEmpty(){
        return top<=0;
    }
}
