package day5;

public class Car {


    public Car(){};
    private short year;
    private String colour;
    private String make;

    public void setYear(short year){
        this.year = year;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public void setMake(String make){
        this.make = make;
    }

    public short getYear(){
        return year;
    }

    public String getColour(){
        return colour;
    }

    public String getMake(){
        return make;
    }


}
