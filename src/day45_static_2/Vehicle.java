package day45_static_2;

public class Vehicle {
    /*
    create a package day45_static_2
    Create a class Vehicle
    - private String model;
    - public static int numberOfVehicles=0;
    //getter/setter/2 constructor/toString
     */
    private String model;
    public static int numberOfVehicles=0;

    public void Vehicle() {
        System.out.println("Parking a Unknown model vehicle");
        numberOfVehicles++;
    }

    public Vehicle(String model) {
        System.out.println("Parking a Unknown model vehicle");
        this.model = model;
        numberOfVehicles++;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString() {
        return "Vehicle{model='" + model + "' }";
    }
}
