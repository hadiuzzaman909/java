package MultiThreading.MoneyTransaction;

public class transaction {

    static int amount=10000;

    public static void main(String[] args) throws InterruptedException {
        withdraw w=new withdraw(amount);
        deposit d=new deposit(amount);
        Thread t1 = new Thread() {
            public void run() {
                w.withdrawMethod(15000);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                d.depositMethod(10000);
            }
        };


        t1.start();
        t2.start();




    }
}


