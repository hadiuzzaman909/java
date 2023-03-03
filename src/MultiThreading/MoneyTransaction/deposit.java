package MultiThreading.MoneyTransaction;

public class deposit {

    int amountOfDeposit;
    public deposit(int amount) {
        this.amountOfDeposit=amount;
    }

    public deposit() {

    }
    synchronized void depositMethod(int amount){
        System.out.println("deposit...");
        this.amountOfDeposit +=amount;
        System.out.println("deposit completed"+ amountOfDeposit);
        notify();
    }
}
