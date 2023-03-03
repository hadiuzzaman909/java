package OOP.BasicOOP.Inheritence;

public class Teacher extends Person{
    private String qualification;

    public Teacher(String name, String age, String qualification) {
       this.setName(name);
       this.setAge(age);
       this.qualification=qualification;
    }

    @Override
    void displayInformation(){
        System.out.println("Name: "+getName());
        System.out.println("Age: "+getAge());
        System.out.println("qualification: "+qualification);
    }



    //        displayInformationPerson();
    //Getter Setter
    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

}
