package task2;

public class Composition {
    int amountStacks;

    @Override
    public String toString() {
        return "Всего на складе стеллажей: " +  amountStacks;
    }

    public Stack[] arrStacks(Stack... stack) {
        Stack[] newArrayIsStacks = new Stack[stack.length];
        for(int i = 0; i < stack.length; i++) {
            newArrayIsStacks[i] = stack[i];
        }
        amountStacks = newArrayIsStacks.length;
        return newArrayIsStacks;
    }

    public double costAllProducts(Stack[] arrStacks) {
        double sum = 0;
        for(int i = 0; i < arrStacks.length; i++) {
            sum += arrStacks[i].getProductPieces() * arrStacks[i].getProduct().getProductPrice();
        }
        return sum;
    }

    public double costProductAtStack(Stack stack) {
        return stack.getProductPieces() * stack.getProduct().getProductPrice();
    }

    public int amountAllProducts(Stack[] arrStacks) {
        int amountCounter = 0;
        for(int i = 0; i < arrStacks.length; i++) {
            amountCounter += arrStacks[i].getProductPieces();
        }
        return amountCounter;
    }

    public double mostExpensiveProduct(Stack[] arrStacks) {

        double expensiveProduct = arrStacks[0].getProduct().getProductPrice();

        for(int i = 1; i < arrStacks.length; i++) {
            if(expensiveProduct < arrStacks[i].getProduct().getProductPrice()) {
                expensiveProduct = arrStacks[i].getProduct().getProductPrice();
            }
        }
        return expensiveProduct;
    }

    public double mostCheapestProduct(Stack[] arrStacks) {

        double cheapestProduct = arrStacks[0].getProduct().getProductPrice();

        for(int i = 1; i < arrStacks.length; i++) {
            if(cheapestProduct > arrStacks[i].getProduct().getProductPrice()) {
                cheapestProduct = arrStacks[i].getProduct().getProductPrice();
            }
        }
        return cheapestProduct;
    }

    public Product addNewProductsToComposition(String name, double productPrice) {
        return new Product(name, productPrice);
    }
}
