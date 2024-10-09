package task3;

public abstract class SolidOfRevolution extends Shape {

    protected double radius;

    public SolidOfRevolution(double radius) {
        this.radius = radius * radius;
    }

    public double getRadius() {
        return radius;
    }

}
