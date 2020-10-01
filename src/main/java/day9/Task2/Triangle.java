package day9.Task2;

public class Triangle extends Figure {
    private double sideLength1;
    private double sideLength2;
    private double sideLength3;

    public Triangle(double sideLength1, double sideLength2, double sideLength3, String color) {
        super(color);
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        this.sideLength3 = sideLength3;
    }

    @Override
    public double area() {
        double p = (sideLength1 + sideLength2 + sideLength3) / 2;
        return Math.sqrt(p * (p - sideLength1) * (p - sideLength2) * (p - sideLength3));

    }

    @Override
    public double perimeter() {
        return sideLength1 + sideLength2 + sideLength3;
    }
}
