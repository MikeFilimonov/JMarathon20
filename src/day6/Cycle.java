package day6;

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

    public void description(){
        System.out.println("Это мотоцикл");
    }
    public short vehicleAgeInGivenYear(short givenYear){

        short result;

        if (givenYear - year < 0){
            result = 0;
        } else{
            result = (short) (givenYear - year);
        };

        return result;

    }


}
