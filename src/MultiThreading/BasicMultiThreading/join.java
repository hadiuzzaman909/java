package MultiThreading.BasicMultiThreading;

public class join {

    public static void main(String[] args) {

        System.out.println("Main thread started");

        Dipto t1=new Dipto();
        t1.start();
//        try{
//            Thread.sleep(1);
//        }
//        catch(InterruptedException e){
//            e.printStackTrace();
//        }

        try{
            t1.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
//        System.out.println(t1.x);
        System.out.println("Main thread ended "+t1.x);
    }
}

class Dipto extends  Thread{
    int x;
    public void run(){
        for(int i=0;i<500000;i++){
            x++;
        }
        System.out.println("Thread-1 ended "+x);
    }
}