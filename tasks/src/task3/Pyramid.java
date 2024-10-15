package task3;

public class Pyramid extends Shape {

    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
        volume = 0.33 * getH() * getS();
    }

    public double getS() {
        return s;
    }

    public double getH() {
        return h;
    }
}