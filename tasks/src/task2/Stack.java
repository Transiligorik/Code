package task2;

public class Stack {
    private final Product product;

    private final int productPieces;

    Stack(Product product, int productPieces) {
        this.product = product;
        this.productPieces = productPieces;
    }

    public int getProductPieces() {
        return productPieces;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Stack : is have a " + product.getName() + ", his pieces: " + getProductPieces();
    }
}
