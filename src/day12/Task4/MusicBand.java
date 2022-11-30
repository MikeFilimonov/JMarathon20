package day12.Task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {

    private String name;

    private int year;

    private List<String> crew;

    public List<String> getCrew() {
        return crew;
    }

    public void setCrew(List<String> crew) {
        this.crew = crew;
    }

    public void hireToCrew(String buddy){
        crew.add(buddy);
    }

    public void expellFromCrew(String buddy){

        int buddyIndex = crew.indexOf(buddy);
        if (buddyIndex > -1)
            crew.remove(buddyIndex);

    }


    @Deprecated
    public void migrateToAnotherCrew (MusicBand newBand){

        for ( String buddy: crew) {

           if (newBand.crew.indexOf(buddy) == -1)
               newBand.crew.add(buddy);
        }

        crew.clear();

    }

    public static void migrateToAnotherCrew(MusicBand sourceBand, MusicBand newBand){

        for (String buddy: sourceBand.crew) {

            if (newBand.crew.indexOf(buddy) == -1)
                newBand.crew.add(buddy);
        }
            sourceBand.crew.clear();
    }

    public MusicBand(String name, int year, List<String> crew) {

        this.name = name;
        this.year = year;
        this.crew = crew;
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
