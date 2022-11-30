package day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

    public static void main(String[] args) {

        List<String> brands = new ArrayList<>();
        brands.add("Bimmer");
        brands.add("Benz");
        brands.add("Bentley");
        brands.add("Bugatti");
        brands.add("Buick");

        int middlePosition = brands.toArray().length;
        brands.add(middlePosition, "Bertone");
        brands.remove(0);
        System.out.println(brands);

    }

}
