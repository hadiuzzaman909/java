package MultiThreading.BasicMultiThreading;

//public class isAlive_Daemon {
//
//    public static void main(String[] args) {
//
//        System.out.println("Main thread started");
//
//        Sajib t1=new Sajib();
//        t1.setDaemon(true);
//        t1.start();
//        System.out.println("Main thread ended "+t1.x);
//    }
//}
//
//class Sajib extends  Thread{
//    int x;
//    public void run(){
//        for(int i=0;i<100000;i++){
//            x++;
//        }
//        System.out.println("Thread-0 ended "+x);
//        for(int i=0;i<200000;i++){
//            x++;
//        }
//        System.out.println("Thread-0 ended "+x);
//        for(int i=0;i<300000;i++){
//            x++;
//        }
//        System.out.println("Thread-0 ended "+x);
//    }
//}
