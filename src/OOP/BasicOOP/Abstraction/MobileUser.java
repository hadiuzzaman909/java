package OOP.BasicOOP.Abstraction;

public abstract class MobileUser {

    //Non-Abstract method
    void call(){
        System.out.println("Call Method");
    }

    //Abstract method
    abstract void sendMessage();
}
