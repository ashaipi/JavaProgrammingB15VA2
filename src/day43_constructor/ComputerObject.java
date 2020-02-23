package day43_constructor;

import java.util.Arrays;

public class ComputerObject {
    public static void main(String[] args) {
        Computer mac = new Computer();
        Computer lenovo = new Computer("Lenovo flex 15","Windows 10",1099.99);

        System.out.println("mac = " + mac);
        System.out.println("lenovo = " + lenovo);

        Computer[] compArray = new Computer[3];
        compArray[0] = new Computer("hp 14-DK0002DX","Windows 10", 219.99);
        Computer dellInsp = new Computer("Dell Inspiron","Windows 10", 349.99);
        compArray[1] = dellInsp;
        compArray[2] = new Computer("Macbook Pro 16in","MacOS Catalina",2599.99);

        System.out.println(Arrays.toString(compArray));
    }
}
