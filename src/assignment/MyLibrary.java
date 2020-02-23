package assignment;
import java.util.ArrayList;

public class MyLibrary {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        Book b4 = new Book();
        b1.title = "The Little Prince";
        b1.author = "Antoine de Saint-Exupéry";
        b1.pageCount = 70;
        b1.printInfo();
        b2.printInfo();
        System.out.println("##################");
        Book[] myCollection = new Book[]{b1, b2, b3, b4};
        for (Book b : myCollection) {
            b.printInfo();
        }
        ArrayList<Book> myCollectionList = new ArrayList<>();
        myCollectionList.add(b1);
        myCollectionList.add(b2);
        myCollectionList.add(b3);
        myCollectionList.add(b4);
    }
}