package day9.Task2;

public class ShapeTest {

    public static void main(String[] args) {

        double radius = 4;
        Circle c = new Circle("red", radius);
        System.out.printf("%sCircle, r: %f, P: %f, S: %f\r\n", c.getColour(), radius, c.perimeter(), c.area());


        double width = 8, height = 10;
        Rectangle r = new Rectangle("blue", width, height);
        System.out.printf("%sRect, a*b: %f * %f, P: %f, S: %f\r\n", r.getColour(), width, height,  r.perimeter(), r.area());

        double a0 = 2, a1 = 4, a2 = 6;

        Triangle t = new Triangle("white", a0, a1, a2);
        System.out.printf("%sTriangle, a, b, c: %f, %f, %f; P: %f, S: %f\r\n", t.getColour(), a0, a1, a2, t.perimeter(), t.area());

        Shape[] shapes = {
                new Circle("red", 4),
                new Circle("black", 3),
                new Rectangle("blue", 5, 8),
                new Rectangle("red", 9, 6),
                new Triangle("red", 1, 2, 3)

        };


        System.out.printf("red perimeter: %f, red area: %f \r\n", redPerimeter(shapes), redArea(shapes) );

    }

    public static double redPerimeter(Shape[] shapes){

        double result = 0;
        for (int a = 0; a < shapes.length; a++){

            Shape shape = shapes[a];

            if (shape.getColour().equals("red"))
                result+=shape.perimeter();

        }

        return result;

    }

    public static double redArea(Shape[] shapes){

        double result = 0;
        for (int a = 0; a < shapes.length; a++){

            Shape shape = shapes[a];

            if (shape.getColour().equals("red"))
                result+=shape.area();

        }

        return result;

    }

}
