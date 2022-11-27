package day7;

public class Task1 {

    public static void main(String[] args) {

        Plane f35 = new Plane("Lockheed-Martin", 2022, 15, 5);
        Plane boeing747 = new Plane("boeing", 2000, 85, 150);
        Plane.comparePlaneLength(f35, boeing747);

    }

}
