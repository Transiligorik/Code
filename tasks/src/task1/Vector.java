package task1;

import java.util.ArrayList;

public class Vectors {
    private int x;
    private int y;
    private int z;

    Vectors(){};

    public Vectors(int x, int y, int z) {
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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int lengthVector(){
        int result = (int) Math.sqrt((int) Math.pow(getX(),2) +(int) Math.pow(getY(),2) + (int) Math.pow(getZ(),2));
        return result;
    }

    public int scalMyltip(task1.Vectors v1, task1.Vectors v2) {
        int x = v1.getX()*v2.getX();
        int y = v1.getY()*v2.getY();
        int z = v1.getZ()*v2.getZ();
        return (x+y+z);
    }

    public task1.Vectors scalMyltipToAnotherVec(task1.Vectors v1, task1.Vectors v2){
        int x = v1.getY()*v2.getZ() - v1.getZ()*v2.getY();
        int y = v1.getZ()*v2.getX() - v1.getX()*v2.getZ();
        int z = v1.getX()*v2.getY() - v1.getY()*v2.getX();
        return new task1.Vectors(x,y,z);
    }

    public int calculateCorner(int v3, int a, int b){
        return v3/(a*b);
    }

    public task1.Vectors calculateSumma(task1.Vectors v1, task1.Vectors v2){
        int x = v1.getX() + v2.getX();
        int y = v1.getY() + v2.getY();
        int z = v1.getZ() + v2.getZ();
        return new task1.Vectors(x,y,z);
    }

    public task1.Vectors calculateSubtraction(task1.Vectors v1, task1.Vectors v2){
        int x = v1.getX() - v2.getX();
        int y = v1.getY() - v2.getY();
        int z = v1.getZ() - v2.getZ();
        return new task1.Vectors(x,y,z);
    }

    public static int randomVector(){
        int minValue = 1;
        int maxValue = 10;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        return randomValue;
    }

    public static ArrayList<task1.Vectors> randomSizeArray(int n){

        ArrayList<task1.Vectors> arr = new ArrayList<task1.Vectors>(n);

        for(int i = 0; i < n; i++){
            int x = randomVector();
            int y = randomVector();
            int z = randomVector();
            task1.Vectors v = new task1.Vectors(x,y,z);
            arr.add(v);
        }
        return arr;
    }
}

class VectorTest{
    public static void main(String[] args) {

        task1.Vectors v1 = new task1.Vectors(2,4,6);
        task1.Vectors v2 = new task1.Vectors(3,5,7);

        System.out.println(v1.lengthVector());
        System.out.println(v2.lengthVector());

        task1.Vectors v3 = new task1.Vectors();

        System.out.println(v3.scalMyltip(v1,v2));
        System.out.println(v3.scalMyltipToAnotherVec(v1,v2));
        System.out.println(v3.scalMyltipToAnotherVec(v1,v2));

    }
}
