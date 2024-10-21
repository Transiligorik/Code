package task2;

public class Stack {
    private Product product;
    private int productAmount;

    Stack(Product product, int productPieces) {
        this.product = product;
        this.productAmount = productPieces;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Stack : is have a " + product.getName() + ", his pieces: " + getProductAmount();
    }

    public double calculateCostAtStack() {
        return productAmount * product.getProductPrice();
    }
}
