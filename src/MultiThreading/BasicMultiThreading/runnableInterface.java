package MultiThreading.BasicMultiThreading;

public class runnableInterface {

    public static void main(String[] args) {
        myThread t1=new myThread();
        Thread t2=new Thread(t1,"thread1");
        t2.start();
        System.out.println(Thread.currentThread().getName());
    }
    }

    class myThread extends A implements Runnable{
        @Override
        public void run(){
            System.out.println(Thread.currentThread().getName());
            for(int i=0;i<10;i++){
                System.out.println(1);
                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

    class A {

    }
