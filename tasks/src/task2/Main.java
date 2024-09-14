package task2;

public class Main {

    public static void main(String[] args) {

        Product balls = new Product("Balls", 200);
        Product toys = new Product("Toys", 3500);
        Product guns = new Product("Guns", 5500);

        Stack st1 = new Stack(balls, 50);
        Stack st2 = new Stack(toys, 10);
        Stack st3 = new Stack(guns, 70);

        Composition composition = new Composition();
        Stack[] arr = composition.arrStacks(st1,st2,st3);
        System.out.println(composition);
        System.out.println(composition.costAllProducts(arr));
        System.out.println(composition.costProductAtStack(st2));
        System.out.println(composition.amountAllProducts(arr));
        System.out.println(composition.mostExpensiveProduct(arr));
        System.out.println(composition.mostCheapestProduct(arr));
        System.out.println(composition.addNewProductsToComposition("Friends", 1));

    }
}
