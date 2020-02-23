package day43_constructor;

public class CatConstructor {
    public static void main(String[] args) {
        Cat luna = new Cat();
        System.out.println("luna.getName() = " + luna.getName());

        Cat bella = new Cat("Bella");
        System.out.println("bella.getName() = " + bella.getName());

    }
}
