package day12.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {

        List<MusicBand> allBands = new ArrayList<>();

        allBands.add(new MusicBand("Beatles", 1968));
        allBands.add(new MusicBand("SOAD", 2004));
        allBands.add(new MusicBand("Nirvana", 1990));
        allBands.add(new MusicBand("The 69 eyes", 1990));
        allBands.add(new MusicBand("BFMV", 2003));
        allBands.add(new MusicBand("Franz Ferdinand", 2000));
        allBands.add(new MusicBand("Slipknot", 1997));
        allBands.add(new MusicBand("Blind guardian", 1970));
        allBands.add(new MusicBand("Mushroomhead", 1993));
        allBands.add(new MusicBand("Three days grace", 2004));
        allBands.add(new MusicBand("Electric six", 2005));

        Collections.shuffle(allBands);

        List<MusicBand> postMillennialBands = new ArrayList<>();

        for ( MusicBand band: allBands) {
            if (band.getYear() >= 2000)
                postMillennialBands.add(band);
        }

        System.out.println(allBands.toString());
        System.out.println(postMillennialBands.toString());

    }

}
