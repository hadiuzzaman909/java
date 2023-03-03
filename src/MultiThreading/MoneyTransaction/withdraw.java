package MultiThreading.MoneyTransaction;

public class withdraw {
    int amount1;

    public withdraw(int amount) {
        this.amount1=amount;
    }

    deposit d=new deposit();
    int updateBalance=d.amountOfDeposit;

    synchronized void withdrawMethod(int amount){
        System.out.println(updateBalance);
        System.out.println("withdraw.....");

        if(this.amount1<amount){
            System.out.println("Less balance,wait for deposit...");
            try{
                wait();
            }
            catch(Exception e){

            }
        }

        this.updateBalance -=amount;
        System.out.println("withdraw completed");
        System.out.println("current balance "+this.updateBalance);

    }
}
