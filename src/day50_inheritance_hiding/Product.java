package day50_inheritance_hiding;

public class Product {
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
