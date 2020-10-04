package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtists> listOfArtists1 = new ArrayList<>();
        listOfArtists1.add(new MusicArtists("Glen Frey", 72));
        listOfArtists1.add(new MusicArtists("Don Henley", 73));
        listOfArtists1.add(new MusicArtists("Joe Walsh", 72));
        listOfArtists1.add(new MusicArtists("Bernie Leadon", 73));

        MusicBand musicBand1 = new MusicBand("Eagles", 1971, listOfArtists1);

        List<MusicArtists> listOfArtists2 = new ArrayList<>();
        listOfArtists2.add(new MusicArtists("Brian Johnson", 72));
        listOfArtists2.add(new MusicArtists("Malcolm Young", 67));
        listOfArtists2.add(new MusicArtists("Phil Rudd", 66));
        listOfArtists2.add(new MusicArtists("Angus Young", 65));
        listOfArtists2.add(new MusicArtists("Cliff Williams", 70));

        MusicBand musicBand2 = new MusicBand("AC/DC", 1973, listOfArtists2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.movingMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
