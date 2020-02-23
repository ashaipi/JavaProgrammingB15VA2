package day40_custom_classes;

public class Product {
    // properties of the product. we declare them in the class and outside any method.
    String title;
    double price;
    int rating;
    String seller;

    public void displayInfo(){
        System.out.println("--- Product Info ---");
        System.out.println("title  = " + title);
        System.out.println("price  = $" + price);
        System.out.println("rating = " + rating);
        System.out.println("seller = " + seller);
        System.out.println("--------------------");
    }

    // We can add main method in same class and create objects
    public static void main(String[] args) {
        // create object from product class
        Product prod1 = new Product();
        // assign values to variables in the object
        prod1.title = "woodwn spoon";
        prod1.price = 14.99;
        prod1.rating = 5;
        prod1.seller = "Memento";
        System.out.println("prod1.title  = " + prod1.title);
        System.out.println("prod1.price  = " + prod1.price);
        System.out.println("prod1.rating = " + prod1.rating);
        System.out.println("prod1.seller = " + prod1.seller);
    }
    
        /*
    title = "plastic spoon";
    price = 3.99;
    rating = 4;
    seller = "Memento";
     */
}
