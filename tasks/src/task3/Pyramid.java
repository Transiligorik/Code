package task3;

public class Pyramid extends Shape {

    private double s;
    private double h;

    public Pyramid(double s, double h) {
        super.getVolume(d);
        this.s = s;
        this.h = h;
        d = 0.33 * getH() * getS();
    }

    public double getS() {
        return s;
    }

    public double getH() {
        return h;
    }
}