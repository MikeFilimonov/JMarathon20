package day12.Task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {

    public static void main(String[] args) {

        List<Musician> prodigyCrew = new ArrayList<Musician>();
        prodigyCrew.add(new Musician("K.F.", 50));
        prodigyCrew.add(new Musician("J.D.", 40));
        prodigyCrew.add(new Musician("I.C.", 30));

        MusicBand prodigy = new MusicBand("Prodigy", 1988, prodigyCrew);
        prodigy.hireToCrew(new Musician("H.B.", 35));
        prodigy.expelFromCrew(new Musician("I.C.", 46));

        System.out.println(prodigy.getCrew());

        List<Musician> theBCrew = new ArrayList<>();
        theBCrew.add(new Musician("J.L.", 27));
        theBCrew.add(new Musician("R.S.", 29));

        MusicBand theBeatles = new MusicBand("The Beatles", 1960, theBCrew);
        theBeatles.hireToCrew(new Musician("some other guy", 31));
        theBeatles.hireToCrew(new Musician("random chap", 34));

        System.out.println(theBeatles.getCrew());

//      prodigy.migrateToAnotherCrew(theBeatles);
        MusicBand.migrateToAnotherCrew(prodigy, theBeatles);

        System.out.println(prodigy.getCrew());

        System.out.println(theBeatles.getCrew());

    }
}
