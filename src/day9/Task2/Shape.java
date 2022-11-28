package day9.Task2;

public abstract class Shape {

    private String colour;

    public Shape(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public abstract double perimeter();
    public abstract double area();

}
