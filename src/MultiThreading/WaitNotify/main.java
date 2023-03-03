package MultiThreading.WaitNotify;

public class main {

        public static void main(String[] args) throws InterruptedException {

            Thread2 objB = new Thread2();
            Thread3 objC = new Thread3();

            objB.start();

            synchronized (objB)
            {
                try {
                    System.out.println("Waiting for Thread 2 to complete...");

                    objB.wait();
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Total is: " + objB.total);
            }

            objC.start();
            synchronized (objC)
            {
                System.out.println("Waiting for Thread 3 to complete...");

                    objC.wait();
                System.out.println("Total is: " + objC.total);
            }
        }

}
