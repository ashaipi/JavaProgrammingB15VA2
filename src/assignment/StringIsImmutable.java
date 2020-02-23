package assignment;

public class StringIsImmutable {
    public static void main(String[] args) {
        String name1 = new String("Abubaker").intern();
        String name2 = "Ashaipi";
        String name3 ="Abubaker";

        //name1 = "Ali";

        name1.concat(" Ashaipi");
        System.out.println("name1 = " + name1);
        System.out.println("name2 = " + name2);
        System.out.println("name3 = " + name3);

        System.out.println(name1==name2);
        System.out.println(name1==name3);
        System.out.println(name2==name3);
    }
}
