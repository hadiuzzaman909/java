package MultiThreading.WaitNotify;

class Thread2 extends Thread {
    int total;

    public void run()
    {
        synchronized (this)
        {
            for (int i = 0; i < 10; i++) {
                total += i;
            }
            System.out.println("Thread2");
            notify();
        }
    }
}
