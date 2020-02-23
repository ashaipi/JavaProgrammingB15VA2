package day50_inheritance_hiding;
import java.util.*;

public class Shop {
    String name;
    List<Product> product = new ArrayList<>();

}

class ShopObjects{
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.name = "CVS";
        shop.product.add(new Product("Vitamin", 5.99));
        shop.product.add(new Product("water", 2.99));
        shop.product.add(new Product("Advil", 6.99));

        System.out.println(shop.product.toString());

    }
}
