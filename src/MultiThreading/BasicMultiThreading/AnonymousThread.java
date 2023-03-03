package MultiThreading.BasicMultiThreading;

public class AnonymousThread {

    public static void main(String[] args) {
        Runnable obj=new Runnable() {
            public void run() {
                System.out.println("sajib");
            }
        };

    Thread t1=new Thread(obj);
    t1.start();
    }
}
