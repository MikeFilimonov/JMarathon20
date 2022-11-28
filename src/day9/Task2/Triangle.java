package day9.Task2;

public class Triangle extends Shape{

    private double a, b, c;

    public Triangle(String colour, double a, double b, double c) {
        super(colour);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public double area() {

        double semiPerimeter = perimeter() / 2;
        return Math.sqrt(semiPerimeter
                * (semiPerimeter - a)
                * (semiPerimeter - b)
                * (semiPerimeter - c));
    }
}
