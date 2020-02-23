package day37_arraylist;
import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Mclean");
        cities.add("Alexandria");
        cities.add("Baltimore");
        cities.add("Baku");
        cities.add("Kabul");
        cities.add("Tashkent");
        cities.add("Tehran");
        cities.add("Asmara");
        cities.add(0,"Calamba");
        cities.add(1,"Reston");
        System.out.println(cities);

        cities.add(2,"Yerevan");
        System.out.println(cities);

        cities.set(4,"New York");
        System.out.println(cities);

        cities.set(5,"Samarkand");
        System.out.println(cities);

        cities.remove(3);
        System.out.println(cities);

        cities.remove("New York");
        System.out.println(cities);



    }
}
