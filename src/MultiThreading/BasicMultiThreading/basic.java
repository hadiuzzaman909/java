package MultiThreading.BasicMultiThreading;

public class basic {

    public static void main(String[] args) throws InterruptedException{
        A obj=new A();
        obj.start();  //obj.run() shouldn't use because of it using main thread

        for(int i=0;i<10;i++){
            System.out.println(2);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    static class A extends Thread{
        @Override
        public void run(){
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
}
