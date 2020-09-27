package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boing", 2002, 45.5, 7.5);

        airplane.setYear(2005);
        airplane.setLength(37.8);
        airplane.fillUp(100.0);
        airplane.fillUp(140.5);
        airplane.info();
    }
}
