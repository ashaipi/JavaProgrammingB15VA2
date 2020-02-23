package day53_review_poly_intro;

public class AppleWatch extends AppleDevice implements Wearable {
    int series;

    public void countSteps(){
        System.out.println(name+" series "+series+"- counting each step...");
    }

    @Override
    public void use(){  // AppleDevice
        System.out.println(name+" series "+series+"- using to check time, exercise, HeartRate, ApplePay");
    }

    @Override
    public void wear(){
        System.out.println("AppleWatch series "+series+"- wear in wrist...");
    }
}
