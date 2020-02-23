package day51_abstraction;

import day51_abstraction.ElectricCar;

public class Ford extends ElectricCar {

    @Override
    public void start() {
        System.out.println("FORD - Push Start button to start...");
    }

    @Override
    public void charge() {
        System.out.println("FORD - Plugin to electric outlet...");
    }

    @Override
    public void drive() {
        System.out.println("FORD is driving");
    }
}
