package day6;

public class Task1 {
    public static void main(String[] args) {

        Motorbike motorbike = new Motorbike(1980, "Grey", "Honda");
        motorbike.info();
        System.out.println("Разница: " + motorbike.yearDifference(2020) + " лет");

        Car car = new Car();
        car.setYear(1995);
        car.info();
        System.out.println("Разница: " + car.yearDifference(2020) + " лет");
    }
}
