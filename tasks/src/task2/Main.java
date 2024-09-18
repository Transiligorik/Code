package task2;

public class Main {

    public static void main(String[] args) {

        Product balls = new Product("Balls", 200);
        Product toys = new Product("Toys", 3500);
        Product guns = new Product("Guns", 5500);
        Product friends = new Product("Друзья",1);

        Stack st1 = new Stack(balls, 50);
        Stack st2 = new Stack(toys, 10);
        Stack st3 = new Stack(guns, 70);
        Stack st4 = new Stack(friends, 1);


        Composition composition = new Composition();
        Stack[] arr = composition.addArrStacks(st1,st2,st3);
        System.out.println(composition);
        System.out.println(composition.calculateCostAllProducts());
        System.out.println(composition.calculateCostProductAtStack(balls));
        System.out.println(composition.calculateAmountAllProducts(arr));
        System.out.println(composition.calculateMostExpensiveProduct(arr));
        System.out.println(composition.searchMinPriceProduct(arr));
        composition.addNewProductsToComposition(st4);
        System.out.println(composition);


    }
}
