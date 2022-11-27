package day5;

public class Task2 {

    public static void main(String[] args) {
        Cycle beast = new Cycle((short) 1979, "Yamaha", "black");
        System.out.printf("Cycle, make: %s (%d), colour: %s",
                beast.getMake(), beast.getYear(), beast.getColour());
    }

}
