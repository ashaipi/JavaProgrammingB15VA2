package day50_inheritance_hiding;

public class Car {
    private String model;
    Engine engine;

    public Car() {}

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;  // car HAS-A engine
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + "', engine=" + engine + '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
