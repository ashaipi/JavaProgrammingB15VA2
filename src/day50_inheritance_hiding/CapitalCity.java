package day50_inheritance_hiding;

// CapitalCity IS-A City
public class CapitalCity extends City {
    public int count;

    private String country;
    private long population;

    public CapitalCity() {
        super();
    }

    public CapitalCity(String name, String country, long population){
        // super(name);   // call super class constructor
        // this.country = country;
        // this.population = population;
        setName(name);
        setCountry(country);
        setPopulation(population);

    }

    public void letsBuildARoadInCapital(){
        System.out.println("Capital city - lets build a road");
        buildARoad();
    }

    // Method hiding
    public static void buildARoad(){
        System.out.println("Capital city - building a road...");
    }

    @Override
    public String toString() {
        return super.toString()+", CapitalCity{country='" + country + "', population=" + population +'}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
