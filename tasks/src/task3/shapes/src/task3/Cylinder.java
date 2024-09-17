package task3;

public class Cylinder extends SolidOfRevolution{

    private double height;

    public Cylinder(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getVolume() {
        return 3.14 * (getRadius()*getRadius()) * getHeight();
    }
}
