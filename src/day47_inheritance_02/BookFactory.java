package day47_inheritance_02;

public class BookFactory {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("Jamie Chan");
        book.setTitle("Learn Java in one day");
        book.setPrice(11.67);
        book.setType("coding");

        System.out.println("-- BOOK INFO --");
        System.out.println("Author: "+ book.getAuthor());
        System.out.println("Title:  "+book.getTitle());
        System.out.println("Price:  "+book.getPrice());
        System.out.println("Type:   "+book.getType());

        AudioBook audioBook = new AudioBook();
        audioBook.setAuthor("Raoul Gabriel Urma, Mario Fusco");
        audioBook.setTitle("Java 8 in Action");
        audioBook.setPrice(24.95);
        audioBook.setType("Programming");
        audioBook.setLength(4.20);
        audioBook.setNarrator("Ezra Simeloff");

        System.out.println("-- AUDIO BOOK INFO --");
        System.out.println("Author: "+ audioBook.getAuthor());
        System.out.println("Title:  "+audioBook.getTitle());
        System.out.println("Price:  "+audioBook.getPrice());
        System.out.println("Type:   "+audioBook.getType());
        System.out.println("Price:  "+audioBook.getLength());
        System.out.println("Type:   "+audioBook.getNarrator());

        audioBook.listen();

    }
}
