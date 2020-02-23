package day53_review_poly_intro;

public class IPhone extends AppleDevice implements Codeable, Wearable{
    public String model;


    public void  navigation(){
        System.out.println("iPhone - navigating using GoogleMap");
    }


    @Override
    public void use(){
        System.out.println(name+" model "+model+" - using to call, text, play games");
    }

    @Override
    public void code(){
        System.out.println(name+" model "+model+" - coding java in repl.it, coding ");
    }

    @Override
    public void wear(){
        System.out.println(name+" model "+model+" - wearable");
    }


}
