package day51_abstraction;

public class TeslaSemi extends ElectricTruck{
    @Override
    public void load(String item) {
        System.out.println("TESLA SEMI - load "+item+" by lowering the truck and opening door...");
    }

    @Override
    public void start() {
        System.out.println("TESLA SEMI - start truck by pressing a button...");
    }

    @Override
    public void charge() {
        System.out.println("TESLA SEMI - charge for 30 min...");
    }

    @Override
    public void drive() {
        System.out.println("TESLA SEMI - drive");
    }
}
