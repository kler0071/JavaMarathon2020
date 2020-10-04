package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtists> members;

    public MusicBand(String name, int year, List<MusicArtists> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtists> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtists> members) {
        this.members = members;
    }

    public static void movingMembers(MusicBand mb1, MusicBand mb2) {
        for (MusicArtists member : mb1.getMembers()) {
            mb2.getMembers().add(member);
        }
        mb1.getMembers().clear();
    }

    public void printMembers() {
        System.out.println(this.members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}