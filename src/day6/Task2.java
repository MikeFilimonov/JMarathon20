package day6;

public class Task2 {
    public static void main(String[] args) {

        Plane boeing = new Plane("Boeing", 2020,
                180f, 30f);

        boeing.setYear(2018);
        boeing.setLengthInMeters(390f);

        boeing.fillUp(-1500f);
        boeing.fillUp(2000f);

        boeing.info();
    }
}
