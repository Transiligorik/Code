package task3;

public class Cylinder extends SolidOfRevolution{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        double volume = super.getVolume();
        volume = getRadius() * 3.14 * height;
    }
}