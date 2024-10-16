package task3;

public class Pyramid extends Shape {

    private double s;
    private double h;

    public Pyramid(double s, double h) {
        super(0.33 * h * s);
    }
}