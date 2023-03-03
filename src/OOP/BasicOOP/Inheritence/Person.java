package OOP.BasicOOP.Inheritence;

public class Person {
    private String name;
    private String age;

    void displayInformation(){

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    void uto(){
        System.out.println("ll");
    }




    //        displayInformationPerson(){
    //Setter Getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
