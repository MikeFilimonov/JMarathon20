package day6;

public class Task1 {

    public static void main(String[] args) {

        Car nio = new Car();
        nio.setMake("ET7");
        nio.setYear((short) 2022);
        nio.setColour("silver");
        nio.description();
        System.out.println(nio.vehicleAgeInGivenYear((short)2025));

        Cycle honda = new Cycle((short) 2022, "red wing", "brown");
        honda.description();
        System.out.println(honda.vehicleAgeInGivenYear((short) 2020));


    }
}
