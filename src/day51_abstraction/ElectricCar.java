package day51_abstraction;

public abstract class ElectricCar {
    String model;
    double price;
    String color;

    @Override
    public String toString() {
        return "Electric Vehicle{model='" + model + "', price=" + price +", color='" + color + "'}";
    }

    public abstract void start(); // WHAT TODO, instead of HOW TODO, HIDE Implementation
    public abstract void charge();
    public abstract void drive();

    public void stop(){
        System.out.println("Electric car is stopping by pushing break...");
    }

}
