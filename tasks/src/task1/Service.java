package Vector1;

import examples_Oleg.Vector;

import java.util.ArrayList;

public class Service {

    public int scalMyltip(Vectors v1,Vectors v2) {
        int x = v1.getX()*v2.getX();
        int y = v1.getY()*v2.getY();
        int z = v1.getZ()*v2.getZ();
        return (x+y+z);
    }

    public Vectors scalMyltipToAnotherVec(Vectors v1,Vectors v2){
        int x = v1.getY()*v2.getZ() - v1.getZ()*v2.getY();
        int y = v1.getZ()*v2.getX() - v1.getX()*v2.getZ();
        int z = v1.getX()*v2.getY() - v1.getY()*v2.getX();
        return new Vectors(x,y,z);
    }

    public int calculateCorner(int v3, int a, int b){
        return v3/(a*b);
    }

    public int lengthVector(Vectors v){
        int result = (int) Math.sqrt((int) Math.pow(v.getX(),2) +(int) Math.pow(v.getY(),2) + (int) Math.pow(v.getZ(),2));
        return result;
    }

    public Vectors calculateSumma(Vectors v1,Vectors v2){
        int x = v1.getX() + v2.getX();
        int y = v1.getY() + v2.getY();
        int z = v1.getZ() + v2.getZ();
        return new Vectors(x,y,z);
    }

    public static int randomVectorValue(){
        int minValue = 1;
        int maxValue = 10;
        int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
        return randomValue;
    }
    public static Object[] randomSizeArray(int n){

        ArrayList<Vectors> arr = new ArrayList<Vectors>(n);

        for(int i = 0; i < n; i++){
            int x = randomVectorValue();
            int y = randomVectorValue();
            int z = randomVectorValue();
            Vectors v = new Vectors(x,y,z);
            arr.add(v);
        }
        return arr.toArray();
    }
}
