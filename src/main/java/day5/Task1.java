package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setYear(2005);
        car.setColor("blue");
        car.setModel("Mazda");

        System.out.println(car.getYear());
        System.out.println(car.getColor());
        System.out.println(car.getModel());
    }
}
