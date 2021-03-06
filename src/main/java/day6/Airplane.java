package day6;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private double fuel;

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", Год выпуска: " + year + ", Длина: " + length + ", Вес: " + weight + ", Количество топлива в баке: " + fuel);
    }

    public void fillUp(double fuel) {
        this.fuel += fuel;
    }
}

