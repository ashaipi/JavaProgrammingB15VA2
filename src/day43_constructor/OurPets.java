package day43_constructor;

public class OurPets {
    public static void main(String[] args) {
        Pet shrek = new Pet();
        shrek.setType("dog");
        shrek.setName("Shrek");
        System.out.println("shrek.toString() = " + shrek.toString());
        System.out.println("shrek.getType() = " + shrek.getType());
        System.out.println(shrek.feed());
    }
}
