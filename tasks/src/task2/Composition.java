package task2;

import java.util.Arrays;

public class Composition {
    Stack[] amountStacks;
    Stack[] newArrayIsStacks;
    Stack[] compositionWithNewProduct;

    @Override
    public String toString() {
        if (compositionWithNewProduct != null) {
            return "Всего на складе стеллажей: " + compositionWithNewProduct.length;
        } else {
            return "Всего на складе стеллажей: " + newArrayIsStacks.length;
        }
    }

    public double calculateCostAllProducts() {
        double sum = 0;
        for(int i = 0; i < newArrayIsStacks.length; i++) {
            sum += newArrayIsStacks[i].getProductAmount() * newArrayIsStacks[i].getProduct().getProductPrice();
        }
        return sum;
    }

    public int calculateAmountAllProducts(Stack[] arrStacks) {
        int amountCounter = 0;
        for(int i = 0; i < arrStacks.length; i++) {
            amountCounter += arrStacks[i].getProductAmount();
        }
        return amountCounter;
    }

    public Stack[] addArrStacks(Stack... stack) {
        newArrayIsStacks = new Stack[stack.length];
        for(int i = 0; i < stack.length; i++) {
            newArrayIsStacks[i] = stack[i];
        }
        amountStacks = new Stack[newArrayIsStacks.length];
        return newArrayIsStacks;
    }

    public double calculateCostProductAtStack(Product pr) {
        for(int i = 0; i < newArrayIsStacks.length; i++) {
            if(pr.getName().equals(newArrayIsStacks[i].getProduct().getName())) {
                return newArrayIsStacks[i].getProductAmount() * newArrayIsStacks[i].getProduct().getProductPrice();
            }
        }
        return 0;
    }

    public double calculateMostExpensiveProduct(Stack[] arrStacks) {

        double expensiveProduct = arrStacks[0].getProduct().getProductPrice();

        for(int i = 1; i < arrStacks.length; i++) {
            if(expensiveProduct < arrStacks[i].getProduct().getProductPrice()) {
                expensiveProduct = arrStacks[i].getProduct().getProductPrice();
            }
        }
        return expensiveProduct;
    }

    public double searchMinPriceProduct(Stack[] newArrayIsStacks) {
        double minPriceProduct = newArrayIsStacks[0].getProductAmount() * newArrayIsStacks[0].getProduct().getProductPrice();
        for(int i = 1; i < newArrayIsStacks.length; i++) {
            double iteratorPriceProduct = newArrayIsStacks[i].getProductAmount() * newArrayIsStacks[i].getProduct().getProductPrice();
            if(minPriceProduct > iteratorPriceProduct) {
                minPriceProduct = iteratorPriceProduct;
            }
        }
        return minPriceProduct;

    }

    public Stack[] addNewProductsToComposition(Stack stack) {
        compositionWithNewProduct = Arrays.copyOf(newArrayIsStacks, newArrayIsStacks.length + 1);
        compositionWithNewProduct[compositionWithNewProduct.length - 1] = stack;
        return compositionWithNewProduct;
    }
}
