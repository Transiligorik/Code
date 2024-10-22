package task2;

public class Product {

    private final String name;
    private final double productPrice;

    public Product(String name, double productPrice) {
        this.name = name;
        this.productPrice = productPrice;
    }

    public String getName() {
        return name;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        return "Product is a : " + getName() + ", his price: " + getProductPrice();
    }

    
    public boolean equals(Product product) {
        return this.getName() == product.getName();
    }
}
