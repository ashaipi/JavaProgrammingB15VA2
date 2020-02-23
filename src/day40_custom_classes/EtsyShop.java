package day40_custom_classes;

public class EtsyShop {
    public static void main(String[] args) {
        Product pObj1 = new Product();
        Product pObj2 = new Product();

        pObj1.title = "woodwn Banana";
        pObj1.price = 4.5;
        pObj1.rating = 5;
        pObj1.seller = "BananaSeller";

        System.out.println("prod1.title  = " + pObj1.title);
        System.out.println("prod1.price  = " + pObj1.price);
        System.out.println("prod1.rating = " + pObj1.rating);
        System.out.println("prod1.seller = " + pObj1.seller);

        pObj2.title = "wool Gloves";
        pObj2.price = 25.44;
        pObj2.rating = 4;
        pObj2.seller = "WoolSeller";

        System.out.println("-----------------------------");
        System.out.println("prod1.title  = " + pObj2.title);
        System.out.println("prod1.price  = " + pObj2.price);
        System.out.println("prod1.rating = " + pObj2.rating);
        System.out.println("prod1.seller = " + pObj2.seller);

        pObj1.displayInfo();
    }
}
