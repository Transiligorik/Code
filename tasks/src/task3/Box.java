package task3;

import java.util.ArrayList;
import java.util.List;

public class Box extends Shape{

    private List<Shape> listShape = new ArrayList<>();

    private double count = 0;

    public double getCount() {
        return count;
    }

    public Box(double volume){
        super(volume);
    }

    boolean add(Shape shape) {
        count += shape.getVolume();
        if(count < this.getVolume()) {
            listShape.add(shape);
            return true;
        }
        return false;
    }
}