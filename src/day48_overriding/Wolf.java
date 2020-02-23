package day48_overriding;

public class Wolf extends Animal{

    @Override
    public void speak() {
        System.out.println("Wolf is saying Woooooo Woooooooooo");
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void eat(String food){
        System.out.println("Wolf is eating "+food+"...");
    }
}
