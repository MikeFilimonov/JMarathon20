package day5;

public class Cycle {

    private short year;
    private String make;
    private String colour;

    public short getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public String getColour() {
        return colour;
    }

    public Cycle(short year, String make, String colour){

        this.year = year;
        this.make = make;
        this.colour = colour;
    }
}
