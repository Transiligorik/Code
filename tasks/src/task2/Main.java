package task2;

public class Main {

    public static void main(String[] args) {

        Product balls = new Product("Balls", 200);
        Product toys = new Product("Toys", 3500);
        Product guns = new Product("Guns", 5500);
        Product friends = new Product("Друзья",1);

        Stack st1 = new Stack(balls, 50);
        Stack st2 = new Stack(balls, 50);
        Stack st3 = new Stack(guns, 70);
        Stack st4 = new Stack(friends, 1);

//        System.out.println(String.valueOf(st1.hashCode()));
//        System.out.println(String.valueOf(st2.hashCode()));


        Composition composition = new Composition();
        composition.addStack(st1);
        composition.addStack(st2);
        System.out.println(composition);
        System.out.println(composition.calculateCostAllProducts());
        System.out.println(composition.calculateCostProductAtStack(balls));
        System.out.println(composition.calculateAmountAllProducts());
        System.out.println(composition.calculateMostExpensiveProduct());
        System.out.println(composition.searchMinPriceProduct());
        System.out.println(composition);
    }
}
