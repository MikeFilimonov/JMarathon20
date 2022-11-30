package day12.Task5;

import java.util.List;

public class MusicBand {

    private String  name;
    private int year;

    private List<Musician> crew;

    public List<Musician> getCrew() {
        return crew;
    }

    public void hireToCrew(Musician buddy){
        crew.add(buddy);
    }

    public void expelFromCrew(Musician buddy){

        int buddyIndex = crew.indexOf(buddy);
        if (buddyIndex > -1)
            crew.remove(buddyIndex);

    }


    @Deprecated
    public void migrateToAnotherCrew (MusicBand newBand){

        for ( Musician buddy: crew) {

           if (!newBand.crew.contains(buddy))
               newBand.crew.add(buddy);
        }

        crew.clear();

    }

    public static void migrateToAnotherCrew(MusicBand sourceBand, MusicBand newBand){

        for (Musician buddy: sourceBand.crew) {

            if (!newBand.crew.contains(buddy))
                newBand.crew.add(buddy);
        }
            sourceBand.crew.clear();
    }

    public MusicBand(String name, int year, List<Musician> crew) {

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
