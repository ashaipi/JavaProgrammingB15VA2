package day63_last_day;

public class TestImmutable {
    public static void main(String[] args) {
        // new object of Immutable class
        ImmutableClass imObj = new ImmutableClass("Bye Bye JAVA");

        System.out.println(imObj.toString());
        System.out.println(imObj.getComment());

    }
}
