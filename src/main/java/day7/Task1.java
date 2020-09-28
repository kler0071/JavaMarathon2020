package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing-737", 40);
        Airplane airplane2 = new Airplane("SuperJet", 30);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}