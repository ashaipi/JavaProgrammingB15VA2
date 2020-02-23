package day41_encapsulation;

public class TV {
    String brand;
    String powerState; //on off
    int channel;

    public void setTVInfo(String pBrand, String pPowerState, int pChannel){
        System.out.println("INFO: setting TV information..");
        brand = pBrand;
        powerState = pPowerState;
        channel = pChannel;
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", powerState='" + powerState + '\'' +
                ", channel=" + channel +
                '}';
    }

    public void turnOn(){
        if(powerState.equals("off")) System.out.println("INFO: Turning ON ["+brand+"] TV");
        else System.out.println(brand+" is already on!");
        powerState="on";
    }

    public void turnOff(){
        if(powerState.equals("on")) System.out.println("INFO: Turning OFF ["+brand+"] TV");
        else System.out.println(brand+" is already off!");
        powerState="off";
    }

    public void setChannel(int newChannel){
        System.out.println("INFO: Changing channel ...");
        channel=newChannel;
    }

    public void channelUp(){
        System.out.println("INFO: next channel ...");
        channel++;
    }

    public void channelDown(){
        System.out.println("INFO: previous channel ...");
        channel--;
    }

}
