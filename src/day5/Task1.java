package day5;

public class Task1 {


    public static void main(String[] args) {


        Car tesla = new Car();
        tesla.setYear((short)2022);
        tesla.setMake("Model S");
        tesla.setColour("Navy");

        System.out.printf("Tesla, make:%s, colour:%s (%d) ",
                tesla.getMake(),
                tesla.getColour(),
                tesla.getYear());

    }

}
