package MultiThreading.WaitNotify;

class Thread3 extends Thread {
    int total;

    public void run()
    {
        synchronized (this)
        {
            for (int i = 0; i < 10; i=i+2) {
                total += i;
            }
            System.out.println("Thread3");
            notify();
        }
    }
}