package day53_review_poly_intro;

public class MacPro extends AppleDevice implements Codeable{
    public String model;

    public void useAsServer(){
        System.out.println(name+" model "+model+" - using as application server...");
    }

    @Override
    public void use() {
        System.out.println(name+" model "+model+" - using graphics design, movies....");
    }

    @Override
    public void code() {
        System.out.println(name+" model "+model+" - coding Java in IntelliJ...");
    }
}
