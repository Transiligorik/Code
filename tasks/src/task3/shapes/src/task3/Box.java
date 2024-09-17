package task3;

public class Box extends Shape{

    double size ;
    static double countVolume = 0;

    public Box(double size) {
        this.size = size;
    }

    public boolean addShapes(Shape sh) {
        boolean flag = false;
        countVolume += sh.getVolume();
        if(countVolume <= size) {
             flag =  true;
        }
        System.out.println(countVolume);
        return flag;
    }

    public static void main(String[] args) {
        Shape shapeBall = new Ball(7);
        Shape shapePyramide = new Pyramid(5.0, 4.5);
        Shape shapeCylindre = new Cylinder(3);

        Box box = new Box(621);
//      shapePyramide.toString(); ----- почему не переопределился метод

        System.out.println(box.addShapes(shapeCylindre));

        System.out.println(box.addShapes(shapeBall));

        System.out.println(box.addShapes(shapePyramide));
    }
}
