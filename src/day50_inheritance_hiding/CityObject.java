package day50_inheritance_hiding;

public class CityObject {
    public static void main(String[] args) {
        City city = new City("Calamba");
        CapitalCity capital = new CapitalCity("Moscow", "Russia", 20000000);

        System.out.println(city.toString());
        System.out.println(capital.toString());

        // static way of calling: className.methodName
        City.buildARoad();
        CapitalCity.buildARoad();

        System.out.println("--------------------------------------------");
        //call using object
        city.buildARoad();
        capital.buildARoad();

        System.out.println("-------------- TESTING HIDING --------------");
        // Test method hiding
        CapitalCity astana = new CapitalCity("Astana","Kazakhstan", 2000000);
        astana.letsBuildARoad(); // this calling buildARoad which is hidden

        CapitalCity ankara = new CapitalCity("Ankara", "Turkey", 8000000);
        System.out.println("--------------------------------------------");
        ankara.letsBuildARoad();          // code will run in city class
        System.out.println("--------------------------------------------");
        ankara.letsBuildARoadInCapital();

    }
}
