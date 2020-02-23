package day48_overriding;

public class Cat extends Animal {

    @Override       // Verify that move method is overridden
    public void speak(){
        System.out.println("Cat is saying Meow!");
    }

    @Override
    public void move(){
        System.out.println("Cat is running fast");
    }

    @Override
    public void eat(String food){
        System.out.println("Cat is eating "+food+"...");
    }

}
