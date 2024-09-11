package Vector1;

import examples_Oleg.Vector;

public class Main {
    public static void main(String[] args) {
        Vectors v1 = new Vectors(2,4,6);
        Vectors v2 = new Vectors(3,5,7);

        Service v3 = new Service();
        System.out.println(v3.scalMyltip(v1,v2));
        System.out.println(v3.scalMyltipToAnotherVec(v1,v2));
        System.out.println(v3.scalMyltipToAnotherVec(v1,v2));
        System.out.println(v3.lengthVector(v1));
        System.out.println(v3.lengthVector(v2));
    }
}
