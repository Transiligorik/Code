package task2;

public class Composition {
    private Stack[] amountStacks = new Stack[100];

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

    public int calculateAmountAllProducts(Stack[] arrStacks) {
        int amountCounter = 0;
        for(int i = 0; i < arrStacks.length; i++) {
            amountCounter += arrStacks[i].getProductAmount();
        }
        return amountCounter;
    }

    public void addArrStack(Stack stack) {
        amountStacks = new Stack[amountStacks.length + 1];
        amountStacks[amountStacks.length - 1] = stack;
    }

    public double calculateCostProductAtStack(Product pr) {
        for(int i = 0; i < amountStacks.length; i++) {
            if(pr.getName().equals(amountStacks[i].getProduct().getName())) {
                return amountStacks[i].getProductAmount() * amountStacks[i].getProduct().getProductPrice();
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

//    public Stack[] addNewProductsToComposition(Stack stack) {
//        compositionWithNewProduct = Arrays.copyOf(newArrayIsStacks, newArrayIsStacks.length + 1);
//        compositionWithNewProduct[compositionWithNewProduct.length - 1] = stack;
//        return compositionWithNewProduct;
//    }
}
