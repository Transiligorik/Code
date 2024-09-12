package task1;

import java.util.Arrays;

import static java.lang.Math.abs;

public class Vector {
    private int x;
    private int y;
    private int z;

    Vector() {};

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public int lengthVector() {
        int result = (int) (Math.sqrt((int) Math.pow(getX(),getX()) + (int) Math.pow(getY(),getY()) + (int) Math.pow(getZ(),getZ())));
        return Math.round(result);
    }

    public int scalMyltip(task1.Vector v) {
        int x = this.getX() * v.getX();
        int y = this.getY() * v.getY();
        int z = this.getZ() * v.getZ();
        return x + y + z;
    }

    public task1.Vector scalMyltipToAnotherVec(task1.Vector v) {
        int x = this.getY() * v.getZ() - this.getZ() * v.getY();
        int y = this.getZ() * v.getX() - this.getX() * v.getZ();
        int z = this.getX() * v.getY() - this.getY() * v.getX();
        return new task1.Vector(x,y,z);
    }

    public int calculateCorner(task1.Vector v) {
        int a = this.lengthVector();
        int b = v.lengthVector();
        int v3 = this.scalMyltip(v);
        return v3/(abs(a * b));
    }

    public task1.Vector calculateSumma(task1.Vector v) {
        int x = this.getX() + v.getX();
        int y = this.getY() + v.getY();
        int z = this.getZ() + v.getZ();
        return new task1.Vector(x,y,z);
    }

    public task1.Vector calculateSubtraction(task1.Vector v) {
        int x = this.getX() - v.getX();
        int y = this.getY() - v.getY();
        int z = this.getZ() - v.getZ();
        return new task1.Vector(x,y,z);
    }

    private static int randomNumber() {
        int randomValue = (int) (Math.random() * 10);
        return randomValue;
    }

    public static task1.Vector[] randomSizeArray(int n) {

        task1.Vector[] vector = new task1.Vector[n];

        for(int i = 0; i < n; i++) {
            int x = randomNumber();
            int y = randomNumber();
            int z = randomNumber();
            task1.Vector v = new task1.Vector(x,y,z);
            vector[i] = v;
        }
        return vector;
    }

}

class VectorTest{
    public static void main(String[] args) {

        task1.Vector v1 = new task1.Vector(2,4,6);
        task1.Vector v2 = new task1.Vector(3,5,7);

        System.out.println(v1.lengthVector());
        System.out.println(v2.lengthVector());

        task1.Vector v3 = new task1.Vector();
        System.out.println(v1.calculateSumma(v2));
        System.out.println(v3.calculateCorner(v1));
        System.out.println(Arrays.toString(task1.Vector.randomSizeArray(5)));
        System.out.println(v1.calculateSubtraction(v2));
        System.out.println(v2.calculateSubtraction(v1));
        System.out.println(v1.scalMyltip(v2));
        System.out.println(v1.scalMyltipToAnotherVec(v2));
        System.out.println(v2.scalMyltipToAnotherVec(v1));

    }
}
