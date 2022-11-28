package day9.Task2;

public class Rectangle extends  Shape{

    private double width;
    private double height;

    public Rectangle(String colour, double width, double height) {
        super(colour);
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public double area() {
        return width * height;
    }
}
