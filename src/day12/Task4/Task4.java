package day12.Task4;

import day12.Task4.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {

        List<String> prodigyCrew = new ArrayList<String>();
        prodigyCrew.add("K.F.");
        prodigyCrew.add("J.D.");
        prodigyCrew.add("I.C.");

        MusicBand prodigy = new MusicBand("Prodigy", 1988, prodigyCrew);
        prodigy.hireToCrew("H.B.");
        prodigy.expellFromCrew("I.C.");

        System.out.println(prodigy.getCrew());

        List<String> theBCrew = new ArrayList<>();
        theBCrew.add("J.L.");
        theBCrew.add("R.S.");

        MusicBand theBeatles = new MusicBand("The Beatles", 1960, theBCrew);
        theBeatles.hireToCrew("some other guy");
        theBeatles.hireToCrew("random chap");

        System.out.println(theBeatles.getCrew());

//      prodigy.migrateToAnotherCrew(theBeatles);
        MusicBand.migrateToAnotherCrew(prodigy, theBeatles);

        System.out.println(prodigy.getCrew());

        System.out.println(theBeatles.getCrew());

    }
}
