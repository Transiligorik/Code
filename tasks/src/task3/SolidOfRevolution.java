package task3;

public abstract class SolidOfRevolution extends Shape {

    protected double radius;

    public SolidOfRevolution(double radius, double volume) {
        super(volume);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}