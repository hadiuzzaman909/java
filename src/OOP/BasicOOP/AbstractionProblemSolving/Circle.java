package OOP.BasicOOP.AbstractionProblemSolving;

public class Circle extends Rectangle{

    public Circle(double dim1) {
        super(dim1, dim1);
    }

    public Circle() {
        super();

    }

    @Override
    void area() {
        double result=Math.PI*dim1*dim2;
        System.out.println("Circle area: "+result);
    }


}
