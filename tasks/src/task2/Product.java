package task2;

import java.util.Objects;

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


//    @Override
//    public int hashCode() {
//        int result = 31;
//      result = result * 17 + name.hashCode();
//        return Objects.hash(name);
//    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Product product = (Product) obj;
        return product.name == this.name;
    }
}
