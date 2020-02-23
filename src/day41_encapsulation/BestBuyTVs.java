package day41_encapsulation;

public class BestBuyTVs {
    public static void main(String[] args) {
        //Create TV object
        
        TV lg = new TV();
        /*
        lg.brand = "LG 1122";
        lg.isOn = false;
        lg.channel = 5;
         */
        lg.setTVInfo("LG 1122", "off", 5);
        System.out.println("lg = " + lg);

        TV sm = new TV();
        sm.setTVInfo("samsung 003", "on", 10);
        System.out.println(sm.toString());

        System.out.println("LG: "+lg.powerState);
        lg.turnOn();
        System.out.println("LG: "+lg.powerState);

        System.out.println("samsung: "+sm.powerState);
        sm.turnOff();
        System.out.println("samsung: "+sm.powerState);
        sm.turnOff();
        System.out.println("samsung: "+sm.powerState);

        TV sony = new TV();
        System.out.println(sony.toString());
        sony.setTVInfo("Sony One", "on", 1);
        System.out.println(sony.toString());

        sony.channelUp();
        System.out.println(sony.toString());

        sony.setChannel(123);
        System.out.println(sony.toString());

        sony.channelDown();
        System.out.println(sony.toString());

    }
}
