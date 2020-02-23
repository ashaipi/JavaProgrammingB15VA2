package day07_operators_casting_boolean_if;

public class IncrementDecrementOperator {
    public static void main(String[] args) {
        int myNumber=100;
        System.out.println("My Number: "+myNumber);
        myNumber++;
        System.out.println("My Number: "+myNumber);
        ++myNumber;
        System.out.println("My Number: "+myNumber++);

        int booksToRead = 5;
        System.out.println("Books to Read: "+booksToRead);

        booksToRead--;
        System.out.println("Books to Read: "+booksToRead);

        --booksToRead;
        System.out.println("Books to Read: "+booksToRead);

        char letter='A';
        System.out.println("Letter: "+letter);

        letter++;
        System.out.println("Letter: "+letter);

        ++letter;
        ++letter;
        System.out.println("Letter: "+letter);

        char myChar='!';
        System.out.println("My char: "+myChar);

        myChar++;
        System.out.println("My char: "+myChar);

        myChar+=10;
        System.out.println("My char: "+myChar);

    }
}
