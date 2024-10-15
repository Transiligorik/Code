package task3;

public class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(radius);
        volume = getRadius() *  4 * 3.14;
    }
}