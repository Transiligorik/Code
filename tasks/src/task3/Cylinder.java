package task3;

public class Cylinder extends SolidOfRevolution{

    private double height;

    public Cylinder(double height) {
        super(10);
        volume = getRadius() * 3.14 * height;
    }
}