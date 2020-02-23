package day53_review_poly_intro;

import com.sun.security.jgss.GSSUtil;

public class AppleStore {
    public static void main(String[] args) {
        //AppleDevice appDev = new AppleDevice() // Cannot instantiate

        AppleWatch iWatch = new AppleWatch();
        iWatch.name = "Apple Watch";
        iWatch.series = 5;
        iWatch.use();
        iWatch.wear();
        iWatch.countSteps();

        System.out.println("----------------------");
        IPhone iPhone = new IPhone();
        iPhone.name= "iPhone";
        iPhone.model="11 Pro";
        iPhone.use();
        iPhone.wear();
        iPhone.code();
        iPhone.navigation();

        System.out.println("----------------------");
        MacPro macPro = new MacPro();
        macPro.name= "MacPro";
        macPro.model="Cheese Grater";
        macPro.use();
        macPro.code();
        macPro.useAsServer();

    }
}
