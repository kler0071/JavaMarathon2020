package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Glen Frey");
        members1.add("Don Henley");
        members1.add("Joe Walsh");
        members1.add("Bernie Leadon");

        MusicBand musicBand1 = new MusicBand("Eagles", 1971, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Brian Johnson");
        members2.add("Malcolm Young");
        members2.add("Phil Rudd");
        members2.add("Angus Young");
        members2.add("Cliff Williams");

        MusicBand musicBand2 = new MusicBand("AC/DC", 1973, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.movingMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
