package day51_abstraction;

import day51_abstraction.ElectricCar;

public class Tesla extends ElectricCar {
    // public abstract void start();
    public void start(){
        System.out.println("TESLA is starting quietly...");
        System.out.println("TESLA - Change to Drive mode...");
    }

    // public abstract void charge();
    public void charge(){
        System.out.println("TESLA Charging - Plugin to Electric outlet");
    }

    @Override
    public void drive() {
        System.out.println("TESLA is Driving");
    }
}
