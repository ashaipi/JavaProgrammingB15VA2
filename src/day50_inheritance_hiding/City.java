package day50_inheritance_hiding;

public class City {
    public int count;

    private String name;

    public City() {
        name = "undefined";
    }

    public void letsBuildARoad(){
        System.out.println("City - lets build a road");
        buildARoad();
    }

    public static void buildARoad(){
        System.out.println("City - building a road...");
    }

    @Override
    public String toString() {
        return "City{name='" + name + "'}";
    }

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
