package task3;

public class Pyramid extends SolidOfRevolution {

    private double s;
    private double h;

    public Pyramid(double s, double h) {
        this.s = s;
        this.h = h;
    }

    public double getS(){
        return s;
    }

    public double getH() {
        return h;
    }

    @Override
    public double getVolume() {
        return  0.33 * getH() * getS();
    }

    @Override
    public String toString() {
        return " ОБъём пирамиды : " +  getVolume();
    }
}
