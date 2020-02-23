package day42_encapsulation;

public class People {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.toString());
        p1.setName("Vasyl");
        System.out.println("p1.getName() = " + p1.getName());
        System.out.println(p1.toString());
        p1.setName("");
        System.out.println("p1.getName() = " + p1.getName());
        p1.setName("Sarah");
        System.out.println("p1.getName() = " + p1.getName());

        System.out.println("---------------------------");
        p1.setAge(35);
        System.out.println("p1.getAge() = " + p1.getAge());
        p1.setAge(0);
        System.out.println("p1.getAge() = " + p1.getAge());
        p1.setAge(-1);
        System.out.println("p1.getAge() = " + p1.getAge());

    }
}
