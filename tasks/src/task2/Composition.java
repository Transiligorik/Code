package task2;

import java.util.Arrays;

public class Composition {
    private Stack[] amountStacks = new Stack[0];

    @Override
    public String toString() {
            return "Всего на складе стеллажей: " + amountStacks.length;
    }

    public double calculateCostAllProducts() {
        double sum = 0;
        for(int i = 0; i < amountStacks.length; i++) {
            sum += amountStacks[i].calculateCostAtStack();
        }
        return sum;
    }

    public int calculateAmountAllProducts() {
        int amountCounter = 0;
        for(int i = 0; i < amountStacks.length; i++) {
            amountCounter += amountStacks[i].getProductAmount();
        }
        return amountCounter;
    }

    public void addStack(Stack stack) {
        if(amountStacks.length == 0) {
            amountStacks = new Stack[1];
            amountStacks[0] = stack;
        } else {
            amountStacks = Arrays.copyOf(amountStacks, amountStacks.length + 1);
            amountStacks[amountStacks.length - 1] = stack;
        }
    }

    public double calculateCostProductAtStack(Product product) {
        for(int i = 0; i < amountStacks.length; i++) {
            if(product.equals(amountStacks[i].getProduct().getName())) {
              return amountStacks[i].calculateCostAtStack();
            }
        }
        return 0;
    }

    public double calculateMostExpensiveProduct() {

        double expensiveProduct = amountStacks[0].getProduct().getProductPrice();

        for(int i = 1; i < amountStacks.length; i++) {
            double nextExpensiveProduct = amountStacks[i].getProduct().getProductPrice();
            if(expensiveProduct < nextExpensiveProduct) {
                expensiveProduct = nextExpensiveProduct;
            }
        }
        return expensiveProduct;
    }

    public double searchMinPriceProduct() {
        double minPriceProduct = amountStacks[0].calculateCostAtStack();
        for(int i = 1; i < amountStacks.length; i++) {
            double iteratorPriceProduct = amountStacks[i].calculateCostAtStack();
            if(minPriceProduct > iteratorPriceProduct) {
                minPriceProduct = iteratorPriceProduct;
            }
        }
        return minPriceProduct;
    }
}
