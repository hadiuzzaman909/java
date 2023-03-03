package OOP.BasicOOP.AbstractionProblemSolving;

public class Rectangle extends Shape{
    int number=10;
    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);

    }

    public Rectangle() {
        super();

    }


    @Override
    void area() {
        double result=dim1*dim2;
        System.out.println("Rectangular area: "+result);
    }
    void number(){
        System.out.println("The number is "+number);
    }

}
