package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Beatles", 1960);
        MusicBand musicBand2 = new MusicBand("Queen", 1980);
        MusicBand musicBand3 = new MusicBand("Kasabian", 2009);
        MusicBand musicBand4 = new MusicBand("Alt-J", 2010);
        MusicBand musicBand5 = new MusicBand("Arctic Monkeys", 2010);
        MusicBand musicBand6 = new MusicBand("The Cooks", 2006);
        MusicBand musicBand7 = new MusicBand("Gorillaz", 2005);
        MusicBand musicBand8 = new MusicBand("Red Hot Chilli Peppers", 1999);
        MusicBand musicBand9 = new MusicBand("Killers", 2004);
        MusicBand musicBand10 = new MusicBand("The XX", 2017);

        List<MusicBand> musicBands1 = new ArrayList<>();
        musicBands1.add(musicBand1);
        musicBands1.add(musicBand2);
        musicBands1.add(musicBand3);
        musicBands1.add(musicBand4);
        musicBands1.add(musicBand5);
        musicBands1.add(musicBand6);
        musicBands1.add(musicBand7);
        musicBands1.add(musicBand8);
        musicBands1.add(musicBand9);
        musicBands1.add(musicBand10);

        System.out.println(musicBands1);

        Collections.shuffle(musicBands1);

        System.out.println(musicBands1);

        List<MusicBand> musicBands2 = new ArrayList<>();
        for (MusicBand band : musicBands1) {
            if (band.getYear() > 2000) {
                musicBands2.add(band);
            }
        }

        System.out.println(musicBands2);
    }
}
