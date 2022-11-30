package day12.Task3;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    private String name;

    private int year;

    private List<String> crew;

    public MusicBand(String name, int year) {

        this.name = name;
        this.year = year;

    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
