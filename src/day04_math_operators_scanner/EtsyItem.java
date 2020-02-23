package day04_math_operators_scanner;

public class EtsyItem {
    public static void main(String[] args) {
        String title="Soup Cook Off Personalized Wooden",
               seller="PersonalizedGallery";
        double stars=5.0, price=8.00;
        int    ratingCount=8901;
        boolean bestSeller=true, freeShipping=true;

        System.out.println("Item title is  "+title);
        System.out.println("Seller name is <"+seller+">");
          System.out.print("Product has    "+(char)9733+""+(char)9733+""+(char)9733+""+(char)9733+""+(char)9733);
        System.out.println((char)9734);
        System.out.println("Product has    "+stars+" stars");
        System.out.println("Product has    "+ratingCount+" rating!");
        System.out.println("Price is       $"+price);
        System.out.println("Best seller is "+bestSeller);
        System.out.println("Is it free shipping? -"+freeShipping+" Great!");

        //###################################################################

        String city1="New York",city2="Chicago";
        double ticketPrice = 285.99;

        //From New York to Chicago is $285.99;
        System.out.println("\nFrom "+city1+" to "+city2+" is $"+ticketPrice);
        int a=10,b=20,max;
        max = (a > b) ? a : b;
        System.out.println((a > b) ? a : b);



    }
}
