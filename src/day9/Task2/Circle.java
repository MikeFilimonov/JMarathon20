package day9.Task2;

public class Circle extends Shape{

    private double radius;

    public Circle(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
