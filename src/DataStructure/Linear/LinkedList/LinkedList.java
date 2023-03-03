package DataStructure.Linear.LinkedList;

//Note
//Variable Size
//Non-Contiguous Memory
//Insert in O(1)
//Search in O(n)

public class LinkedList {

    private int size;

    public LinkedList() {
        this.size=0;
    }

    Node head;
    class Node{
            String data;
            Node next;
            Node(String data){
                this.data=data;
                this.next=null;
                size++;
            }
        }

        //Add-First
    public void addFirst(String data){

        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //Add-Last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next !=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    //Delete-First
    public void deleteFirst(){
        if(head==null){
            System.out.println("The last is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //Delete-Last
    public void deleteLast(){
        if(head==null){
            System.out.println("The last is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next !=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public int getSize(){
        return size;
    }

    //print
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode !=null){
            System.out.print (currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("null");
    }

    public void reverseIterate(){
        if(head==null || head.next==null){
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode !=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }

    public Node reverseRecursive(Node head){

        if(head==null || head.next==null){
            return head;
        }
        Node newNode=reverseRecursive(head.next);
        head.next.next=head;
        System.out.println("time");
        head.next=null;

        return newNode;
    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");
        list.printList();

        list.deleteFirst();
        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

        list.deleteFirst();
        list.deleteFirst();
        list.printList();

        list.addFirst("5");
        list.addFirst("4");
        list.addFirst("3");
        list.addFirst("2");
        list.addFirst("1");
        list.printList();

        list.reverseIterate();
        list.printList();

        list.head=list.reverseRecursive(list.head);
        list.printList();
        System.out.println(list);

    }
}
