package day45_static_2;

public class ParkingLot {
    public static void main(String[] args) {
        System.out.println("Number of Vehicles: "+Vehicle.numberOfVehicles);
        Vehicle v1 = new Vehicle("tesla cybertruck");
        System.out.println("Number of Vehicles: "+Vehicle.numberOfVehicles);
        System.out.println("Number of Vehicles: "+v1.numberOfVehicles);

        Vehicle v2 = new Vehicle("Ford F150");
        System.out.println("Number of Vehicles: "+Vehicle.numberOfVehicles);
        System.out.println("Number of Vehicles: "+v1.numberOfVehicles);
        System.out.println("Number of Vehicles: "+v2.numberOfVehicles);

        Vehicle v3 = new Vehicle("Chevy Silverado");
        System.out.println("Number of Vehicles: "+v3.numberOfVehicles);

        System.out.println(v1.getModel());
        System.out.println(v2.getModel());
        System.out.println(v3.getModel());





    }
}
