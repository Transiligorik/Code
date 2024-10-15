package task3;

public class Main {
    public static void main(String[] args) {
        Shape shapeBall = new Ball(2);
        Shape shapePyramide = new Pyramid(5.0, 4.5);
        Shape shapeCylindre = new Cylinder(3.0, 5);

        Box box = new Box(2000);

        System.out.println(box.add(shapeBall));
        System.out.println(box.getCount());
        System.out.println(shapeBall.getVolume());

        System.out.println(box.add(shapeCylindre));
        System.out.println(box.getCount());
        System.out.println();

        System.out.println(box.add(shapePyramide));
        System.out.println(box.getCount());
    }
}
