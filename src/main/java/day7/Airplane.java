package day7;

public class Airplane {
    private String name;
    private int length;

    public Airplane(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public static void compareAirplanes(Airplane a1, Airplane a2) {
        if (a1.getLength() > a2.getLength()) {
            System.out.println(a1.name + " длиннее");
        } else if (a1.getLength() < a2.getLength()) {
            System.out.println(a2.name + " длиннее");
        } else {
            System.out.println("Самолеты равны");
        }
    }

}

