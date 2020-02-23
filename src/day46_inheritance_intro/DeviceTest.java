package day46_inheritance_intro;

public class DeviceTest extends TV {
    public static void main(String[] args) {
        Device device = new Device();
        device.brand = "LG";
        device.price = 900;
        device.country = "South Korea";
        device.use();
        TV tv = new TV();
        tv.brand = "Sony";
        tv.price = 800;
        tv.country = "Japan";
        tv.screenSize = 66;
        tv.isSmart = true;
        tv.use();
        tv.watch();
        Phone phone = new Phone();
        phone.brand = "Apple iPhone";
        phone.price = 912.99;
        phone.country = "China";
        phone.carrier = "Sprint";
        phone.use();
        phone.call();
        phone.text("java is fun!");
    }
}
