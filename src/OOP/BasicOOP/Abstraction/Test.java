package OOP.BasicOOP.Abstraction;

public class Test {
    public static void main(String[] args){

//        MobileUser mobileUser=new MobileUser();

        //reference variable
        MobileUser mobileUser;

        mobileUser=new Rahim();
        mobileUser.call();
        mobileUser.sendMessage();

        mobileUser=new Karim();
        mobileUser.sendMessage();
    }
}
