package day48_overriding;

public class Horse extends Animal{

    @Override
    public void speak(){
        System.out.println("Cat is saying EeHahahaha!");
    }

    @Override
    public void move(){
        System.out.println("Cat is running ");
    }

    @Override
    public void eat(String food){
        System.out.println("Horse is eating "+food+"...");
    }
}
