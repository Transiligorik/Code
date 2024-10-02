package task3;

public class Ball extends SolidOfRevolution{

    public Ball (double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
      return   4 * 3.14 * (getRadius()*getRadius());
    }

}
