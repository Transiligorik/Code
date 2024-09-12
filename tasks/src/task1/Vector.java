package task1;

import java.util.Arrays;

import static java.lang.Math.abs;

public class Vector{
    private int x;
    private int y;
    private int z;

    Vector(){};

    public Vector(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public int getZ(){
        return this.z;
    }

    public double lengthVector(){
        double result = (int) Math.sqrt((int) Math.pow(getX(),getX()) +(int) Math.pow(getY(),getY()) + (int) Math.pow(getZ(),getZ()));
        return result;
    }

    public int scalMyltip(Vector v){
        int x = this.getX()*v.getX();
        int y = this.getY()*v.getY();
        int z = this.getZ()*v.getZ();
        return x+y+z;
    }

    public Vector scalMyltipToAnotherVec(Vector v){
        int x = this.getY()*v.getZ() - this.getZ()*v.getY();
        int y = this.getZ()*v.getX() - this.getX()*v.getZ();
        int z = this.getX()*v.getY() - this.getY()*v.getX();
        return new Vector(x,y,z);
    }

    public double calculateCorner(Vector v1, Vector v2){
        double a = v1.lengthVector();
        double b = v2.lengthVector();
        double v3 = v1.scalMyltip(v2);
        return v3/(abs(a*b));
    }

    public Vector calculateSumma(Vector v){
        int x = this.getX() + v.getX();
        int y = this.getY() + v.getY();
        int z = this.getZ() + v.getZ();
        return new Vector(x,y,z);
    }

    public Vector calculateSubtraction(Vector v){
        int x = this.getX() - v.getX();
        int y = this.getY() - v.getY();
        int z = this.getZ() - v.getZ();
        return new Vector(x,y,z);
    }

    private static int randomNumber(){
        int randomValue = (int) (Math.random() * 10);
        return randomValue;
    }

    public static Vector[] randomSizeArray(int n){

        Vector[] vector = new Vector[n];

        for(int i = 0; i < n; i++){
            int x = randomNumber();
            int y = randomNumber();
            int z = randomNumber();
            Vector v = new Vector(x,y,z);
            vector[i] = v;
        }
        return vector;
    }

}

class VectorTest{
    public static void main(String[] args){

        Vector v1 = new Vector(2,4,6);
        Vector v2 = new Vector(3,5,7);

        System.out.println(v1.lengthVector());
        System.out.println(v2.lengthVector());

        Vector v3 = new Vector();

        System.out.println(v1.calculateSumma(v2));
        System.out.println(v3.calculateCorner(v1,v2));
        System.out.println(Arrays.toString(Vector.randomSizeArray(5)));
        System.out.println(v1.calculateSubtraction(v2));
        System.out.println(v2.calculateSubtraction(v1));
        System.out.println(v1.scalMyltip(v2));
        System.out.println(v1.scalMyltipToAnotherVec(v2));
        System.out.println(v2.scalMyltipToAnotherVec(v1));

    }
}
